/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corpEclipse.sistemaPush.Service;

//import com.vlimix.ago.DAO.ConsultaDAO;
import com.corpEclipse.sistemaPush.DAO.RegistroDAO;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author vocho
 */
@Service
public class RegistroServiceImpl implements RegistroService {

    @Autowired
    RegistroDAO _registroDao;

    @Override
    public String updateRegistroParte(String tipo, String descripcion) {
        return _registroDao.updateRegistroParte(tipo, descripcion);
    }

    @Override
    public String updateRegistroEquipo(String tipo, String descripcion) {
        return _registroDao.updateRegistroEquipo(tipo, descripcion);
    }

    @Override
    public String insertNuevoGrupo(String grupoNombre, String id_usuario, String giroEmpresa, String empresa) {
        return _registroDao.insertNuevoGrupo(grupoNombre, id_usuario, giroEmpresa, empresa);
    }

    @Override
    public String insertUsuarioAGrupo(String id_grupo, String usuario) {
        return _registroDao.insertUsuarioAGrupo(id_grupo, usuario);
    }

    @Override
    public String insertComponentes(String id_cat_compon, String id_usuario, String imagen, String compon_desc,
            String latX, String lngY, String id_producto, String creditos, String codigo) {
        return _registroDao.insertComponentes(id_cat_compon, id_usuario, imagen, compon_desc,
                latX, lngY, id_producto, creditos, codigo);
    }

    @Override
    public String insertBusqCompartir(String id_grupo, String id_busqueda) {
        return _registroDao.insertBusqCompartir(id_grupo, id_busqueda);
    }

    @Override
    public String insertCompCompartir(String id_grupo, String id_componente) {
        return _registroDao.insertCompCompartir(id_grupo, id_componente);
    }

    @Override
    public String deleteUsuarioDeGrupo(String id_usuario, String id_grupo) {
        return _registroDao.deleteUsuarioDeGrupo(id_usuario, id_grupo);
    }

    @Override
    public String deleteGrupo(String id_usuario, String id_grupo) {
        return _registroDao.deleteGrupo(id_usuario, id_grupo);
    }

    @Override
    public String insertBusquedaImg(String id_usuario, String imagen, String latX, String lngY, String producto, String idrack) {
        return _registroDao.insertBusquedaImg(id_usuario, imagen, latX, lngY, producto, idrack);
    }

    @Override
    public String insertImg(String idRack, String imagenRack) {
        return _registroDao.insertImg(idRack, imagenRack);
    }

}
