package prueba.thymeleaf.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;


import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j //Esta anotacion es para poder usar el log de lombok en la clase
public class ControladorREST {

    @GetMapping("/")//Este metodo se ejecuta cuando se accede a la raiz del proyecto como en nodejs con app.get('/')
    public String Comienzo() {
        log.info("Ejecutando el metodo comienzo");//Este es un mensaje de log de lombok
        //Ese log se vera en la consola de la aplicacion como lo hace nodejs con console.log
        return "Holamundo Thymeleaf";
    };//Este metodo escrito con una lambda seria () -> "Mi primer proyecto con Spring Boot"


    
}
