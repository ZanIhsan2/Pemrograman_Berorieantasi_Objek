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
    private double Alas,Tinggi,sisiMiring;
//   Member2 Konstruktor
    public Segitiga(double Alas, double Tinggi){
        this.Alas = Alas;
        this.Tinggi = Tinggi;
    }
//   Member3 Method
    public double getAlas(){
        return Alas;
    }
    public void setAlas(double alas){
        this.Alas = alas;
    }
    public double getTinggi(){
        return Tinggi;
    }
    public void setTinggi(double tinggi){
        this.Tinggi = tinggi;
    }
    public double getSisiMiring(){
        return sisiMiring;
    }
    public void setSisiMiring(double sisiMiring){
        this.sisiMiring = sisiMiring;
    }

    @Override
    public double luasBidang(){
        return 0.5f * this.Alas * this.Tinggi;
    }
    
    @Override
    public double kelilingBidang(){
        this.sisiMiring = Math.sqrt(Math.pow(Alas, 2) + 
                Math.pow(Tinggi, 2));
        return this.Alas + this.Tinggi + this.sisiMiring;
    }
    
    @Override
    public String toString(){
        return namaBentuk() + "alas = " + Alas + 
                ", tinggi = " + Tinggi + ", sisi miring = " + sisiMiring;
    }
}
