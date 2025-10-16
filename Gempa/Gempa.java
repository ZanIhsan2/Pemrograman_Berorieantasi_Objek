/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gempa;

/**
 *
 * @author LENOVO
 */
public class Gempa {
    private String tempat;
    private float skala;

//    Constructor
    public Gempa(String tempat, float skala) {
        this.tempat = tempat;
        this.skala = skala;
    }
    
    public String dampak(){
        String efek;
        if(this.skala < 3f){
            efek = "Tidak Terasa";
        }else if (this.skala >= 3f && this.skala <= 5f){
            efek = "Bangunan Retak-retak";
        }else if (this.skala > 5f && this.skala <= 8f) {
            efek = "Bangunan Roboh";
        } else {
            efek = "Tsunami";
        }
        System.err.println("Telah terjadi gemoa di " + this.tempat + "dengan Skala " + this.skala + " richter berdampak " + efek);
        return efek;
    }
}
