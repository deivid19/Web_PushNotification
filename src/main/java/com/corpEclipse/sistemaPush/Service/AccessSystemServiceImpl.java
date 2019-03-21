/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.corpEclipse.sistemaPush.Service;

import com.corpEclipse.sistemaPush.DAO.AccessSystemDAO;
import com.corpEclipse.sistemaPush.Model.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author AfroVocho
 */
@Service
public class AccessSystemServiceImpl implements AccessSystemService{
    
    @Autowired
    private AccessSystemDAO _accessystemdao;

    @Override
    public List<Object[]> getCredenciales(String usuario, String pass) {
        return _accessystemdao.getCredenciales(usuario, pass);
    }
    
    /*@Override
    public Usuario validaAcceso(String user, String password) {
        return _accessystemdao.validaAcceso(user, password);
    }*/

    @Override
    public Usuario obtenerUsuario(String id) {
        return _accessystemdao.obtenerUsuario(id);
    }

  
    
}
