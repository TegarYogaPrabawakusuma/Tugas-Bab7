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
public class Silver extends AbsSalon {
  
    @Override
    public void jasa(String Jasa) {
        if (Jasa.equalsIgnoreCase("Layanan Pedicure")){
            int total = pedicure - (pedicure * 10 / 100);
            System.out.println("jenis pelayanan         : "+Jasa);
            System.out.println("Harga asli              : Rp."+pedicure);
            System.out.println("Discount untuk anggota  :  10%");
            System.out.println("Total                   : Rp."+total);
        }
       else if(Jasa.equalsIgnoreCase("Layanan manicure")){
            int total = manicure - (manicure * 10 / 100);
            System.out.println("jenis pelayanan         : "+Jasa);
            System.out.println("Harga asli              : Rp."+manicure);
            System.out.println("Discount untuk anggota  :  10%");
            System.out.println("Total                   : Rp."+total);
        }
        else{
            System.out.println("Maaf, Layanan Yang Anda Pilih Tidak Tersedia");
        }
    }
    
}
