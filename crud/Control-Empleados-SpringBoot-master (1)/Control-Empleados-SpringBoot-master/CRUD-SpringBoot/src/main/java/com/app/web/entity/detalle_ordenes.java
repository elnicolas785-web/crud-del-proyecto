package com.app.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;           
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = " detalle_ordenes")
public class  detalle_ordenes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Long id;
	
    @Column(name = "id_detalle_orden", nullable = false, length = 50)
    private String id_detalle_orden;

    @Column(name = "id_orden", nullable = false, length = 50)
    private String id_orden;

    @Column(name = " cantidad", nullable = false, length = 50)
    private String  cantidad;

    @Column(name = "precio_unitario ", nullable = false, length = 50)
    private String precio_unitario;

    @Column(name = "subtotal", nullable = false, length = 50)
    private String subtotal;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getId_detalle_orden() {
        return id_detalle_orden;
    }

    public void setId_detalle_orden(String id_detalle_orden) {
        this.id_detalle_orden = id_detalle_orden;
    }

    public String getId_orden() {
        return id_orden;
    }

    public void setId_orden(String id_orden) {
        this.id_orden = id_orden;
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
