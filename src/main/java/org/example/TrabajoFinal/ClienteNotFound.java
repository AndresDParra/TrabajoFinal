package org.example.TrabajoFinal;

public class ClienteNotFound extends Exception{
    public ClienteNotFound(String message) {
        super(message);
    }
    public ClienteNotFound(String message, Throwable cause) {
        super(message, cause);
    }
    public ClienteNotFound(Throwable cause) {
        super(cause);
    }
}
