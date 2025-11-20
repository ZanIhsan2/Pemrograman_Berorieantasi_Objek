/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum01;

/**
 *
 * @author LENOVO
 */
public class operasi1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float rad1 = 14.0f;
        float luas1 = 22f/7 * rad1 * rad1;
        float luas2 = rad1 * rad1 * 22/7;
        boolean kecilDari = luas1 >= luas2;
        
        System.out.println("Luas Lingkaran 1 Adalah " + luas1);
        System.out.println("Luas Lingkaran 2 Adalah " + luas2);
        System.out.print(kecilDari);
    }
    
}
