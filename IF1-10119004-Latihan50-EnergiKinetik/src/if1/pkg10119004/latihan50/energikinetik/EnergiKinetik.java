/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119004.latihan50.energikinetik;

/**
 *
 * @author ENDOG
 * Nama         : Muhamad Ramadan
 * Nim          : 10119004
 * Kelas        : IF1
 * Deskripsi    : Program ini menampilkan Energi Kinetik
 */
class EnergiKinetik {
     private double massa, kecepatan;
    
    public double getMassa() {
        return this.massa / 1000;
    }
    
    public void setMassa(double massa) {
        this.massa = massa;
    }
    
    public double getKecepatan() {
        return this.kecepatan;
    }
    
    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }
    
    public double hitungEnergiKinetik(double massa, double kecepatan) {
        return 0.5 * massa * Math.pow(kecepatan, 2);
    }
    
    public double hitungUsaha(double kecepatanAwal) {
        return 0.5 * massa * (Math.pow(kecepatan, 2) - Math.pow(kecepatanAwal, 2));
    }
    
}
