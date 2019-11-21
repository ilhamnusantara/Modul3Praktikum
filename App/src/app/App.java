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
        Penonton[] penonton = new Penonton[16];
        Bioskop bioskop = null;
        int index = 0;
        int def = 0;
        int sesi = 0;
        do{
        System.out.println("====SELAMAT DATANG====");
        System.out.println("===TIKET BIOSKOP ITATS===");
        System.out.println("1. Beli Tiket");
        System.out.println("2. Harga yang harus dibayar");
        System.out.println("3. Cetak tiket");
        System.out.print("pilih menu : ");
        int pilih = inp.nextInt();
        switch(pilih){
            case 1 :
                System.out.println("Isi Biodata");
                    System.out.print("Nama : ");
                    String name = inp.next();
                    System.out.print("Usia : ");
                    int usia = inp.nextInt();
                    System.out.print("Alamat : ");
                    String address = inp.next();
                    System.out.print("Judul film yang dibeli : ");
                    String judul = inp.next();
                    System.out.print("Tiket yang dibeli : ");
                    int tiket = inp.nextInt();
                    penonton[index]= new Penonton(name, usia, name, tiket);
                    bioskop = new Bioskop(name, penonton[index]);
                    System.out.println("Waktu sesi");
                    for(int i=0; i < bioskop.getSesi().length; i++){
                    System.out.println(i+1+". "+bioskop.getSesi()[i]);
                    }
                    System.out.print("Pilihlah Sesi : ");
                    sesi = inp.nextInt();
                    
                    
                    index++;
                break;
            case 2 :
                System.out.println("NOMINAL YANG HARUS DIBAYAR : "+bioskop.getHarga());
                break;
            case 3 :
                System.out.println(bioskop.getTiket(sesi));
                bioskop.ucapan();
                break;
            default:
                def = 1;
        }
        }while(def != 1);
    }    
}
