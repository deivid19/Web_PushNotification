/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corpEclipse.sistemaPush.Service;

import java.util.List;

/**
 *
 * @author deivi
 */
public interface TablasService {
    
    // Obtiene la lista de usuarios
    public  List<Object[]>  getListaUsuarios();
    
    //insertar nuevo registro
    public  String  insertarRegistro(String usuario, String password, String id_tipo, String celular, String puesto, String correo, String empresa, String diagnostico);
    
    //actualizar diagnostico
    public  String  cambiarDiagnostico(String diagnostico, String id);
}
