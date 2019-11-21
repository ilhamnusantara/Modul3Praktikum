/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author ilham-07010
 */
public class Bioskop {
    String[] waktu = new String[3];
    String film;
    Penonton penonton;
    int harga = 30000;
    
    public Bioskop(String film,Penonton penonton) {
        waktu[0]="09.00-11.00";
        waktu[1]="12.00-14.00";
        waktu[2]="15.00-17.00";
        this.film = film;
        this.penonton = penonton;
        if(penonton.getUsia() < 10){
            double diskon = harga * 10 /100;
            harga = harga - (int)diskon;
        }else if(penonton.getUsia() > 9 && penonton.getUsia()<19){
            double diskon = harga * 5 / 100;
            harga = harga - (int)diskon;
        }else{
            double diskon = harga * 2 / 100;
            harga = harga - (int)diskon;
        }
    }
    String getTiket(int sesi){
        return "Nama : "+penonton.getNama()+" \n"+"Sesi "+waktu[sesi-1]+" \n"+"Jumlah tiket : "+penonton.getTiket();
    }
    
    String[] getSesi(){
        return waktu;
    }
    
    void ucapan(){
        penonton.ucapan("jhgjhgjh");
    }

    public int getHarga() {
        return harga;
    }
    
    
}
