package cl.awakelab.miprimerspring.service.serviceimpl;

import cl.awakelab.miprimerspring.entity.Curso;
import cl.awakelab.miprimerspring.repository.ICursoRepository;
import cl.awakelab.miprimerspring.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("cursoServiceImpl")
public class CursoServiceImpl implements ICursoService {
    @Autowired
    ICursoRepository objCursoRepo;
    @Override
    public Curso crearCurso(Curso cursoACrear) {
        Curso curso = new Curso();
        curso = objCursoRepo.save(cursoACrear);
        return curso;
    }

    @Override
    public Curso actualizarCurso(int id) {
        return null;
    }

    @Override
    public List<Curso> listarCursos() {
        List<Curso> listaCursos = new ArrayList<>();
        listaCursos = objCursoRepo.findAll();
        return listaCursos;
    }

    @Override
    public Curso devolverCursoId(int id) {
        return null;
    }

    @Override
    public void eliminarCurso(int id) {

    }
}
