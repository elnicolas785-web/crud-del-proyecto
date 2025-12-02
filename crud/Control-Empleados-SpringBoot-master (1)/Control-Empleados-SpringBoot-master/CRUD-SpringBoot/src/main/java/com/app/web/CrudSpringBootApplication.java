package com.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.web.entity.Empleado;
import com.app.web.repositorio.EmpleadoRepositorio;

@SpringBootApplication
public class CrudSpringBootApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CrudSpringBootApplication.class, args);
    }

    @Autowired
    private EmpleadoRepositorio repositorio;

    @Override
    public void run(String... args) throws Exception {
        /*
        Empleado empleado1 = new Empleado("Christian", "Ramirez", "cris20@gmail.com");
        repositorio.save(empleado1);

        Empleado empleado2 = new Empleado("Andre", "Carrillo", "andrecar20@gmail.com");
        repositorio.save(empleado2);
        */
    }

}