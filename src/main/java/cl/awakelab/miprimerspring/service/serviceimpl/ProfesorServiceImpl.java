package cl.awakelab.miprimerspring.service.serviceimpl;

import cl.awakelab.miprimerspring.entity.Profesor;
import cl.awakelab.miprimerspring.repository.IProfesorRepository;
import cl.awakelab.miprimerspring.service.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("profesorServiceImpl")
public class ProfesorServiceImpl implements IProfesorService {
    @Autowired
    IProfesorRepository objProfesorRepo;
    @Override
    public Profesor crearProfesor(Profesor profesorACrear) {
        Profesor profesor = new Profesor();
        profesor = objProfesorRepo.save(profesorACrear);
        return profesor;
    }

    @Override
    public Profesor actualizarProfesor(int id) {
        return null;
    }

    @Override
    public List<Profesor> listarProfesores() {
        List<Profesor> listarProfesores = new ArrayList<>();
        listarProfesores = objProfesorRepo.findAll();
        return listarProfesores;
    }

    @Override
    public Profesor devolverProfesorId(int id) {
        return null;
    }

    @Override
    public void eliminarProfesor(int id) {

    }
}
