package com.sena.reservation.DTO;

public class requestRegistrerPerson {

    /*
     * Agregar al DTO solo los elementos a exponer segun
     * la peticion
     */

     private int id;
     private String name;
     private String lastName;
     private int phone;
     private int age;

    public requestRegistrerPerson() {
    }

    public requestRegistrerPerson(int id, String name, String lastName, int phone, int age) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
