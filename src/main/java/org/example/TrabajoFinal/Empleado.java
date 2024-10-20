package org.example.TrabajoFinal;

import java.time.LocalDate;
import java.time.LocalTime;

public class Empleado extends Persona {

    private String puesto;

    public Empleado(String nombre, String apellido, String cedula, String telefono, String direccion, String puesto) {
        super(nombre, apellido, cedula, telefono, direccion);
        this.puesto = puesto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void agregarVehiculo(String marca, String modelo, String color, String placa, int numeroRuedas, int numeroAsientos) {
        Vehiculo vehiculo = new Vehiculo(marca, modelo, color, placa, numeroRuedas, numeroAsientos);
        Concecionario.getVehiculos().add(vehiculo);
    }

    public void agregarCliente(String nombre, String apellido, String cedula, String telefono, String direccion) {
        Cliente cliente = new Cliente(nombre, apellido, cedula, telefono, direccion);
        Concecionario.getClientes().add(cliente);
    }

    public void agregarAlquiler(Vehiculo vehiculo, Cliente cliente, Administrador administrador, LocalDate fechaInicio, LocalDate fechaFin, LocalTime horaInicio, LocalTime horaFin, String lugarRecogida, String lugarEntrega, Float precioTotal, String idAlquiler) {
        float precioTotalAux = 0;
        switch (vehiculo()){
            case AUTO:

                break;
            case MOTOCICLETA:
                vehiculo.setEstado(ESTADO_VEHICULO.ALQUILADO);
                break;
            case CAMION:
                vehiculo.setEstado(ESTADO_VEHICULO.ALQUILADO);
                break;
        }
        Alquiler alquiler = new Alquiler(vehiculo, cliente, administrador, fechaInicio, fechaFin, horaInicio, horaFin, lugarRecogida, lugarEntrega, precioTotal, idAlquiler );
        Concecionario.getAlquileres().add(alquiler);
    }

    public String crearVenta(LocalDate fecha, LocalTime hora, float monto, String tipoPago, String tipoVenta,
                             String idVehiculo, Cliente clienteDeVenta, String idAdministrador) {

        Venta nuevaVenta = new Venta(fecha, hora, monto, tipoPago, tipoVenta, idVehiculo, clienteDeVenta, idAdministrador);
        Concecionario.getVentas().add(nuevaVenta);

        RegistroTransacciones transacccion = new RegistroTransacciones(fecha, hora, puesto, puesto, clienteDeVenta);
        Concecionario.getTransacciones().add(transacccion);

        return "La venta se ha realizado con éxito";
    }

    public Cliente buscarCliente(Cliente clienteAux) throws Exception {
        try {
            for (Cliente cliente : Concecionario.getClientes()) {
                if (cliente.getCedula().equals(clienteAux.getCedula())) {
                    return cliente;
                }
            }
        } catch (NullPointerException e) {
            throw new ClienteNotFound("No se ha encontrado el cliente");
        }
        return null;
    }

    public Alquiler buscarAlquiler(Alquiler alquilerAux) throws Exception {
        try {
            for (Alquiler alquiler : Concecionario.getAlquileres()) {
                if (alquiler.getIdAlquiler().equals(alquilerAux.getIdAlquiler())) {
                    return alquiler;
                }
            }
        } catch (NullPointerException e) {
            throw new AlquilerNotFound("No se ha encontrado el alquiler");
        }
        return null;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "puesto='" + puesto + '\''+
                "Nombre="+ getNombre() + '\''+
                "Apellido="+ getApellido() + '\''+
                "Cedula="+ getCedula() + '\''+
                "Telefono="+ getTelefono() + '\''+
                "Direccion="+ getDireccion() + '\''+
                '}';
    }
}