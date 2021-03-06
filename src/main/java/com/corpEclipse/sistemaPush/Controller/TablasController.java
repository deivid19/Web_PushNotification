/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corpEclipse.sistemaPush.Controller;

import com.corpEclipse.sistemaPush.Service.TablasService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.http.HttpServletRequest;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author deivi
 */
@Controller
@RequestMapping("/tablas")
public class TablasController extends AccessSystemController{
    
    @Autowired
    public TablasService tablasService;

    static final Logger LOG = LogManager.getLogger(InicioController.class.getName());

    public ModelAndView _modelandview;
    public Map<String, Object> _model;

    @PostConstruct
    public void init() {
        LOG.debug("Crea instancia: " + InicioController.class.getName());
    }

    @PreDestroy
    public void destroy() {
        LOG.debug("Destruye instancia: " + InicioController.class.getName());
    }
    
    @RequestMapping(value = "/base_de_datos", method = {RequestMethod.POST, RequestMethod.GET})
    public ModelAndView visualizar(HttpServletRequest request) {

        System.out.println("base de datos");
        _modelandview = new ModelAndView();
        _modelandview.setViewName("tablas/baseDeDatos");
        _model = new HashMap<>();
        
        try {
                List<Object[]> list_usr = new ArrayList();
                list_usr = tablasService.getListaUsuarios();
                System.out.println("lista: " + list_usr);
                _model.put("listaUsuarios", list_usr);
            } catch (Exception e) {
                LOG.error("Algo fue mal con el servicio getListaUsuarios" + e);
            }
        
        _modelandview.addAllObjects(_model);

        return _modelandview;
    }
    
    @RequestMapping(value = "/push_notifications", method = {RequestMethod.POST, RequestMethod.GET})
    public ModelAndView usuarios(HttpServletRequest request) {

        System.out.println("usuarios");
        _modelandview = new ModelAndView();
        _modelandview.setViewName("tablas/pushNotifications");
        _model = new HashMap<>();
        
        try {
                List<Object[]> list_usr = new ArrayList();
                list_usr = tablasService.getListaUsuarios();
                System.out.println("lista: " + list_usr);
                _model.put("listaUsuarios", list_usr);
            } catch (Exception e) {
                LOG.error("Algo fue mal con el servicio getListaUsuarios" + e);
            }
        
        _modelandview.addAllObjects(_model);

        return _modelandview;
    }
    
    @RequestMapping(value = "/nuevo", method = {RequestMethod.POST, RequestMethod.GET})
    public ModelAndView nuevo(HttpServletRequest request) {

        System.out.println("nuevo");
        _modelandview = new ModelAndView();
        _modelandview.setViewName("tablas/nuevo");
        _model = new HashMap<>();
        _modelandview.addAllObjects(_model);

        return _modelandview;
    }
    
    @RequestMapping(value = "/modificar", method = {RequestMethod.POST, RequestMethod.GET})
    public ModelAndView modificar(HttpServletRequest request) {

        System.out.println("modificar");
        _modelandview = new ModelAndView();
        _modelandview.setViewName("tablas/modificar");
        _model = new HashMap<>();
        
        _modelandview.addAllObjects(_model);

        return _modelandview;
    }
    
    @RequestMapping(value = {"/nuevoRegistro"}, method = {org.springframework.web.bind.annotation.RequestMethod.GET, org.springframework.web.bind.annotation.RequestMethod.POST})
    public String nuevoRegistro(HttpServletRequest request) {
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        String tipo = request.getParameter("tipo");
        String celular = request.getParameter("celular");
        String puesto = request.getParameter("puesto");
        String correo = request.getParameter("correo");
        String empresa = request.getParameter("empresa");
        String diagnostico = request.getParameter("diagnostico");
        
        /*if (celular == ""){
            celular = "0";
        }*/
        
        System.out.println("Registro: " + usuario + password + tipo + celular + puesto + correo + empresa + diagnostico);

        String consulta = null;
        String _urlsalida = null;
        try {
            consulta = tablasService.insertarRegistro(usuario, password, tipo, celular, puesto, correo, empresa, diagnostico);
        } catch (Exception e) {
            LOG.error("Algo fue mal con insertarRegistro " + e);
        }
        if (consulta.equals("1")) {

            _urlsalida = "redirect:/tablas/base_de_datos";
        }

        System.out.println("consulta: " + consulta);
        return _urlsalida;
    }
    
    @RequestMapping(value = "/cambiaDiagnostico", method = RequestMethod.POST, headers = "Accept=application/json;charset=utf-8", produces = "application/json;charset=utf-8")
    public String cambiaDiagnostico(@RequestBody String data) {
        
        JSONObject requestedJSONObject = new JSONObject(data);

        String diagnostico = (String) requestedJSONObject.get("diag");
        String id = (String) requestedJSONObject.get("id");

        //System.out.println("pass: " + password + " usuario: " + usuario+" token: "+token);

        String consulta = null;
        String _urlsalida = null;
        try {
            consulta = tablasService.cambiarDiagnostico(diagnostico, id);
        } catch (Exception e) {
            LOG.error("Algo fue mal con cambiarDiagnostico " + e);
        }
        if (consulta.equals("1")) {

            _urlsalida = "redirect:/tablas/base_de_datos";
        }
        return _urlsalida;
    }
    
}
