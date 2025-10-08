/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum01;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class BacaMasukan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Nama Anda ? ");
        String nama = sc.nextLine();
        System.out.println("Pa Kabar " + nama + " ?");
    }
    
}
