package com.app.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;           
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = " pedidos")
public class  pedidos{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Long id;
	
    @Column(name = "id_pedido", nullable = false, length = 50)
    private String id_pedido;

    @Column(name = "numero_pedido", nullable = false, length = 50)
    private String numero_pedido;

    @Column(name = " fecha_pedido", nullable = false, length = 50)
    private String  fecha_pedido;

    @Column(name = " fecha_entrega_esperada ", nullable = false, length = 50)
    private String  fecha_entrega_esperada;

    @Column(name = "id_cliente", nullable = false, length = 50)
    private String id_cliente;

    @Column(name = "estado", nullable = false, length = 50)
    private String estado;

    @Column(name = "subtotal", nullable = false, length = 50)
    private String subtotal;

    @Column(name = " total", nullable = false, length = 50)
    private String  total;

    @Column(name = "direccion_entrega", nullable = false, length = 50)
    private String direccion_entrega;

    @Column(name = "observaciones", nullable = false, length = 50)
    private String observaciones;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(String id_pedido) {
        this.id_pedido = id_pedido;
    }

    public String getNumero_pedido() {
        return numero_pedido;
    }

    public void setNumero_pedido(String numero_pedido) {
        this.numero_pedido = numero_pedido;
    }

    public String getFecha_pedido() {
        return fecha_pedido;
    }

    public void setFecha_pedido(String fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }

    public String getFecha_entrega_esperada() {
        return fecha_entrega_esperada;
    }

    public void setFecha_entrega_esperada(String fecha_entrega_esperada) {
        this.fecha_entrega_esperada = fecha_entrega_esperada;
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

    public String getDireccion_entrega() {
        return direccion_entrega;
    }

    public void setDireccion_entrega(String direccion_entrega) {
        this.direccion_entrega = direccion_entrega;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    


}
