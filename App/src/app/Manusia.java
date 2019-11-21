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
public abstract class Manusia {
    String nama;
    int usia;
    String alamat;
    
    abstract void setTiket();
    abstract int getTiket();
    abstract void ucapan();
    
    public Manusia(String nama,int usia,String alamat){
        this.nama = nama;
        this.usia = usia;
        this.alamat = alamat;
    }

    void setNama(String nama) {
        this.nama = nama;
    }

    String getNama() {
        return nama;
    }

    void setUsia(int usia) {
        this.usia = usia;
    }

    int getUsia() {
        return usia;
    }
    
    

    void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    String getAlamat() {
        return alamat;
    }
    
}
