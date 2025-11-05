/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstrack;

/**
 *
 * @author LENOVO
 */
public class PersegiPanjang extends Bentuk2D {
//  Variabel
    private double panjang,lebar;
//  Konstruktor
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
//  Method
    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    @Override
    public double luasBidang() {
        return this.panjang * this.lebar;
    }
    
    @Override
    public double kelilingBidang(){
        return 2 * (this.panjang + this.lebar);
    }

    @Override
    public String toString() {
        return namaBentuk() + " panjang = " + panjang + ", lebar = " + lebar;
    }
    
    
}
