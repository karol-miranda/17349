package mx.uv.listi.SaludarDatos;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import mx.uv.listi.SaludarDatos.Isaludadores;
import mx.uv.listi.SaludarDatos.Saludadores;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin
@RestController
public class App {
    @Autowired
    Isaludadores isaludadores;

    @RequestMapping(value = "/saludos", method = RequestMethod.GET)
    public Iterable<Saludadores> obtenerSaludos(){
        return isaludadores.findAll();
    }
    @RequestMapping(value = "/saludos", method = RequestMethod.POST)
    public void crearSaludos(@RequestBody Saludadores saludadores){
        isaludadores.save(saludadores);
    }
}