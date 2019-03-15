/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corpEclipse.sistemaPush.DAO;

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
        final String consulta = "SELECT usuario, token, celular, puesto, correo\n"
                + "FROM Usuarios\n";
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
    public String insertarRegistro(String nombre, String celular, String puesto, String correo) {
        LOG.debug("insertarRegistro");
        String consulta = null;

        consulta = "INSERT INTO usuarios\n"
                 + "(usuario,celular,puesto,correo)\n"
                 + "VALUES('" + nombre + "'," + celular + ",'" + puesto + "','" + correo + "'" + ");";

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
    
}
