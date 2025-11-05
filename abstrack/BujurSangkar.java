/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstrack;

/**
 *
 * @author LENOVO
 */
public class BujurSangkar extends Bentuk2D {
//    Variabel
    private double sisi;
//    Konstruktor
    public BujurSangkar(double sisi) {
        this.sisi = sisi;
    }
//    Method

    public double getsisi() {
        return sisi;
    }

    public void setsisi(double sisi) {
        this.sisi = sisi;
    }
    
    @Override
    public double luasBidang(){
        return Math.pow(sisi, 2);
    }
    
    @Override
    public double kelilingBidang(){
        return 4 * sisi;
    }

    @Override
    public String toString() {
        return namaBentuk() + " sisi = " + sisi;
    }
    
}
