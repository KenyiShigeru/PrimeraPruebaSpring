package primer.ejemplo.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j //Esta anotacion es para poder usar el log de lombok en la clase
public class ControladorREST {

    @GetMapping("/")//Este metodo se ejecuta cuando se accede a la raiz del proyecto como en nodejs con app.get('/')
    public String Comienzo() {
        log.info("Ejecutando el metodo comienzo");//Este es un mensaje de log de lombok
        //Ese log se vera en la consola de la aplicacion como lo hace nodejs con console.log
        return "Mi primer proyecto con Spring Boot";
    };//Este metodo escrito con una lambda seria () -> "Mi primer proyecto con Spring Boot"


    
}
