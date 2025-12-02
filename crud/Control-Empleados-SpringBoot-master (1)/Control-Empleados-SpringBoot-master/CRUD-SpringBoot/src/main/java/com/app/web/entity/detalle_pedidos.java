package com.app.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;           
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = " detalle_pedidos")
public class  detalle_pedidos{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Long id;
	
    @Column(name = "id_detalle_pedido", nullable = false, length = 50)
    private String id_detalle_pedido;

    @Column(name = "id_pedido", nullable = false, length = 50)
    private String id_pedido;

    @Column(name = " id_producto", nullable = false, length = 50)
    private String  fid_producto;

    @Column(name = "cantidad", nullable = false, length = 50)
    private String  cantidad;

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

    public String getId_detalle_pedido() {
        return id_detalle_pedido;
    }

    public void setId_detalle_pedido(String id_detalle_pedido) {
        this.id_detalle_pedido = id_detalle_pedido;
    }

    public String getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(String id_pedido) {
        this.id_pedido = id_pedido;
    }

    public String getFid_producto() {
        return fid_producto;
    }

    public void setFid_producto(String fid_producto) {
        this.fid_producto = fid_producto;
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
