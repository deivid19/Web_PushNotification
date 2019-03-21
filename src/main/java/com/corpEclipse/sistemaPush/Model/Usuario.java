package com.corpEclipse.sistemaPush.Model;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name="Usuarios")
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_usuario")
    private int id_usuario;
    
    @Column(name="usuario")
    private String usuario;

    @Column(name="password")
    private String password;
    
    @Column(name="isAct")
    private boolean isAct;
    
    @Column(name="id_tipo")
    private int id_tipo;
    
    @Column(name="token")
    private String token;
    
    @Column(name="id_tipo_os")
    private int id_tipo_os;
    
    @Column(name="isPush")
    private boolean isPush;
    
    @Column(name="celular")
    private int celular;
    
    @Column(name="puesto")
    private String puesto;
    
    @Column(name="correo")
    private String correo;
    
    @Column(name="isDiagnostico")
    private boolean isDiagnostico;
    
    @Column(name="nombreEmpresa")
    private String nombreEmpresa;
    

    public Usuario() {
    }

    public Usuario(int id_usuario, String usuario, String password, boolean isAct, int id_tipo, String token, int id_tipo_os, boolean isPush, int celular, String puesto, String correo, boolean isDiagnostico, String nombreEmpresa) {
        this.id_usuario = id_usuario;
        this.usuario = usuario;
        this.password = password;
        this.isAct = isAct;
        this.id_tipo = id_tipo;
        this.token = token;
        this.id_tipo_os = id_tipo_os;
        this.isPush = isPush;
        this.celular = celular;
        this.puesto = puesto;
        this.correo = correo;
        this.isDiagnostico = isDiagnostico;
        this.nombreEmpresa = nombreEmpresa;
    }
    


    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean isAct() {
        return isAct;
    }

    public void setAct(boolean isAct) {
        this.isAct = isAct;
    }

    public int getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(int id_tipo) {
        this.id_tipo = id_tipo;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getId_tipo_os() {
        return id_tipo_os;
    }

    public void setId_tipo_os(int id_tipo_os) {
        this.id_tipo_os = id_tipo_os;
    }

    public boolean getIsPush() {
        return isPush;
    }

    public void setIsPush(boolean isPush) {
        this.isPush = isPush;
    }

    public int getCelular() {
        return celular;
    }
    
    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getPuesto() {
        return puesto;
    }
    
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    public String getCorreo() {
        return correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public boolean getIsDiagnostico() {
        return isDiagnostico;
    }
    
    public void setIsDiagnostico(boolean isDiagnostico) {
        this.isDiagnostico = isDiagnostico;
    }
    
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }
    
    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
    
}
