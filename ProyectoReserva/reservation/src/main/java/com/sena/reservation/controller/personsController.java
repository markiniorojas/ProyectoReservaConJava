package com.sena.reservation.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.reservation.DTO.requestRegistrerPerson;
import com.sena.reservation.service.personsServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("api/v1/person")
public class personsController {
    /*
     * GET = Obtener datos o constutar
     * POST = Crear un registro
     * PUT = Actualización total
     * PATCH = Actualización parcial
     * DELETE = Eliminar
     */

     @Autowired
     private personsServices personsServices;

     @GetMapping("/")
     public ResponseEntity<Object> findAllPersons(){
        var ListPersons = personsServices.findAllPersons();
        return new ResponseEntity<Object>(ListPersons, HttpStatus.OK);
     }

     @GetMapping("/{id}")
     public ResponseEntity<Object> findByIdPersons(@PathVariable int id){
        var person = personsServices.findByIdPersons(id);
        return new ResponseEntity<>(person, HttpStatus.OK);
     }

     @PostMapping("/")
     public String postMethodName(@RequestBody requestRegistrerPerson person){
        personsServices.save(person);
        return "Register OK";
     }
}
