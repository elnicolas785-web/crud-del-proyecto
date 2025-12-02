package com.app.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;           
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "detalle_ventas")
public class detalle_ventas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Long id;
	
    @Column(name = "id_detalle", nullable = false, length = 50)
    private String id_detalle;

    @Column(name = "id_venta", nullable = false, length = 50)
    private String id_venta;

    @Column(name = " id_producto", nullable = false, length = 50)
    private String  id_producto;

    @Column(name = "cantidad ", nullable = false, length = 50)
    private String cantidad ;

    @Column(name = "precio_unitario", nullable = false, length = 50)
    private String precio_unitario;

    @Column(name = "subtotal", nullable = false, length = 50)
    private String subtotal;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getId_detalle() {
        return id_detalle;
    }

    public void setId_detalle(String id_detalle) {
        this.id_detalle = id_detalle;
    }

    public String getId_venta() {
        return id_venta;
    }

    public void setId_venta(String id_venta) {
        this.id_venta = id_venta;
    }

    public String getId_producto() {
        return id_producto;
    }

    public void setId_producto(String id_producto) {
        this.id_producto = id_producto;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(String precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    
}
