/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal.pkg4;

/**
 *
 * @author FARIHATU
 */
public class Soal4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        balok Balok1 = new balok(1, 1, 1);
        System.out.println("Balok dengan panjang = " + Balok1.getPanjang() 
                + ", lebar = " + Balok1.getLebar()
                +", tinggi = " + Balok1.getTinggi() + ".");
        System.out.println("Luasnya: " + Balok1.getLuas() 
                + ", sedangkan kelilingnya: " + Balok1.getKeliling()
                + ", dan volumenya: " + Balok1.getVolume() + ".");
        System.out.println("======================================================");

        balok Balok2 = new balok(30, 40, 50);
        System.out.println("Balok dengan panjang = " + Balok2.getPanjang() 
                + ", lebar = " + Balok2.getLebar() 
                +", tinggi = " + Balok2.getTinggi() + ".");
        System.out.println("Luasnya: " + Balok2.getLuas() 
                + ", sedangkan kelilingnya: " + Balok2.getKeliling()
                + ", dan volumenya: " + Balok2.getVolume() + ".");
        System.out.println("======================================================");

        balok Balok3 = new balok(25, 35, 45);
        System.out.println("Balok dengan panjang = " + Balok3.getPanjang() 
                + ", lebar = " + Balok3.getLebar() 
                +", tinggi= " + Balok3.getTinggi() + ".");
        System.out.println("Luasnya: " + Balok3.getLuas() 
                + ", sedangkan kelilingnya: " + Balok3.getKeliling()
                + ", dan volumenya: " + Balok3.getVolume() + ".");
    }
    
}