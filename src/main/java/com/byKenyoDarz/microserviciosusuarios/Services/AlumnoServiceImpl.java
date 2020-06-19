package com.byKenyoDarz.microserviciosusuarios.Services;

import com.byKenyoDarz.microserviciosusuarios.Models.Alumno;
import com.byKenyoDarz.microserviciosusuarios.Repositories.AlumnoRepository;
import com.byKenyoDarz.microserviciosusuarios.Utils.GenericServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class AlumnoServiceImpl extends GenericServiceImpl <Alumno, Long> implements AlumnoServiceAPI {

    @Autowired
    AlumnoRepository repository;


    @Override
    public JpaRepository<Alumno, Long> getRepository() {
        return repository;
    }
}
