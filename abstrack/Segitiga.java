/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstrack;

/**
 *
 * @author LENOVO
 */
public class Segitiga extends Bentuk2D {
//    Member1 Variabel
    private double alas,tinggi,sisiMiring;
//   Member2 Konstruktor
    public Segitiga(){

    }
//   Member3 Method
    public double getAlas(){
        return alas;
    }
    public void setAlas(double alas){
        this.alas = alas;
    }
    public double getTinggi(){
        return tinggi;
    }
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    public double getSisiMiring(){
        return sisiMiring;
    }
    public void setSisiMiring(double sisiMiring){
        this.sisiMiring = sisiMiring;
    }

    @Override
    public double luasBidang(){
        return 0.5f * this.alas * this.tinggi;
    }
    
    @Override
    public double kelilingBidang(){
        this.sisiMiring = Math.sqrt(Math.pow(alas, 2) + 
                Math.pow(tinggi, 2));
        return this.alas + this.tinggi + this.sisiMiring;
    }
    
    @Override
    public String toString(){
        return namaBentuk() + "alas = " + alas + 
                ", tinggi = " + tinggi + ", sisi miring = " + sisiMiring;
    }
}
