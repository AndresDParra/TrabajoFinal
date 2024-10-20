package org.example.TrabajoFinal;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String color;
    private String placa;
    private int numeroRuedas;
    private int numeroAsientos;


    public Vehiculo(String marca, String modelo, String color, String placa, int numeroRuedas, int numeroAsientos) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.placa = placa;
        this.numeroRuedas = numeroRuedas;
        this.numeroAsientos = numeroAsientos;

    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    public static class Administrador extends Persona {
            public Administrador(String nombre, String apellido, String cedula, String telefono, String direccion) {
            super(nombre, apellido, cedula, telefono, direccion);
        }
    }
}
