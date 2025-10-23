/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author LENOVO
 */
public class Mahasiswa extends Person {
    //member1 var
    private String nim;
    private String prodi;
    private int semester;
    private float ipk;
    //member2 constructor

    public Mahasiswa() {
        super();
    }
    //member3 method

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public float getIpk() {
        return ipk;
    }

    public void setIpk(float ipk) {
        this.ipk = ipk;
    }
    
    //nyetak data mahasiswa dan induk (person)

    @Override
    public String toString() {
        return "Mahasiswa: " + super.toString() + "nim: " + nim + ", prodi: " + prodi + ", semester: " + semester + ", ipk: " + ipk;
    }
    
}
