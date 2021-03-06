/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corpEclipse.sistemaPush.DAO;

import com.corpEclipse.sistemaPush.Utils.Seguridad;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author deivi
 */
@Transactional
@Repository
public class TablasDAOImpl implements TablasDAO{
    
    static final Logger LOG = LogManager.getLogger(InicioDAOImpl.class.getName());
    private SessionFactory sessionFactory;

    @Resource(name = "sessionFactory")
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    @Override
    @Transactional(readOnly = true)
    public List<Object[]> getListaUsuarios() {
        List<Object[]> lista = new ArrayList();

        /*final String consulta = "SELECT id_participante,nombre_empresa,participante,celular,puesto,correo,diagnostico\n"
                + "FROM cat_participantes\n"
                + "ORDER BY participante";*/
        final String consulta = "SELECT id_usuario, usuario, id_tipo, celular, puesto, nombre_empresa, isDiagnostico, id_tipo_os, token\n" +
                                "FROM Usuarios\n" +
                                "WHERE isAct = 'TRUE'\n" +
                                "ORDER BY id_usuario ASC;\n";
        System.out.println("Query: " + consulta);
        try {
            Session session = sessionFactory.getCurrentSession();

            System.out.println(consulta);
            Query query = session.createSQLQuery(consulta);

            lista = query.list();

        } catch (HibernateException e) {
            LOG.error("Error en getListaUsuarios: " + e.getMessage(), e);
        }
        return lista;
    }
    
    @Override
    public String insertarRegistro(String usuario, String password, String id_tipo, String celular, String puesto, String correo, String empresa, String diagnostico) {
        LOG.debug("insertarRegistro");
        String consulta = null;
        
        password=Seguridad.encripta(password);
        System.out.println("pass "+ password);

        consulta = "INSERT INTO Usuarios\n"
                 + "(usuario, password, id_tipo, celular, puesto, correo, nombre_empresa, isDiagnostico, isAct)\n"
                 + "VALUES('" + usuario + "','" + password + "'," + id_tipo + ",'" + celular + "','" + puesto + "','" + correo + "','" + empresa + "','" + diagnostico + "', 'true'" + ");";

        System.out.println(" query: " + consulta);

        String respuesta = "";
        try {
            Session session = sessionFactory.getCurrentSession();
            Query query = session.createSQLQuery(consulta);
            query.executeUpdate();
            respuesta = "1";
        } catch (HibernateException e) {
            LOG.error("Error en insertarRegistro: " + e.getMessage(), e);
            respuesta = "0";
        }

        return respuesta;
    }
    
    @Override
    public String cambiarDiagnostico(String diagnostico, String id) {
        LOG.debug("cambiarDiagnostico");
        String consulta = null;

        consulta = "UPDATE Usuarios\n"
                 + "SET isDiagnostico = '" + diagnostico + "'\n"
                 + "WHERE id_usuario = " + id + ";";

        System.out.println(" query: " + consulta);

        String respuesta = "";
        try {
            Session session = sessionFactory.getCurrentSession();
            Query query = session.createSQLQuery(consulta);
            query.executeUpdate();
            respuesta = "1";
        } catch (HibernateException e) {
            LOG.error("Error en cambiarDiagnostico: " + e.getMessage(), e);
            respuesta = "0";
        }

        return respuesta;
    }
    
}
