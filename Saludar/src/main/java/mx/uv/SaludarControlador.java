package mx.uv.listi.c17349.Saludar;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
@RestController
public class SaludarControlador {

    Saludador persona;

    @RequestMapping("/")
    public String home() {
        return "hola mundo";
    }

    @GetMapping("/saludar/{nombre}")
    public String saludar(@PathVariable (required = false) String nombre) {
        if (nombre != null) 
            return "hola " + nombre;
        return "hola default name";
    }

    @RequestMapping(value = "/saludar2", method = RequestMethod.GET)
    public Saludador mostrar() {
        Saludador s = new Saludador("xxx");
        return s;
    }

    ////mejora en los metodos y sus verbos
    @GetMapping("/saludarget")
    public Saludador saludarGet(){
        Saludador s;
        return this.persona;
    }

    @PostMapping("/saludarpost")
    public void saludarPost(@RequestBody Saludador s){
        System.out.println(s);
        this.persona = s;
    }

    @GetMapping("/query")
    public void saludarPut(@RequestParam String nombre){
        System.out.println(nombre);
    }

    @GetMapping("/backend")
    public String backend(@RequestParam String nombre, @RequestParam String password){
        System.out.println("~~~Resultado: " + nombre + "---" + password);
        return "exito";
    }
}