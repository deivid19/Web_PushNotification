/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corpEclipse.sistemaPush.Service;

import com.corpEclipse.sistemaPush.DAO.TablasDAO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author deivi
 */
@Service
public class TablasServiceImpl implements TablasService{
    
    @Autowired
    private TablasDAO tablasDao;
    
    @Override
    public List<Object[]> getListaUsuarios() {
        return tablasDao.getListaUsuarios();
    }
    
    @Override
    public String insertarRegistro(String usuario, String password, String id_tipo, String celular, String puesto, String correo, String empresa, String diagnostico) {
        return tablasDao.insertarRegistro(usuario, password, id_tipo, celular, puesto, correo, empresa, diagnostico);
    }
    
    @Override
    public String cambiarDiagnostico(String diagnostico, String id) {
        return tablasDao.cambiarDiagnostico(diagnostico, id);
    }
    
}
