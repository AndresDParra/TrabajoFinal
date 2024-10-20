package org.example.TrabajoFinal;

import java.time.LocalDate;
import java.time.LocalTime;

public class RegistroTransacciones {
    private LocalDate fecha;
    private LocalTime hora;
    private String tipoTransaccion;
    private String descripcion;
    private Cliente cliente;

    public RegistroTransacciones(LocalDate fecha, LocalTime hora, String tipoTransaccion, String descripcion, Cliente cliente) {
        this.fecha = fecha;
        this.hora = hora;
        this.tipoTransaccion = tipoTransaccion;
        this.descripcion = descripcion;
        this.cliente = cliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "RegistroTransacciones{" +
                "fecha=" + fecha +
                ", hora=" + hora +
                ", tipoTransaccion='" + tipoTransaccion + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", cliente=" + cliente +
                '}';
    }
}
