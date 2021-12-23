package com.example.demo.models;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "solicitud")
public class SolicitudModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;
    private int estado;
    private Date fecha_ingreso;
    private double monto;
    @Column(unique = true, nullable = false)
    private String id_cliente;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getEstado() {
        return estado;
    }
    public void setEstado(int estado) {
        this.estado = estado;
    }
    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }
    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }
    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
    public String getId_cliente() {
        return id_cliente;
    }
    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }


    
}
