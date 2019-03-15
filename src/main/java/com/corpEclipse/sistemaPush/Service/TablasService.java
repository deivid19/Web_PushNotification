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
    
    // Obtiene la lista de conceptos
    public  List<Object[]>  getListaUsuarios();
    
    //insertar nuevo registro
    public  String  insertarRegistro(String nombre, String celular, String puesto, String correo);
    
}
