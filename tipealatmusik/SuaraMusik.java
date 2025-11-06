/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tipealatmusik;

/**
 *
 * @author LENOVO
 */
public class SuaraMusik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gitar gr = new Gitar();
        Piano pn = new Piano();
        Seruling sl = new Seruling();
        Pianika pk = new Pianika();
        
        gr.petik();
        pn.tekan();
        sl.tiup();
        pk.tekan();
        pk.tiup();
    }
    
}
