package pe.edu.upc.prueba.models;


import lombok.Data;

@Data
public class Response {
    private int status;
    private String message = "";
    private Object result;
}
