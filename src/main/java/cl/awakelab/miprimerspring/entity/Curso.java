package cl.awakelab.miprimerspring.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @Column(length = 30)
    private String nombreCurso;

    @JsonIgnore
    @ManyToMany(mappedBy = "listaCursos", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Profesor> listaProfesores;

    @JsonIgnore
    @OneToMany(mappedBy = "cursoAsignado")
    private List<Alumno> listaAlumnos;

}
