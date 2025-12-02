package com.app.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;           
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ordenes_compra")
public class ordenes_compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Long id;
	
    @Column(name = "id_orden", nullable = false, length = 50)
    private String id_dorden;

    @Column(name = "numero_orden", nullable = false, length = 50)
    private String numero_orden;

    @Column(name = " fecha_orden", nullable = false, length = 50)
    private String  fecha_orden;

    @Column(name = "fecha_esperada ", nullable = false, length = 50)
    private String fecha_esperada ;

    @Column(name = "id_proveedor", nullable = false, length = 50)
    private String id_proveedor;

    @Column(name = "id_usuario", nullable = false, length = 50)
    private String id_usuario;

    @Column(name = "subtotal", nullable = false, length = 50)
    private String subtotal;

    @Column(name = "total", nullable = false, length = 50)
    private String total;

    @Column(name = "estado", nullable = false, length = 50)
    private String estado;

    @Column(name = "observaciones", nullable = false, length = 50)
    private String observaciones;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getId_dorden() {
        return id_dorden;
    }

    public void setId_dorden(String id_dorden) {
        this.id_dorden = id_dorden;
    }

    public String getNumero_orden() {
        return numero_orden;
    }

    public void setNumero_orden(String numero_orden) {
        this.numero_orden = numero_orden;
    }

    public String getFecha_orden() {
        return fecha_orden;
    }

    public void setFecha_orden(String fecha_orden) {
        this.fecha_orden = fecha_orden;
    }

    public String getFecha_esperada() {
        return fecha_esperada;
    }

    public void setFecha_esperada(String fecha_esperada) {
        this.fecha_esperada = fecha_esperada;
    }

    public String getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(String id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    
}
