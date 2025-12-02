package com.app.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;           
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "proveedores")
public class proveedores {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Long id;
	
    @Column(name = "id_proveedor", nullable = false, length = 50)
    private String id_proveedor;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = " ruc", nullable = false, length = 50)
    private String  ruc;

    @Column(name = "telefono", nullable = false, length = 50)
    private String telefono;

    @Column(name = "email", nullable = false, length = 50)
    private String email;

    @Column(name = "direccion", nullable = false, length = 50)
    private String direccion;

    @Column(name = "contacto_nombre", nullable = false, length = 50)
    private String contacto_nombre;

    @Column(name = "contacto_telefono", nullable = false, length = 50)
    private String contacto_telefono;

    @Column(name = "activo", nullable = false, length = 50)
    private String activo;

    @Column(name = " fecha_registro", nullable = false, length = 50)
    private String  fecha_registro;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(String id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getContacto_nombre() {
        return contacto_nombre;
    }

    public void setContacto_nombre(String contacto_nombre) {
        this.contacto_nombre = contacto_nombre;
    }

    public String getContacto_telefono() {
        return contacto_telefono;
    }

    public void setContacto_telefono(String contacto_telefono) {
        this.contacto_telefono = contacto_telefono;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    public String getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

}