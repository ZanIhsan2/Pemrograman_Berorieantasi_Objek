/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author LENOVO
 */
public class Person {
    //Memberi1 Var
    private String nama;
    private char gender;
    //member2 konstruktor    

    public Person() {
    }
    //member3 method
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "STT-NF " + ", nama= " + nama + ", jenis kelamin= " + gender;
    }
    
}
