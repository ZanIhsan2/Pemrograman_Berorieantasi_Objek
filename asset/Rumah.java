/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asset;

/**
 *
 * @author LENOVO
 */
public class Rumah implements Asset {
//    Variabel
    public double luas, tipealatmusik;
//    Konstruktor
    public Rumah(){
    }
//    Method
    public double getLuas() {
        return luas;
    }

    public void setLuas(double luas) {
        this.luas = luas;
    }

    public double getTipealatmusik() {
        return tipealatmusik;
    }

    public void setTipealatmusik(double tipealatmusik) {
        this.tipealatmusik = tipealatmusik;
    }
    
    
    @Override
    public double nilaiAsset(){
        return 400_000_000;
    }

    @Override
    public String toString() {
        return "Rumah{" + "luas=" + luas + ", tipealatmusik=" + tipealatmusik + '}';
    }
    
}
