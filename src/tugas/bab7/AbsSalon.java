/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author TEGAR
 */
public abstract class AbsSalon {
   public String Jasa;
    public String Barang;
    public abstract void jasa(String Jasa);
    public abstract void barang(String Barang); 
   public final int pedicure = 50000;
    public final int manicure = 100000;
    public final int KrimPutih = 25000;
    public final int KrimJerawat = 50000; 
   
    
}
