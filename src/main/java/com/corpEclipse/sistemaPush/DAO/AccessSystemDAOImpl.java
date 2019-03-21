/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corpEclipse.sistemaPush.DAO;

import com.corpEclipse.sistemaPush.Model.Usuario;
import com.corpEclipse.sistemaPush.Utils.Seguridad;
import java.util.List;
import javax.annotation.Resource;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Conjunction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author AfroVocho
 */
@Transactional
@Repository
public class AccessSystemDAOImpl implements AccessSystemDAO {

    static final Logger LOG = LogManager.getLogger(AccessSystemDAOImpl.class.getName());
    private SessionFactory sessionFactory;
    
    @Override
    @Transactional(readOnly=true)
    public List<Object[]> getCredenciales(String usuario, String pass) {
        LOG.debug("Entra a getCredenciales");

        List<Object[]> encPass = null;

        final String consulta = "select id_usuario,usuario,id_tipo,password "
                + "from [dbo].[Usuarios] "
                + " where correo='" + usuario + "' and isAct=1;";
        try {
            Session session = sessionFactory.getCurrentSession();

            System.out.println(consulta);
            Query query = session.createSQLQuery(consulta);

            List<Object[]> list = query.list();
            LOG.debug("tamaño lista = "+list.size());
            if (list.size() > 0) {
                // encPass = list;
                Object[] obj = list.get(0);
                if (list != null) {
                    if (Boolean.valueOf(Seguridad.desencripta(obj[3].toString()).equals(pass))) {
                        return list;
                    } else {
                        return encPass;
                    }
                }

            } else {
                return encPass;
            }

        } catch (HibernateException e) {
            LOG.error("Error en getTIdentificacion: " + e.getMessage(), e);
        }
        return encPass;
    }

    /*@Override
    @Transactional(readOnly = true)
    public Usuario validaAcceso(String usuario, String pass) {

        System.out.println("Entra a validaAcceso");

         Usuario user = null;
         pass=Seguridad.encripta(pass);
         System.out.println("pass "+ pass);


        try {

            Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Usuario.class);
            Criterion ct_user = Restrictions.eq("usuario", usuario);
            Criterion ct_pass = Restrictions.eq("password",pass);
            Criterion ct_activo = Restrictions.eq("isAct",true);
            //System.out.println("Usr: " + ct_user + " Pwd: " + ct_pass + " activo: " + ct_activo);
            Conjunction andExp = Restrictions.and(ct_user, ct_pass, ct_activo);
            criteria.add(andExp);
            user=(Usuario) criteria.uniqueResult();


        } catch (HibernateException e) {
            LOG.error("Error en validaAcceso: " + e.getMessage(), e);
        }
        return user;
    } */

    @Override
    public Usuario obtenerUsuario(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   @Resource(name="sessionFactory")
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}
