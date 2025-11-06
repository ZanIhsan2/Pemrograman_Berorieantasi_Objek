/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asset;

/**
 *
 * @author LENOVO
 */
public class KumpulanAsset {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rumah r1 = new Rumah();
        Motor m1 = new Motor();
        Motor m2 = new Motor();
        
//        Set data
        r1.setLuas(120);r1.setTipealatmusik(45);
        m1.setMerek("Honda");m1.setCc(250);m1.setTahun(1982);
        m1.setMerek("Yahaha");m1.setCc(150);m1.setTahun(2025);
        
//        Grouping
        Asset assetku [] = {r1, m1, m2};
        double total = 0;
        
//        Looping
        for(Asset assets : assetku){
            System.out.println(assets);
            total += assets.nilaiAsset();
        }
        
        System.out.printf("Total Asset: Rp. %.2f", total);
    }
    
}
