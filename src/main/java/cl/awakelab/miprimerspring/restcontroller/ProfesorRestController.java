package cl.awakelab.miprimerspring.restcontroller;

import cl.awakelab.miprimerspring.entity.Profesor;
import cl.awakelab.miprimerspring.service.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/profesor")
public class ProfesorRestController {
    @Autowired
    IProfesorService objProfesorService;

    @PostMapping
    public Profesor crearProfesor(@RequestBody Profesor profesor) {
        return objProfesorService.crearProfesor((profesor));
    }
    @PostMapping
    public Profesor actualizarProfesor(@RequestBody int id, Profesor profesor){
        return objProfesorService.actualizarProfesor(id, profesor);
    }
    @GetMapping
    public List<Profesor> listarProfesores(){return objProfesorService.listarProfesores();}

    @PostMapping
    public Profesor devolverProfesorId(@RequestBody int id){return objProfesorService.devolverProfesorId(id);}

    @PostMapping
    public void eliminarProfesor(@RequestBody int id){objProfesorService.eliminarProfesor(id);}

    @PostMapping
    public void eliminarProfesor2(@RequestBody Profesor profesor){objProfesorService.eliminarProfesor2(profesor);}


}
