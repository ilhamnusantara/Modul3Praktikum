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
public class Penonton extends Manusia{

    int tiket;
    String teks = "Terimakasih telah membeli tiket";
    public Penonton(String nama, int usia, String alamat, int tiket) {
        super(nama, usia, alamat);
        this.tiket = tiket;
    }
    @Override
    void setTiket() {
        
    }

    @Override
    int getTiket() {
       return tiket;
    }
    
    @Override
    void ucapan(){
        
    };
    
    void ucapan(String teks){
        this.teks = teks;
        System.out.println(teks);
    }
    
}
