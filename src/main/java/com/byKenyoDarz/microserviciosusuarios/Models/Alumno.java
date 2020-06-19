package com.byKenyoDarz.microserviciosusuarios.Models;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "alumnos")
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAlumnos;
    @Column
    private String Nombre;
    @Column
    private String Apellido;
    @Column
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;

    @PrePersist
    public void fechaCreacion(){
        this.createAt = new Date();
    }

    public Long getIdAlumnos() {
        return idAlumnos;
    }

    public void setIdAlumnos(Long idAlumnos) {
        this.idAlumnos = idAlumnos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
