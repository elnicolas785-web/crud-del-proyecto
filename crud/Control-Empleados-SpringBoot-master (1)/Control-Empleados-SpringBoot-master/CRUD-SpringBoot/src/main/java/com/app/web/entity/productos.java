package com.app.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;           
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class productos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Long id;
	
    @Column(name = "id_producto", nullable = false, length = 50)
    private String id_producto;

    @Column(name = " descripcion", nullable = false, length = 50)
    private String  descripcion;

    @Column(name = " id_categoria", nullable = false, length = 50)
    private String  id_categoria;

    @Column(name = "precio_compra", nullable = false, length = 50)
    private String precio_compra;

    @Column(name = " precio_venta", nullable = false, length = 50)
    private String  precio_venta;

    @Column(name = "stock_actual", nullable = false, length = 50)
    private String stock_actual;

    @Column(name = "stock_minimo", nullable = false, length = 50)
    private String stock_minimo;

    @Column(name = "unidad_medida", nullable = false, length = 50)
    private String unidad_medida;

    @Column(name = "id_proveedor", nullable = false, length = 50)
    private String id_proveedor;

    @Column(name = " fecha_creacion", nullable = false, length = 50)
    private String  fecha_creacion;
}
