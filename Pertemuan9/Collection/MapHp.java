package Pertemuan9.Collection;
import java.util.HashMap;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author LENOVO
 */
public class MapHp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String, String> telp = new HashMap<String, String>();
        
        telp.put("Budi", "7871234");
        telp.put("Ani", "7874321");
        telp.put("Dewi", "7877777");
        System.out.println("No Telp Budi " + telp.get("Budi"));
        for (String nama : telp.keySet()) {
            String no = telp.get(nama);
            System.out.println("Siswa " + nama + " teleponnya " + no);
        }
    }

}
