package cl.awakelab.miprimerspring.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cursos")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 1)
    private String nombreCurso;

    @ManyToMany(mappedBy = "ListaCursos")
    private List<Profesor> listaProfesores;

    @OneToMany(mappedBy = "cursoAsignado")
    private List<Alumno> listaAlumnos;

}
