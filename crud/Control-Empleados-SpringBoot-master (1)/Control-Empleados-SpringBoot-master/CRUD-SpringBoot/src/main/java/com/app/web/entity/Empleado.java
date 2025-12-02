package com.app.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empleados")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
    
    @Column(name = "apellido", nullable = false, length = 50)
    private String apellido;

    @Column(name = "documento_identidad", nullable = false, length = 50)
    private String documento_identidad;
    
    @Column(name = "email", nullable = false, length = 50, unique = true)
    private String email;

    @Column(name = "telefono", nullable = false, length = 50, unique = true)
    private String telefono;

    // ← ESTE ATRIBUTO ESTABA DUPLICADO Y SIN NOMBRE DE COLUMNA
    @Column(name = "email_secundario", nullable = false, length = 50, unique = true)
    private String email_secundario;

    @Column(name = "fecha_contratacion", nullable = false, length = 50, unique = true)
    private String fecha_contratacion;

    @Column(name = "salario_base", nullable = false, length = 50, unique = true)
    private String salario_base;

    @Column(name = "estado", nullable = false, length = 50, unique = true)
    private String estado;

    @Column(name = "fecha_creacion", nullable = false, length = 50, unique = true)
    private String fecha_creacion;

    public Empleado() {
        
    }

    public Empleado(Long id, String nombre, String apellido, String email) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }
    
    public Empleado(String nombre, String apellido, String email) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumento_identidad() {
        return documento_identidad;
    }

    public void setDocumento_identidad(String documento_identidad) {
        this.documento_identidad = documento_identidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFecha_contratacion() {
        return fecha_contratacion;
    }

    public void setFecha_contratacion(String fecha_contratacion) {
        this.fecha_contratacion = fecha_contratacion;
    }

    public String getSalario_base() {
        return salario_base;
    }

    public void setSalario_base(String salario_base) {
        this.salario_base = salario_base;
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

    public String getEmail_secundario() {
        return email_secundario;
    }

    public void setEmail_secundario(String email_secundario) {
        this.email_secundario = email_secundario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Empleado [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + "]";
    }
    
}