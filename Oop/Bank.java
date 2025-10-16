/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oop;

/**
 *
 * @author LENOVO
 */
public class Bank {
//    Member1 Variabel
    public String nama;
    protected int norek;
    private double saldo;
    
//    Member2 Constructor
    public Bank(String nama, int norek, double saldo) {
        this.nama = nama;
        this.norek = norek;
        this.saldo = saldo;
    }
//    Member3 method
    public void menabung(double uang){
        //this.saldo = this.saldo + uang;
        this.saldo += uang;
    }
    public void menarik(double uang){
        //this.saldo = this.saldo - uang;
        this.saldo -= uang;
    }
    public void mencetak(){
        System.out.println("No. Rekening : " + this.norek);
        System.out.println("Nama Nasabah : " + this.nama);
        System.out.printf("Saldo : Rp. %,.2f", this.saldo);
        System.out.println("\n---------------------------");
    }
}
