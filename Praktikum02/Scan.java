/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum02;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Scan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nama : ");
        String nama = sc.nextLine(); //nextLine untuk masukan data input bertipe String
        
        System.out.println("Usia : ");
        int umur = sc.nextInt(); //nextInt untuk masukan data input bertipe Nomor/Angka
        
        System.out.println("Nama Santri: " + nama + ",umur : " + umur + "tahun");
        
    }
    
}
