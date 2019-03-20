/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corpEclipse.sistemaPush.DAO;

import java.util.List;

/**
 *
 * @author deivi
 */
public interface TablasDAO {
    
    // Obtiene la lista de conceptos
    public  List<Object[]>  getListaUsuarios();
    
    // Agregar nuevo concepto
    public  String  insertarRegistro(String usuario, String password, String id_tipo, String celular, String puesto, String correo, String empresa, String diagnostico);
    
}
