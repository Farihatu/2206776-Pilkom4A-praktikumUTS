/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal.pkg4;

/**
 *
 * @author FARIHATU
 */
public class balok {
    int panjang;
    int lebar;
    int tinggi;
    
    balok() {
        panjang = 0;
        lebar = 0;
        tinggi = 0;
    }

    balok(int panjangBaru, int lebarBaru, int tinggiBaru) {
        panjang = panjangBaru;
        lebar = lebarBaru;
        tinggi = tinggiBaru; 
    }

    int getLuas() {
        return 2 * ((panjang*lebar)+(panjang*tinggi)+(lebar*tinggi));
    }
    
    int getKeliling() {
        return 4 * (panjang + lebar + tinggi);
    }

    int getVolume() {
        return panjang * lebar * tinggi;
    }
    
    void setPanjang(int panjangBaru) {
        panjang = panjangBaru;
    }

    void setLebar(int lebarBaru) {
        lebar = lebarBaru;
    }

    void setTinggi(int tinggiBaru){
        tinggi = tinggiBaru;
    }
    
    int getPanjang() {
        return panjang;
    }

    int getLebar() {
        return lebar;
    }
    
    int getTinggi() {
        return tinggi;
    }
}