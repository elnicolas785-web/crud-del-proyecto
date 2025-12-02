package com.app.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;           
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movimientos_inventario")
public class movimientos_inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Long id;
	
    @Column(name = "id_movimiento", nullable = false, length = 50)
    private String id_movimiento;

    @Column(name = "id_producto", nullable = false, length = 50)
    private String id_producto;

    @Column(name = " tipo_movimiento", nullable = false, length = 50)
    private String  tipo_movimiento;

    @Column(name = "cantidad", nullable = false, length = 50)
    private String cantidad;

    @Column(name = "stock_anterior", nullable = false, length = 50)
    private String stock_anterior;

    @Column(name = "stock_nuevo", nullable = false, length = 50)
    private String stock_nuevo;

    @Column(name = "motivo", nullable = false, length = 50)
    private String motivo;

    @Column(name = "id_usuario", nullable = false, length = 50)
    private String id_usuario;

    @Column(name = "fecha_movimiento", nullable = false, length = 50)
    private String fecha_movimiento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getId_movimiento() {
        return id_movimiento;
    }

    public void setId_movimiento(String id_movimiento) {
        this.id_movimiento = id_movimiento;
    }

    public String getId_producto() {
        return id_producto;
    }

    public void setId_producto(String id_producto) {
        this.id_producto = id_producto;
    }

    public String getTipo_movimiento() {
        return tipo_movimiento;
    }

    public void setTipo_movimiento(String tipo_movimiento) {
        this.tipo_movimiento = tipo_movimiento;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getStock_anterior() {
        return stock_anterior;
    }

    public void setStock_anterior(String stock_anterior) {
        this.stock_anterior = stock_anterior;
    }

    public String getStock_nuevo() {
        return stock_nuevo;
    }

    public void setStock_nuevo(String stock_nuevo) {
        this.stock_nuevo = stock_nuevo;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getFecha_movimiento() {
        return fecha_movimiento;
    }

    public void setFecha_movimiento(String fecha_movimiento) {
        this.fecha_movimiento = fecha_movimiento;
    }
    
}
