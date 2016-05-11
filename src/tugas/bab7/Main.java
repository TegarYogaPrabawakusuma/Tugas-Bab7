/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

import java.util.Scanner;

/**
 *
 * @author TEGAR
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
        String Jasa, Barang;
        System.out.println("Silahkan Memasukkan Jenis Keanggotaan: ");
        System.out.println("1. Premium");
        System.out.println("2. Golden");
        System.out.println("3. Silver");
        System.out.println("4. saya bukan anggota");
        System.out.print("Pilih: ");
        int pilih = in.nextInt();
        switch(pilih){
            case 1 : System.out.print("Masukkan Jenis Jasa   : ");
                     Jasa = in.next();
                     System.out.print("Masukkan Jenis Barang : ");
                     Barang = in.next();
                     Premium a = new Premium();
                     a.jasa(Jasa);
                     System.out.println("/////=====/////");
                     a.barang(Barang);
                     break;
            case 2 : System.out.print("Masukkan Layanan: ");
                     System.out.print("Masukkan Jenis Jasa   : ");
                     Jasa = in.next();
                     System.out.print("Masukkan Jenis Barang : ");
                     Barang = in.next();
                     Gold b = new Gold();
                     b.jasa(Jasa);
                     System.out.println("/////=====/////");
                     b.barang(Barang);
                     break;
            case 3 :System.out.print("Masukkan Layanan: ");
                     System.out.print("Masukkan Jenis Jasa   : ");
                     Jasa = in.next();
                     System.out.print("Masukkan Jenis Barang : ");
                     Barang = in.next();
                     Silver c = new Silver();
                     c.jasa(Jasa);
                     System.out.println("/////=====/////");
                     c.barang(Barang);
                     break;
            case 4 : System.out.print("Masukkan Layanan: ");
                     System.out.print("Masukkan Jenis Jasa   : ");
                     Jasa = in.next();
                     System.out.print("Masukkan Jenis Barang : ");
                     Barang = in.next();
                     NoDiskon d = new NoDiskon();
                     d.jasa(Jasa);
                     System.out.println("/////=====/////");
                     d.barang(Barang);
                     break;
            default : System.out.println("Pilihan Aanda Tidak Ada/Tidak Bisa Ditemukan");
        }
    }
 }
