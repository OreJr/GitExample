/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import core.Cat;
import core.Person;

/**
 *
 * @author PRESTAMOS J
 */
public class Main {
    public static void main(String[] args) {
        Person person= new Person(96854261, "Juan Perez", 23);
        System.out.println(person);
        Cat cat = new Cat("juanito", "22", "otraCosa");
        System.out.println(cat);
    }
}
