/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Method;

/**
 *
 * @author LENOVO
 */
public class PencetakArray {
    
    public static void cetak(int[] ar1) {
        System.out.println("Cetak array interger "
                + ar1.length + " elemen");
//cetak
        for (int bil : ar1) {
            System.out.println(bil + " ");
        }
    }

    public static void cetak(String[] args) {
        System.out.println("Cetak array String "
                + args.length + " elemen");
//cetak
        for (String a : args) {
            System.out.println(a + " ");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //definisikan data array
        int[] array1 = {7, 3, 5, 2, 1, 6, 8};
//panggil fungsi yg sudah dibuat
        cetak(array1);
//overloading method
        String[] array2
                = {"fawwaz", "inaya", "hisyam", "kamila", "salman"};
        cetak(array2);
    }
}
