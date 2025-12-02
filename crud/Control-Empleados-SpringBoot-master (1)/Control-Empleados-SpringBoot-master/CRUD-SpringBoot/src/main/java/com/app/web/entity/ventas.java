package com.app.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;           
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ventas")
public class ventas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Long id;
	
    @Column(name = "id_venta", nullable = false, length = 50)
    private String id_venta;

    @Column(name = "numero_factura", nullable = false, length = 50)
    private String numero_factura;

    @Column(name = " fecha_venta", nullable = false, length = 50)
    private String  fecha_venta;

    @Column(name = "id_cliente", nullable = false, length = 50)
    private String id_cliente;

    @Column(name = "id_vendedor", nullable = false, length = 50)
    private String id_vendedor;

    @Column(name = "subtotal", nullable = false, length = 50)
    private String subtotal;

    @Column(name = "total", nullable = false, length = 50)
    private String total;

    @Column(name = "estado", nullable = false, length = 50)
    private String estado;

    @Column(name = "metodo_pago", nullable = false, length = 50)
    private String metodo_pago;

    @Column(name = "observaciones", nullable = false, length = 50)
    private String observaciones;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getId_venta() {
        return id_venta;
    }

    public void setId_venta(String id_venta) {
        this.id_venta = id_venta;
    }

    public String getNumero_factura() {
        return numero_factura;
    }

    public void setNumero_factura(String numero_factura) {
        this.numero_factura = numero_factura;
    }

    public String getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(String fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getId_vendedor() {
        return id_vendedor;
    }

    public void setId_vendedor(String id_vendedor) {
        this.id_vendedor = id_vendedor;
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

    public String getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    
}
