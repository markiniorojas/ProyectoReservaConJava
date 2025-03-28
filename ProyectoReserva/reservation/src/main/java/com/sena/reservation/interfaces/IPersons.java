package com.sena.reservation.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.reservation.model.persons;

@Repository
public interface IPersons extends JpaRepository<persons, Integer>{

}
