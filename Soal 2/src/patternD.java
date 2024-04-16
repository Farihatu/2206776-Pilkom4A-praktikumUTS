/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author FARIHATU
 */
public class patternD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i, j, spasiKiri, baris = 6;
        for (i = baris; i >= 1; i--) {
            spasiKiri = (baris - i);
            for (j = 1; j <= spasiKiri; j++) {
                System.out.print(" ");
            }

            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}