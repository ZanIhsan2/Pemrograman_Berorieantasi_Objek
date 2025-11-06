/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tipealatmusik;

/**
 *
 * @author LENOVO
 */
public class Pianika implements MusikTiup, MusikTekan {

    @Override
    public void tiup() {
        System.out.println("pianika di tiup bersuara pfffff.. pfffff....");
    }

    @Override
    public void tekan() {
        System.out.println("pianika di tekan bersuara net... not.... net.... ");
    }
    
}
