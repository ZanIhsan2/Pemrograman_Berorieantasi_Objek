/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum05;

/**
 *
 * @author LENOVO
 */
public class Cow extends Animal {
    private String jenis;
    
    public Cow(String name, int age, String jenis) {
        super(name, age);
        this.jenis = jenis;
    }
    
    public void makeSound() {
        System.out.println(getName() + "says: Emooooo! ");
    }
    
    @Override
    public String toString() {
        return "Cow(" + super.toString() + ", jenis= " + jenis + ')';
    }
}
