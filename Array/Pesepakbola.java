/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Array;

/**
 *
 * @author LENOVO
 */
public class Pesepakbola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[][] pemain_timnas = {
            {"Emil Audero", "Cremonese(ITA)"},
            {"Jay Idzes", "Sassuolo(ITA)"},
            {"Calvin Verdonk", "LOSC Lille(FRA)"},
            {"Dean James", "Go Ahead Eagles(NED)"},
            {"Kevin Diks", "Monchengladbach(GER)"},
            {"Rizky Ridho", "Persija Jakarta(IDN)"},
            {"Ole Romeny", "Oxford United(ENG)"},
        };
        System.out.println("Daftar Pemain Timnas:");
        for (int i = 0; i < pemain_timnas.length; i++) 
            System.out.println(pemain_timnas[i][0] + "\t: "
                    + pemain_timnas[i][1]);
    }
    
}
