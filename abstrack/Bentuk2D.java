/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstrack;

/**
 *
 * @author LENOVO
 */
public abstract class Bentuk2D {
    public String namaBentuk(){
        return getClass().getSimpleName();
    }
    public abstract double luasBidang();
    public abstract double kelilingBidang();
}
