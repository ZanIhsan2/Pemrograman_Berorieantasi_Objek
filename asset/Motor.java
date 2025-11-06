/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asset;

/**
 *
 * @author LENOVO
 */
public class Motor implements Asset {
//    Variabel
    public String merek;
    public int cc, tahun;
    
    public Motor(){
    }
    
//    Konstruktor
    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getTahun() {
        return tahun;
    }
    public void setTahun(int tahun) {    
        this.tahun = tahun;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    
    @Override
    public double nilaiAsset(){
        return 30_000_000;
    }

    @Override
    public String toString() {
        return "Motor{" + "merek=" + merek + ", cc=" + cc + ", tahun=" + tahun + '}';
    }
}
