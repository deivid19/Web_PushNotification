/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.corpEclipse.sistemaPush.Service;

import com.corpEclipse.sistemaPush.Model.Usuario;
import java.util.List;



/**
 *
 * @author AfroVocho
 */
public interface AccessSystemService {
    public List<Object[]> getCredenciales(String usuario, String pass);
    //public Usuario validaAcceso(String user, String password);
    public Usuario obtenerUsuario(String id);
}
