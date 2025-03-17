/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author orested
 */
public class Person {
    private long ID;
    private String name;
    private int age;

    public Person(long ID, String name, int age) {
        this.ID = ID;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "ID=" + ID + ", name=" + name + ", age=" + age + '}';
    }

   
    
}
