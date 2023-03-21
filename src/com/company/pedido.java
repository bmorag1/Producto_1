package com.company;

import java.util.Date;

public class pedido {
    public Integer num_pedido;
    public String cliente;
    public String articulo;
    public Integer unidades;
    public Date fecha_hora = new Date();

    public Integer getNum_pedido(){
        return num_pedido;
    }
    public String getCliente(){
        return cliente;
    }
    public String getArticulo(){
        return articulo;
    }
    public Integer getUnidades(){
        return unidades;
    }
    public Date getFecha_hora(){
        return fecha_hora;
    }

    public pedido(Integer num_pedido, String cliente, String articulo, Integer unidades, Date fecha_hora){
        this.num_pedido = num_pedido;
        this.cliente = cliente;
        this.articulo= articulo;
        this.unidades = unidades;
        this.fecha_hora = fecha_hora;
    }

    public void setNum_pedido(Integer num_pedido) {
        this.num_pedido = num_pedido;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public void setUnidades(Integer unidades) {
        this.unidades = unidades;
    }

    public void setFecha_hora(Date fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    @Override
    public String toString() {
        return "pedido{" +
                "num_pedido=" + num_pedido +
                ", cliente='" + cliente + '\'' +
                ", articulo='" + articulo + '\'' +
                ", unidades=" + unidades +
                ", fecha_hora=" + fecha_hora +
                '}';
    }
}
