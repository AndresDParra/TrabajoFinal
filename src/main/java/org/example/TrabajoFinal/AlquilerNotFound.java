package org.example.TrabajoFinal;

public class AlquilerNotFound extends Exception{
    public AlquilerNotFound(String message) {
        super(message);
    }
    public AlquilerNotFound(String message, Throwable cause) {
        super(message, cause);
    }
    public AlquilerNotFound(Throwable cause) {
        super(cause);
    }
}
