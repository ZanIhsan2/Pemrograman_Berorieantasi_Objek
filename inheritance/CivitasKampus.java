/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritance;

/**
 *
 * @author LENOVO
 */
public class CivitasKampus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dosen d1 = new Dosen();
        Dosen d2 = new Dosen();
        Mahasiswa m1 = new Mahasiswa();
        Mahasiswa m2 = new Mahasiswa();
        
        d1.setNidn("111");d1.setNama("Nasrul");
        d1.setGender('L');d1.setGelar("M.Kom");
        
        d2.setNidn("112");d2.setNama("Tiffany");
        d2.setGender('p');d2.setGelar("M.Kom");
        
        m1.setNim("111");m1.setNama("Nabobiber");
        m1.setGender('L');m1.setProdi("TI");
        m1.setSemester(3);m1.setIpk(3.9f);
        
        m2.setNim("112");m2.setNama("Fayadh");
        m2.setGender('L');m2.setProdi("SI");
        m2.setSemester(5);m2.setIpk(3.8f);
        
        Person data[] = {d1, d2, m1, m2};
        for (Person d : data) {
            System.out.println(d);
        }
    }
    
}
