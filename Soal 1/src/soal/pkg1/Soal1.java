/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal.pkg1;
import java.util.Scanner;
/**
 *
 * @author FARIHATU
 */
public class Soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int angka;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan tiga digit integer: ");
        angka = input.nextInt();

        if (palindrom(angka)) {
            System.out.println(angka + " adalah palindrom");
        } else {
            System.out.println(angka + " bukan palindrom");
        }
    }

    public static boolean palindrom(int angka) {
        int digit1 = angka / 100;
        int digit2 = (angka / 10) % 10;
        int digit3 = angka % 10;
        return (digit1 == digit3);
    }
    
}