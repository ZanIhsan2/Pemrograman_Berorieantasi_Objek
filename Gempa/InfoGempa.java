/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Gempa;

/**
 *
 * @author LENOVO
 */
public class InfoGempa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gempa g1 = new Gempa("Israel", 10.5f);
        Gempa g2 = new Gempa("Pluto", 4.2f);
        Gempa g3 = new Gempa("Bekasi", 20.54f);
        
        System.out.println("----Cetak Cara 1----");
        g1.dampak();
        g2.dampak();
        g3.dampak();
    }
}
