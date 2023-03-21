package com.company;

public class articulo {
    public String codigo;
    public String descripcion;
    public Double precio_venta;
    public Double gastos_envio;
    public Integer tiempo_preparacion;

    public String getcodigo(){
        return codigo;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public Double getPrecio_venta(){
        return precio_venta;
    }
    public Double getGastos_envio(){
        return gastos_envio;
    }
    public Integer getTiempo_preparacion(){
        return tiempo_preparacion;
    }

    public articulo(String codigo, String descripcion, Double precio_venta, Double gastos_envio, Integer tiempo_preparacion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio_venta = precio_venta;
        this.gastos_envio = gastos_envio;
        this.tiempo_preparacion = tiempo_preparacion;
    }

    public void setCodigo(String codigo){
        this.codigo=codigo;
    }
    public  void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    public void setPrecio_venta(Double precio_venta){
        this.precio_venta=precio_venta;
    }
    public void setGastos_envio(Double gastos_envio){
        this.gastos_envio=gastos_envio;
    }
    public void setTiempo_preparacion(Integer tiempo_preparacion){
        this.tiempo_preparacion=tiempo_preparacion;
    }

    @Override
    public String toString() {
        return "articulo{" +
                "codigo='" + codigo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio_venta=" + precio_venta +
                ", gastos_envio=" + gastos_envio +
                ", tiempo_preparacion=" + tiempo_preparacion +
                '}';
    }
    }
