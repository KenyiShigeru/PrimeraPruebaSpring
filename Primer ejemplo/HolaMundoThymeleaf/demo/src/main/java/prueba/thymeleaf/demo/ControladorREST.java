package prueba.thymeleaf.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j //Esta anotacion es para poder usar el log de lombok en la clase
public class ControladorREST {

    @Value("${indice.hola2}")//Esta anotacion es para poder usar las variables de entorno
    private String mensaje;

    @GetMapping("/")//Este metodo se ejecuta cuando se accede a la raiz del proyecto como en nodejs con app.get('/')
    public String Comienzo(Model Modelo) {
        String hola = "Hola Mundo con Spring Boot y Thymeleaf";
        log.info("Ejecutando un controlador MVC");//Este es un mensaje de log de lombok
        //Ese log se vera en la consola de la aplicacion como lo hace nodejs con console.log

        Modelo.addAttribute("mensaje", hola);//Este es un atributo que se le pasa a la vista

        Modelo.addAttribute("mensaje2", mensaje);//Este es un atributo que se le pasa a la vista
        return "index";//Este metodo retorna el nombre de la vista que se va a mostrar
    };//Este metodo escrito con una lambda seria () -> "Mi primer proyecto con Spring Boot"


    
}
