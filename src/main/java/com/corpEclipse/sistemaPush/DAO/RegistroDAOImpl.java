/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corpEclipse.sistemaPush.DAO;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author vocho
 */
@Transactional
@Repository
public class RegistroDAOImpl implements RegistroDAO {

    static final Logger LOG = LogManager.getLogger(RegistroDAOImpl.class.getName());
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public String updateRegistroParte(String tipo, String descripcion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String updateRegistroEquipo(String tipo, String descripcion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String insertNuevoGrupo(String grupoNombre, String id_usuario, String giroEmpresa, String empresa) {
        LOG.error("Entra a insertNuevoGrupo");

        String respuesta = "";

        final String consulta = "SELECT doxsteel.insertanuevogrp('" + grupoNombre + "'," + id_usuario + ",'Servicios','01','" + empresa + "','1')";
        try {
            Session session = sessionFactory.getCurrentSession();

            System.out.println(consulta);
            Query query = session.createSQLQuery(consulta);
            respuesta = query.uniqueResult().toString();
            LOG.info("resultado grupo" + respuesta);

        } catch (HibernateException e) {
            LOG.error("Error en insertNuevoGrupo: " + e.getMessage(), e);

        }

        return respuesta;

    }

    @Override
    public String insertUsuarioAGrupo(String usuario, String id_grupo) {

        LOG.error("Entra a insertUsuarioAGrupo");

        String respuesta = "";

        final String consulta = "SELECT doxsteel.inserta_usuarioagrupo('" + usuario + "'," + id_grupo + ",'1')";
        try {
            Session session = sessionFactory.getCurrentSession();

            System.out.println(consulta);
            Query query = session.createSQLQuery(consulta);
            respuesta = query.uniqueResult().toString();
            LOG.info("resultado grupo" + respuesta);

        } catch (HibernateException e) {
            LOG.error("Error en insertUsuarioAGrupo: " + e.getMessage(), e);

        }

        return respuesta;
    }

    @Override
    public String insertComponentes(String id_cat_compon, String id_usuario, String imagen, String compon_desc, String latX, String lngY, String id_producto, String creditos, String codigo) {
        LOG.error("Entra a insertComponentes");

        String respuesta = "";

        final String consulta = "SELECT inserta_componente FROM doxsteel.inserta_componente(" + id_cat_compon + " ," + id_usuario + ",'" + imagen + "','" + compon_desc + "'," + latX + "," + lngY + "," + id_producto + "," + creditos + ",'" + codigo + "');";
        try {
            Session session = sessionFactory.getCurrentSession();

            System.out.println(consulta);
            Query query = session.createSQLQuery(consulta);
            respuesta = query.uniqueResult().toString();
            LOG.info("resultado grupo" + respuesta);

        } catch (HibernateException e) {
            LOG.error("Error en insertComponentes: " + e.getMessage(), e);

        }

        return respuesta;
    }

    @Override
    public String insertBusqCompartir(String id_grupo, String id_busqueda) {

        LOG.info("Entra a insertBusqCompartir");

        String respuesta = "";

        final String consulta = "SELECT inserta_compartirbusq FROM doxsteel.inserta_compartirbusq (" + id_grupo + "," + id_busqueda + ")";
        try {
            Session session = sessionFactory.getCurrentSession();

            System.out.println(consulta);
            Query query = session.createSQLQuery(consulta);
            respuesta = query.uniqueResult().toString();
            LOG.info("resultado grupo" + respuesta);

        } catch (HibernateException e) {
            LOG.error("Error en insertBusqCompartir: " + e.getMessage(), e);

        }

        return respuesta;
    }

    @Override
    public String insertCompCompartir(String id_grupo, String id_componente) {

        LOG.info("Entra a insertCompCompartir");

        String respuesta = "";

        final String consulta = "SELECT inserta_compartircomp FROM doxsteel.inserta_compartircomp (" + id_grupo + "," + id_componente + ")";
        try {
            Session session = sessionFactory.getCurrentSession();

            System.out.println(consulta);
            Query query = session.createSQLQuery(consulta);
            respuesta = query.uniqueResult().toString();
            LOG.info("resultado grupo" + respuesta);

        } catch (HibernateException e) {
            LOG.error("Error en insertCompCompartir: " + e.getMessage(), e);

        }

        return respuesta;
    }

    @Override
    public String deleteUsuarioDeGrupo(String id_usuario, String id_grupo) {

        LOG.info("Entra a deleteUsuarioDeGrupo");

        String respuesta = "";

        final String consulta = "SELECT deleteUsrDeGrupo FROM doxsteel.deleteUsrDeGrupo (" + id_usuario + "," + id_grupo + ")";
        try {
            Session session = sessionFactory.getCurrentSession();

            System.out.println(consulta);
            Query query = session.createSQLQuery(consulta);
            respuesta = query.uniqueResult().toString();
            LOG.info("resultado grupo" + respuesta);

        } catch (HibernateException e) {
            LOG.error("Error en deleteUsuarioDeGrupo: " + e.getMessage(), e);

        }

        return respuesta;
    }

    @Override
    public String deleteGrupo(String id_usuario, String id_grupo) {

        LOG.info("Entra a deleteGrupo");

        String respuesta = "";

        final String consulta = "SELECT deletegrupo FROM doxsteel.deletegrupo (" + id_usuario + "," + id_grupo + ")";
        try {
            Session session = sessionFactory.getCurrentSession();

            System.out.println(consulta);
            Query query = session.createSQLQuery(consulta);
            respuesta = query.uniqueResult().toString();
            LOG.info("resultado grupo" + respuesta);

        } catch (HibernateException e) {
            LOG.error("Error en deleteGrupo: " + e.getMessage(), e);

        }

        return respuesta;
    }

    @Override
    public String insertBusquedaImg(String id_usuario, String imagen, String latX, String lngY, String producto, String idrack) {
        LOG.error("Entra a insertBusquedaImg");

        String respuesta = "";

        final String consulta = "SELECT inserta_busquedaimgbarcelv1 FROM doxsteel.inserta_busquedaimgbarcelv1(" + id_usuario + ",'" + imagen + "'," + latX + "," + lngY + ",'" + producto + "'," + idrack + ");";

        try {
            Session session = sessionFactory.getCurrentSession();

            System.out.println(consulta);
            Query query = session.createSQLQuery(consulta);
            respuesta = query.uniqueResult().toString();
            LOG.info("resultado grupo" + respuesta);
            respuesta = "0";
        } catch (HibernateException e) {
            LOG.error("Error en insertBusquedaImg: " + e.getMessage(), e);
            respuesta = "1";
        }

        return respuesta;
    }

    @Override
    public String insertImg(String idRack, String imagenRack) {
        LOG.error("Entra a insertImg");

        String respuesta = "";

        final String consulta = "SELECT inserta_imgrackbarcel FROM doxsteel.inserta_imgrackbarcel(" + idRack + ",'" + imagenRack + "');";

        try {
            Session session = sessionFactory.getCurrentSession();

            System.out.println(consulta);
            Query query = session.createSQLQuery(consulta);
            respuesta = query.uniqueResult().toString();

        } catch (HibernateException e) {
            LOG.error("Error en insertImg: " + e.getMessage(), e);
            respuesta = "0";
        }

        return respuesta;
    }

    
}
