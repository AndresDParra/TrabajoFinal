package org.example.TrabajoFinal;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEmpleado {
    @Test
    public void testAgregarVehiculo() {
        Empleado empleado = new Empleado("Juan", "Perez", "123456789", "0987654321", "Quito", "Vendedor");
        Concecionario concecionario = new Concecionario("Concecionario 1", new ArrayList<Empleado>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        concecionario.getEmpleados().add(empleado);
        empleado.agregarVehiculo("Chevrolet", "Aveo", "Rojo", "ABC-123", "4", "5");

        // Check if the vehicle was added to the concecionario
        assertEquals(1, Concecionario.getVehiculos().size());
        Vehiculo vehiculo = Concecionario.getVehiculos().get(0);
        assertEquals("Chevrolet", vehiculo.getMarca());
        assertEquals("Aveo", vehiculo.getModelo());
        assertEquals("Rojo", vehiculo.getColor());
        assertEquals("ABC-123", vehiculo.getPlaca());
        assertEquals("4", vehiculo.getNumeroRuedas());
        assertEquals("5", vehiculo.getNumeroAsientos());
    }
}