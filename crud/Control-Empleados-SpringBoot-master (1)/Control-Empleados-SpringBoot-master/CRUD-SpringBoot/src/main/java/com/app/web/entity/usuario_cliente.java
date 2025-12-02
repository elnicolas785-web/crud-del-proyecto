package com.app.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "usuario_cliente") 
public class usuario_cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "id_usuario_cliente", nullable = false, length = 50)
    private String id_usuario_cliente;

    @Column(name = "id_cliente", nullable = false, length = 50)
    private String id_cliente;

    @Column(name = "nombre_usuario", nullable = false, length = 50)
    private String nombre_usuario;

    @Column(name = "contrasena_hash", nullable = false, length = 50)
    private String contrasena_hash;

    @Column(name = "estado", nullable = false, length = 50)
    private String estado;

    @Column(name = "fecha_creacion", nullable = false, length = 50)
    private String fecha_creacion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getId_usuario_cliente() {
        return id_usuario_cliente;
    }

    public void setId_usuario_cliente(String id_usuario_cliente) {
        this.id_usuario_cliente = id_usuario_cliente;
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContrasena_hash() {
        return contrasena_hash;
    }

    public void setContrasena_hash(String contrasena_hash) {
        this.contrasena_hash = contrasena_hash;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }
}