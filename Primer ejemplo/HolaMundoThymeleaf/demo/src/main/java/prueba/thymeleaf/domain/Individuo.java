package prueba.thymeleaf.domain;

import lombok.Data;
//Esta anotacion es para que lombok genere los metodos get y set sin necesidad de escribirlos
@Data
public class Individuo 
{
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private String edad;
}
