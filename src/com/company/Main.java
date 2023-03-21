package com.company;

public class Main {

    public static void main(String[] args) {
	articulo articulo1 = new articulo("1AS","Blando y esponjoso",2.34,2.56,3);
    articulo1.setCodigo("1AA");
    articulo1.setDescripcion("So nice");
    articulo1.setGastos_envio(2.00);
    articulo1.setPrecio_venta(7.75);
    articulo1.setTiempo_preparacion(1);

    System.out.println(articulo1.getcodigo());
    System.out.println(articulo1.getDescripcion());
    System.out.println(articulo1.getGastos_envio());
    System.out.println(articulo1.getPrecio_venta());
    System.out.println((articulo1.getTiempo_preparacion()));

    cliente cliente1 = new cliente("Pepito","23475894R", "Calle Boleros 2","pep12@gmail.com");
    cliente1.setNombre("Pepito");
    cliente1.setNif("23475894R");
    cliente1.setDireccion("Calle Boleros 2");
    cliente1.setEmail("pep12@gmail.com");

    System.out.println(cliente1.getNombre());
    System.out.println(cliente1.getNif());
    System.out.println((cliente1.getDireccion()));
    System.out.println(cliente1.getEmail());

    pedido pedido1 = new pedido(001,"Pedro","Paraguas",3,2023-12-09);
    pedido1.setNum_pedido(001);
    pedido1.setCliente("Pedro");
    pedido1.setArticulo("Parguas");
    pedido1.setUnidades(2);
    pedido1.setFecha_hora();

    System.out.println(pedido1.getNum_pedido());
    System.out.println(pedido1.getCliente());
    System.out.println(pedido1.getArticulo());
    System.out.println(pedido1.getUnidades());
    System.out.println(pedido1.getFecha_hora());

    }
}
