/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author orested
 */
public class Cat {
    private String nombre;
    private String edad;
    private String otra;

    public Cat(String nombre, String edad, String otra) {
        this.nombre = nombre;
        this.edad = edad;
        this.otra = otra;
    }

    @Override
    public String toString() {
        return "Cat{" + "nombre=" + nombre + ", edad=" + edad + ", otra=" + otra + '}';
    }
    
    
}
