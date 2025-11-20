/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan9.Collection;

/**
 *
 * @author LENOVO
 */
public class MataKuliah {
//    Variabel
    private String kode,nama;
    private int sks;
    
//    Konstruktor blank
    public MataKuliah() {
    }

//    Method
    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    @Override
    public String toString() {
        return "MataKuliah{" + "kode=" + kode + ", nama=" + nama + ", sks=" + sks + '}';
    }
    
}
