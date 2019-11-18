/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Scanner;
/**
 *
 * @author ilham-07010
 */
public class App {

    static Scanner inp = new Scanner(System.in);
    public static void main(String[] args) {
        Penonton[] penonton = new Penonton[15];
        String nama = null,alamat = null;
        int jumlah=0;
        int nomorTiket = 60;
        int def = 0;
        float hargaTiket = 40000;
        float[] harga = new float[jumlah];
        int totalHarga = 0;
        int umur1 = 10;
        int umur2 = 18;
        do{
        System.out.println("====SELAMAT DATANG====");
        System.out.println("===TIKET BIOSKOP CGV===");
        System.out.println("1. Masukan data pembeli");
        System.out.println("2. Cetak tiket");
        System.out.print("pilih menu : ");
        int pilih = inp.nextInt();
        switch(pilih){
            case 1 :
                System.out.print("Masukkan jumlah pembelian = ");
                jumlah = inp.nextInt();
                for(int i =0; i<jumlah; i++){
                    System.out.print("Nama : ");
                    String name = inp.next();
                    System.out.print("Usia : ");
                    int usia = inp.nextInt();
                    System.out.print("Alamat : ");
                    String address = inp.next();
                    penonton[i] = new Penonton(nama, usia, alamat);
                }
                for(int j=0; j<jumlah; j++){
                    if(penonton[j].usia<umur1){
                        harga[j] = (float) (hargaTiket*0.9);
                    }else if(penonton[j].usia>umur2){
                        harga[j] = (float) (hargaTiket*0.98);
                    }else if(penonton[j].usia>umur1 && penonton[j].usia<umur2){
                        harga[j] = (float) (hargaTiket*0.95);
                    }
                    totalHarga+= totalHarga;
                }
                break;
            case 2 :
                if(jumlah > 10){
                    System.out.println("Selamat anda mendapatkan bonus tiket karena pembelian lebih dari 10");
                   for(int i=1; i <= 11; i++){
                       System.out.println("Nomor tiket : "+nomorTiket+i);
                   }
                    System.out.println("Yang harus dibayar : "+totalHarga);
                }
                break;
            default:
                def = 1;
        }
        }while(def != 1);
    }    
}
