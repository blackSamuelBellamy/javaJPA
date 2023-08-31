package cl.awakelab.miprimerspring.service.serviceimpl;

import cl.awakelab.miprimerspring.entity.Alumno;
import cl.awakelab.miprimerspring.repository.IAlumnoRepository;
import cl.awakelab.miprimerspring.service.IAlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("alumnoServiceImpl")
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
    public Alumno actualizarAlumno(int id, Alumno alumnoActualizar) {
        Alumno alumnoEncontrado = objAlumnorepo.findById(id).orElse(null);
        alumnoEncontrado.setNombres(alumnoActualizar.getNombres());
        alumnoEncontrado.setApellido1(alumnoActualizar.getApellido1());
        alumnoEncontrado.setApellido2(alumnoActualizar.getApellido2());
        alumnoEncontrado.setCursoAsignado(alumnoActualizar.getCursoAsignado());
        return objAlumnorepo.save(alumnoEncontrado);
    }

    @Override
    public List<Alumno> listarAlumno() {
        List<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos = objAlumnorepo.findAll();
        return listaAlumnos;
    }

    @Override
    public Alumno devolverAlumnoId(int id) {
        return objAlumnorepo.findById(id).orElse(null);
    }

    @Override
    public void eliminarAlumno(int id) {
        objAlumnorepo.deleteById(id);
    }

    @Override
    public void elminarAlumno2(Alumno alumno) {
        objAlumnorepo.delete(alumno);
    }
}
