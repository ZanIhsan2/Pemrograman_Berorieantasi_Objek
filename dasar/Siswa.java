/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dasar;

/**
 *
 * @author LENOVO
 */
public class Siswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String siswa1 = "Armand Maulani" ;
        char nilai1 = 'B' ;
        float nilai2 = (float)58.29;
        
        //lulus atau gagal
        String ket;
        if(nilai2 >= 60) ket = "Lulus";
        else ket = "Gagal belajar lagi dek";
        
        //if multi kondisi
        char grade;
        if(nilai2 >= 85 && nilai2 <=100)
            grade = 'A';
        else if(nilai2 > 70 && nilai2 < 85)
            grade = 'B';
        else if(nilai2 > 60 && nilai2 < 75)
            grade = 'C';
        else if(nilai2 > 30 && nilai2 < 60)
            grade = 'D';
        else grade = 'A';
            
        //switch cass
        String predikat;
        switch (grade) {
            case 'A': predikat = "Cumclaude";break;
            case 'B': predikat = "Baik";break;
            case 'C': predikat = "Cukup";break;
            case 'D': predikat = "Kurang";break;
            default: predikat = "Buruk";
                throw new AssertionError();
        }
        
        System.out.println("Nilai " + siswa1 + " Adalah " + nilai1);
        System.out.println("Nama: " + siswa1 + "\nNilai:" + nilai2 + "\nKeterangan: " + ket + "\nPredikat: " + predikat);
        System.out.println("");
    }
    
}
