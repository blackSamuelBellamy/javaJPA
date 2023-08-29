package cl.awakelab.miprimerspring.service;

import cl.awakelab.miprimerspring.entity.Profesor;

import java.util.List;

public interface IProfesorService {
    public Profesor crearProfesor(Profesor profesorACrear);
    public Profesor actualizarProfesor(int id);
    public List<Profesor> listarProfesores();
    public Profesor devolverProfesorId(int id);
    public void eliminarProfesor(int id);
}
