/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author FARIHATU
 */
public class patternC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i, k, j, baris = 6;
        for (i = 1; i <= baris; i++) {
            for (k = 1; k <= baris - i; k++) {
                System.out.print(" ");
            }

            for (j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}