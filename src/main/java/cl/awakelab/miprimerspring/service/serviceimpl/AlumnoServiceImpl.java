package cl.awakelab.miprimerspring.service.serviceimpl;

import cl.awakelab.miprimerspring.entity.Alumno;
import cl.awakelab.miprimerspring.repository.IAlumnoRepository;
import cl.awakelab.miprimerspring.service.IAlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("alumnoserviceImpl")
public class AlumnoServiceImpl implements IAlumnoService {
    @Autowired
    IAlumnoRepository objAlumnorepo;
    @Override
    public Alumno crearAlumno(Alumno alumnoACrear) {
        Alumno alumno = new Alumno();
        alumno = objAlumnorepo.save(alumnoACrear);
        return alumno;
    }

    @Override
    public Alumno actualizarAlumno(int id) {
        return null;
    }

    @Override
    public List<Alumno> listarAlumno() {
        List<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos = objAlumnorepo.findAll();
        return listaAlumnos;
    }

    @Override
    public Alumno devolverAlumnoId() {
        return null;
    }

    @Override
    public void eliminarAlumno(int id) {

    }
}
