package org.example.TrabajoFinal;

import java.util.ArrayList;
import java.util.List;

public class Concecionario {
    private String nombre;
    private ArrayList<Empleado> empleados;
    private static ArrayList<Vehiculo> vehiculos;
    private ArrayList<Administrador> administradores;
    private static ArrayList<Cliente> clientes;
    private static ArrayList<Alquiler> alquileres;
    private static ArrayList<Venta> ventas;
    private static ArrayList<RegistroTransacciones> transacciones;

    public Concecionario(String nombre, ArrayList<Empleado> empleados, ArrayList<Vehiculo> vehiculos, ArrayList<Administrador> administradores, ArrayList<Cliente> clientes, ArrayList<RegistroTransacciones> transacciones) {
        this.nombre = nombre;
        this.empleados = empleados;
        Concecionario.vehiculos = vehiculos;
        this.administradores = administradores;
        Concecionario.clientes = clientes;
        Concecionario.transacciones = transacciones;


    }


    public static ArrayList<Alquiler> getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(ArrayList<Alquiler> alquileres) {
        Concecionario.alquileres = alquileres;
    }

    public static ArrayList<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public static ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        Concecionario.vehiculos = vehiculos;
    }

    public List<Administrador> getAdministradores() {
        return administradores;
    }

    public void setAdministradores(ArrayList<Administrador> administradores) {
        this.administradores = administradores;
    }

    public static ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        Concecionario.clientes = clientes;
    }

    public static ArrayList<RegistroTransacciones> getTransacciones() {
        return transacciones;
    }

    public static void setTransacciones(ArrayList<RegistroTransacciones> transacciones) {
        Concecionario.transacciones = transacciones;
    }

    @Override
    public String toString() {
        return "Concecionario{" +
                "nombre='" + nombre + '\'' +
                ", empleados=" + empleados +
                ", vehiculos=" + vehiculos +
                ", administradores=" + administradores +
                ", clientes=" + clientes +
                '}';
    }


}
