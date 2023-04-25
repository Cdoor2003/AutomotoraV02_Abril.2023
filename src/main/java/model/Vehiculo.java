package model;

public class Vehiculo {
    private String modelo;
    private int año;
    private int precio;
    private int kilometrosRecorrido;
    private String color;
    private String marca;

    public Vehiculo(String modelo, int año, int precio, int kilometrosRecorrido, String color, String marca) {
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
        this.kilometrosRecorrido = kilometrosRecorrido;
        this.color = color;
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String nombre) {
        this.modelo = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getKilometrosRecorrido() {
        return kilometrosRecorrido;
    }

    public void setKilometrosRecorrido(int kilometrosRecorrido) {
        this.kilometrosRecorrido = kilometrosRecorrido;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String toString(){
        return modelo+","+año+","+precio+","+kilometrosRecorrido+","+color+","+marca;
    }
}
