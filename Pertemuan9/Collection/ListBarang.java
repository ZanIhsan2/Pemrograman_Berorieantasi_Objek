/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan9.Collection;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class ListBarang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Membuat List Kosong
        List<String> barang = new ArrayList<>();
        
        // 2. Menambahkan Data
        barang.add("Sapu");
        barang.add("Garpu");
        barang.add("Pel");
        barang.add("Gayung");
        
        System.out.println("=== DATA BARANG ===");
        for (int i = 0; i < barang.size(); i++) {
            System.out.println(i + " - " + barang.get(i));
        }
        
        // 3. Mengupdate data
        barang.set(2, "KacaMata");
        
        // 4. Menghapus data
        barang.remove("Gayung");
        
        // 5. Menambah data
        barang.add("Sumpit");
        
        System.out.println("=== DATA SETELAH UPDATE ===");
        for (String item : barang){
            System.out.println(" - " + item);
        }
    }
    
}
