/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author LENOVO
 */
public class Dosen extends Person {
    //member1 var
    private String nidn;
    private String gelar;

    public Dosen() {
        super();
    }

    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public String getGelar() {
        return gelar;
    }

    public void setGelar(String gelar) {
        this.gelar = gelar;
    }

    @Override
    public String toString() {
        return "Dosen: " + super.toString() + ", nidn: " + nidn + ", gelar: " + gelar;
    }
    
}
