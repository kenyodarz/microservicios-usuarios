package com.byKenyoDarz.microserviciosusuarios.Repositories;

import com.byKenyoDarz.microserviciosusuarios.Models.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepository extends JpaRepository <Alumno, Long> {
}
