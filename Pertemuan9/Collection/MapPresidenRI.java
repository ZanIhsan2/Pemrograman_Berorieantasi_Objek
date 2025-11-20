/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan9.Collection;
import java.util.TreeMap;
import java.util.Map;

/**
 *
 * @author LENOVO
 */
public class MapPresidenRI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String, String> presiden = new TreeMap<>();
        
        // 1. Input Data Presiden
        presiden.put("1-SKR", "Soekarno");
        presiden.put("2-SHT", "Soeharto");
        presiden.put("3-HBB", "Bj. Habibie");
        presiden.put("4-GSDR", "Abdurrahman Wahid");
        presiden.put("5-MGWT", "Megawati Soekarnoputri");
        presiden.put("6-SBY", "Susilo Bambang Yudhoyono");
        presiden.put("7-JKW", "Joko Widodo");
        presiden.put("8-PBWO", "Prabowo Subianto");
        
        // 2. Mengambil Data Tertentu
        System.out.println("Presiden RI ke-3 :" + presiden.get("3-HBB"));
        
        // 3. Menampilkan seluruh data
        System.out.println("\nKode Presiden RI : " + presiden.keySet());
        
        // 4. Menampilkan Seluruh Data Presiden
        System.out.println("\nnama-nama Presiden RI :");
        for (String nama : presiden.keySet()){
            String n = presiden.get(nama);
            System.out.println(n);
        }
    }
    
}
