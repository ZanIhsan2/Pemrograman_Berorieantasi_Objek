/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Oop;

/**
 *
 * @author LENOVO
 */
public class Transaksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Bikin objek
        Bank n1 = new Bank("Budi", 111, 1000000);
        Bank n2 = new Bank("Alfayadh", 222, 500000);
        Bank n3 = new Bank("Nabobiber", 333, 6000000);
        // Panggil Member class
        n1.menabung(250000);
        n2.menarik(50000);
        n2.menabung(350000);
        n3.menarik(10000);
        System.out.println("----mencetak cara 1----");
        n1.mencetak();n2.mencetak();n3.mencetak();
        System.out.println("----mencetak cara 2----");
        Bank ar_nasabah[] = {n1,n2,n3};
        for (Bank nasab : ar_nasabah){
            nasab.mencetak();
        }
    }
    
}
