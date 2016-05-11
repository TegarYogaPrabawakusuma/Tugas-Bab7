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
public class NoDiskon extends AbsSalon{
   
    @Override
    public void jasa(String Jasa) {
        if (Jasa.equalsIgnoreCase("Layanan perawatan pedicure")){
            System.out.println("Jenis Pelayanan                : "+Jasa);
            System.out.println("Harga yang harus dibayar       : Rp."+pedicure);
        }
        else if(Jasa.equalsIgnoreCase("Layanan perawatan manicure")){
            System.out.println("Jenis Pelayanan               : "+Jasa);
            System.out.println("Harga yang harus dibayar      : Rp."+manicure);
        }
        else{
            System.out.println("Pelayanan yang anda minta Tidak Tersedia");
        }
    }
   
    @Override
    public void barang(String Barang){
        if (Barang.equalsIgnoreCase("Pembelian Produk Bedak Gatal")){
            System.out.println("Jenis Pelayanan              : "+Barang);
            System.out.println("Harga yang harus dibayar     : Rp."+KrimPutih);
        }
        else if(Barang.equalsIgnoreCase("Pembelian Produk Krim Jerawat")){
            System.out.println("Jenis Pelayanan               : "+Barang);
            System.out.println("Harga yang harus dibayar      : Rp."+KrimJerawat);
        }
        else{
            System.out.println("Produk Tidak Terdaftar,silahkan coba lagi");
        }
    }   

   
}