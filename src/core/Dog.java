/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author orested
 */
public class Dog {
    private String nombre;
    private double edad;

    public Dog(String nombre, double edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Dog{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
}
