package com.sena.reservation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.reservation.interfaces.IPersons;
import com.sena.reservation.model.persons;

@Service
public class personsServices {


    /*
     * @Autowire incluye la conexion de la interfaz
     */
    @Autowired
    private IPersons PersonsData;

    //mostrar todos los registros
    public List<persons> findAllPersons(){
        return PersonsData.findAll();
    }

    //buscar por id
    public Optional<persons> findByIdPersons(int id){
        return PersonsData.findById(id);
    }


    //guardar registro
    public void save(persons person){
        PersonsData.save(person);
    }

    //actualiza el registro
    public void update(int id, persons personUpdate){
        var person = findByIdPersons(id);
        if(person.isPresent()){
            person.get().setName(personUpdate.getName());
            person.get().setLast_name(personUpdate.getLast_name());
            person.get().setPhone(personUpdate.getPhone());
            person.get().setAge(personUpdate.getAge());
            PersonsData.save(person.get());
        }
    }


    //eliminar registro de una persona
    public void delete(int id){
        var person=findByIdPersons(id);
        if (person.isPresent()){
            PersonsData.delete(person.get());
        }
    }
}
