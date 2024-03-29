package cl.awakelab.miprimerspring.service;

import cl.awakelab.miprimerspring.entity.Alumno;

import java.util.List;
public interface IAlumnoService {

    public Alumno crearAlumno(Alumno alumnoACrear);
    public Alumno actualizarAlumno(int id, Alumno alumno);
    public List<Alumno> listarAlumno();
    public Alumno devolverAlumnoId(int id);
    public void eliminarAlumno(int id);
    public void elminarAlumno2(Alumno alumno);
}
