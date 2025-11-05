/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstrack;

/**
 *
 * @author LENOVO
 */
public class KumpulanBentuk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ciptakan Objek
        Bentuk2D b1 = new Lingkaran(8);
        Bentuk2D b2 = new PersegiPanjang(5, 10);
        Bentuk2D b3 = new Segitiga(6, 8);
        Bentuk2D b4 = new BujurSangkar(5);
        // Simpan dalam Array
        Bentuk2D ar_bentuk[] = {b1, b2, b3, b4};
        // Looping data
            for(Bentuk2D b2d : ar_bentuk){
                System.out.println(b2d + " luasnya " + b2d.luasBidang() + ", dan kelilingnya " + b2d.kelilingBidang());
            }
    }
    
}
