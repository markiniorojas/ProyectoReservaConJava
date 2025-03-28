package com.sena.reservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.PathVariable;

import com.sena.reservation.service.personsServices;

@RestController
@RequestMapping("api/v1/persons")
public class personController {

    /*
     * GET = obtener datos o consultar
     * POST = crear un nuevo registro
     * PUT = actualizacion total del registro que yo deseo modificar
     * PATCH = actualizacion parcial
     * DELETE = eliminar
     */

     @Autowired
     private personsServices  personsServices;

    @GetMapping("/")
        public ResponseEntity<Object> findAllPersons(){
            var ListPersons=personsServices.findAllPersons();
            return new ResponseEntity<Object>(ListPersons,HttpStatus.OK);
        }
    

    @GetMapping("/{id}")
    public ResponseEntity<Object> findByIdPersons(@PathVariable int id){
        var person=personsServices.findByIdPersons(id);
        return new ResponseEntity<>(person,HttpStatus.OK);
    }
}
