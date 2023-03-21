package com.company;

public class cliente {
    public String nombre;
    public String nif;
    public String direccion;
    public String email;

    public String getNombre(){
        return nombre;
    }
    public String getNif(){
        return nif;
    }
    public String getDireccion(){
        return direccion;
    }
    public String getEmail(){
        return email;
    }

    public cliente(String nombre, String nif, String direccion, String email){
        this.nombre = nombre;
        this.nif = nif;
        this.direccion = direccion;
        this.email = email;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    public void setNif(String nif) {
        this.nif=nif;
    }

    public void setDireccion(String direccion) {
        this.direccion=direccion;
    }

    public void setEmail(String email) {
        this.email=email;
    }

    @Override
    public String toString() {
        return "cliente{" +
                "nombre='" + nombre + '\'' +
                ", nif='" + nif + '\'' +
                ", direccion='" + direccion + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
