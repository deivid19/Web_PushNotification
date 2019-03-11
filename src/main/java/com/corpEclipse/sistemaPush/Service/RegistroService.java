/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corpEclipse.sistemaPush.Service;


import java.util.List;

/**
 *
 * @author vocho
 */
public interface RegistroService {

    //Registro de Parte
    public String updateRegistroParte(String tipo, String descripcion);

    //Registro de Equipo
    public String updateRegistroEquipo(String tipo, String descripcion);

    //Registro de Nuevo Grupo
    public String insertNuevoGrupo(String grupoNombre, String id_usuario, String giroEmpresa, String empresa);

    //Registro de Nuevo Usuario en el Grupo
    public String insertUsuarioAGrupo(String id_grupo, String usuario);

    //Insert de la tabla Componentes
    public String insertComponentes(String id_cat_compon, String id_usuario, String imagen, String compon_desc,
            String latX, String lngY, String id_producto, String creditos, String codigo);

    //Insert de la busqueda que se va a compartir
    public String insertBusqCompartir(String id_grupo, String id_busqueda);

    //Insert el componente que se va a compartir
    public String insertCompCompartir(String id_grupo, String id_componente);

    //Elimina el usuario del grupo si es admin selecciona al siguiente admin
    public String deleteUsuarioDeGrupo(String id_usuario, String id_grupo);

    //Elimina el grupo y a todos sus usuarios
    public String deleteGrupo(String id_usuario, String id_grupo);

    public String insertBusquedaImg(String id_usuario, String imagen, String latX, String lngY,String producto,String idrack);
    
    //    Inserta Imagen y idRack
    public String insertImg(String idRack, String imagenRack);
    

}
