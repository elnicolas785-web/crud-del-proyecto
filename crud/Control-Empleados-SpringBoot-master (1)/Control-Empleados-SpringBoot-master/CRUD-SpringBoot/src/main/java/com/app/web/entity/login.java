package com.app.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;          
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "login")   
public class login {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;
	
    @Column(name = "id_login", nullable = false, length = 50)  
    private String id_login;

    @Column(name = "id_usuario_empleado", nullable = false, length = 50)
    private String id_usuario_empleado;

    @Column(name = "id_usuario_cliente", nullable = false, length = 50)
    private String id_usuario_cliente;

    @Column(name = "tipo_usuario", nullable = false, length = 50)
    private String tipo_usuario;

    @Column(name = "fecha_login", nullable = false, length = 50)
    private String fecha_login;

    @Column(name = "ip_address", nullable = false, length = 50)
    private String ip_address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getId_login() {
        return id_login;
    }

    public void setId_login(String id_login) {
        this.id_login = id_login;
    }

    public String getId_usuario_empleado() {
        return id_usuario_empleado;
    }

    public void setId_usuario_empleado(String id_usuario_empleado) {
        this.id_usuario_empleado = id_usuario_empleado;
    }

    public String getId_usuario_cliente() {
        return id_usuario_cliente;
    }

    public void setId_usuario_cliente(String id_usuario_cliente) {
        this.id_usuario_cliente = id_usuario_cliente;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public String getFecha_login() {
        return fecha_login;
    }

    public void setFecha_login(String fecha_login) {
        this.fecha_login = fecha_login;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }
}