package cl.awakelab.miprimerspring.restcontroller;

import cl.awakelab.miprimerspring.entity.Alumno;
import cl.awakelab.miprimerspring.service.IAlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alumno")
public class AlumnoRestController {
    @Autowired
    IAlumnoService objAlumnoService;

    @PostMapping
    public Alumno crearAlumno(@RequestBody Alumno alumno){
        return objAlumnoService.crearAlumno(alumno);
    }
    @GetMapping
    public List<Alumno> listarAlumno() { return objAlumnoService.listarAlumno();}

    @PostMapping
    public Alumno actualizarAlumno(@RequestBody int id, Alumno alumno){
        return objAlumnoService.actualizarAlumno(id, alumno);
    }
    @PostMapping
    public Alumno devolverAlumnoId(@RequestBody int id) {return objAlumnoService.devolverAlumnoId(id);}

    @PostMapping
    public void eliminarAlumno(@RequestBody int id) {objAlumnoService.eliminarAlumno(id);}

    @PostMapping
    public void elminarAlumno2(@RequestBody Alumno alumno) {objAlumnoService.elminarAlumno2(alumno);}


}
