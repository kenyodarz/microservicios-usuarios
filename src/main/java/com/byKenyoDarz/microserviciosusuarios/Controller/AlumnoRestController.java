package com.byKenyoDarz.microserviciosusuarios.Controller;

import com.byKenyoDarz.microserviciosusuarios.Models.Alumno;
import com.byKenyoDarz.microserviciosusuarios.Services.AlumnoServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlumnoRestController {

    @Autowired
    AlumnoServiceAPI serviceAPI;

    @GetMapping("/all")
    public List<Alumno> getAll(){
        return  serviceAPI.getAll();
    }

    @GetMapping("/find/{id}")
    public Alumno find(@PathVariable Long id){
        return serviceAPI.get(id);
    }

    @PostMapping("/save")
    public ResponseEntity <Alumno> save (@RequestBody Alumno alumno){
        Alumno obj = serviceAPI.save(alumno);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity <Alumno> delete (@PathVariable Long id){
        Alumno alumno = serviceAPI.get(id);
        if (alumno != null){
            serviceAPI.delete(id);
        }else {
            return new ResponseEntity<>(alumno, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(alumno, HttpStatus.OK);
    }
}
