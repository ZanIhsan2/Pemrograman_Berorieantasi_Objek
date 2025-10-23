/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum05;

/**
 *
 * @author LENOVO
 */
public class Cat extends Animal {
    private String color;
    
    public Cat(String name, int age, String color){
     super(name, age);
     this.color = color;
    }

    public void makeSound() {
        System.out.println(getName() + "Says: Miauuuu!");
    }
    
    @Override
    public String toString() {
        return "Cat(" + super.toString() + ", color= " + ')';
    }
}
