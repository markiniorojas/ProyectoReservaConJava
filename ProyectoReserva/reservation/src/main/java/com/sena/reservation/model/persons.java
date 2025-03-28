package com.sena.reservation.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


/*  
 * anotacion para indicar que la clase es una entidad
 */

@Entity(name = "persons")
public class persons {

    // Id = Pk
    @Id

    //El valor es autoincrementado y se crea automaticamente
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Column es un valor de una columna de la tabla
    @Column(name="id_persons", length =  10)
    private int id_persons;

    @Column(name="name", length =  30)
    private String name;

    @Column(name="last_name", length =  30)
    private String last_name;

    @Column(name="phone", length =  30)
    private String phone;

    @Column(name="Age", length =  30)
    private int Age;

    public persons() {
    }

    public persons(int id_persons, String name, String last_name, String phone, int age) {
        this.id_persons = id_persons;
        this.name = name;
        this.last_name = last_name;
        this.phone = phone;
        Age = age;
    }

    public int getId_persons() {
        return id_persons;
    }

    public void setId_persons(int id_persons) {
        this.id_persons = id_persons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    

    
    
}
