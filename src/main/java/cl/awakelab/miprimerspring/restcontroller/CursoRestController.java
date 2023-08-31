package cl.awakelab.miprimerspring.restcontroller;

import cl.awakelab.miprimerspring.entity.Curso;
import cl.awakelab.miprimerspring.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/curso")
public class CursoRestController {
    @Autowired
    ICursoService objCursoService;

    @PostMapping
    public Curso crearCurso(@RequestBody Curso curso){
        return objCursoService.crearCurso(curso);
    }

    @PostMapping
    public Curso actualizarCurso(@RequestBody int id, Curso curso){
        return objCursoService.actualizarCurso(id, curso);
    }
    @GetMapping
    public List<Curso> listarCursos() {return objCursoService.listarCursos();}

    @PostMapping
    public Curso devolverCursoId(@RequestBody int id){return objCursoService.devolverCursoId(id);}

    @PostMapping
    public void eliminarCurso(@RequestBody int id){objCursoService.eliminarCurso(id);}

    @PostMapping
    public void eliminarCurso2(@RequestBody Curso curso){objCursoService.elminarCurso2(curso);}
}
