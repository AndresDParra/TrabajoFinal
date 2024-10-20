package org.example.TrabajoFinal;

import java.time.LocalDate;
import java.time.LocalTime;

public class Venta {
    private LocalDate fecha;
    private LocalTime hora;
    private float monto;
    private String tipoPago;
    private String tipoVenta;
    private String idVehiculo;
    private String idCliente;
    private String idAdministrador;

    public Venta(LocalDate fecha, LocalTime hora, float monto, String tipoPago, String tipoVenta, String idVehiculo, Cliente idCliente, String idAdministrador) {
        this.fecha = fecha;
        this.hora = hora;
        this.monto = monto;
        this.tipoPago = tipoPago;
        this.tipoVenta = tipoVenta;
        this.idVehiculo = idVehiculo;
        this.idCliente = idCliente;
        this.idAdministrador = idAdministrador;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getTipoVenta() {
        return tipoVenta;
    }

    public void setTipoVenta(String tipoVenta) {
        this.tipoVenta = tipoVenta;
    }

    public String getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(String idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(String idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", monto='" + monto + '\'' +
                ", tipoPago='" + tipoPago + '\'' +
                ", tipoVenta='" + tipoVenta + '\'' +
                ", idVehiculo='" + idVehiculo + '\'' +
                ", idCliente='" + idCliente + '\'' +
                ", idAdministrador='" + idAdministrador + '\'' +
                '}';
    }
}
