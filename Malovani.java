
package VanocniUloha;

import java.util.Scanner;

public class Malovani {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int h = 1;
        int i, j, s;
        int m  = 3;
        
        String space = " ";
        String star = "*";
        int spaceAmount, starsAmount;
        System.out.println("Udelam pro vas Vanocni dekorace");
        System.out.print("Jak velkou chcete(jenom licha cisla): ");
        int figSize = sc.nextInt();
        while (figSize <= 1 || figSize % 2 == 0){
            System.out.println("Neda se vitvorit takovou dekorace,");
            System.out.print("uvedte jine cislo: ");
            figSize = sc.nextInt();
        }
        int lase = figSize / 2;
        int k = lase - 2;
        
        
        //cyklus pro lano dekorace
        for(i = 0; i < (int)(figSize * 0.3); i++){
            for (j = 0; j < lase; j++){
            System.out.print(space);
            }
            System.out.println(star);  
        }
        
        //cyklus pro prvni cast dekorace
        while (h < figSize){
           for (spaceAmount = 0; spaceAmount <= k; spaceAmount++){
               System.out.print(space);
           } 
           for(starsAmount = 0; starsAmount < m; starsAmount++){
               System.out.print(star);
           }
            System.out.println(space);
            h = h + 2;
            m = m + 2;
            k = k - 1;
            
                    
        }
        m = m - 4;
        k = k + 2;
        while (h != 1){
           for (spaceAmount = 0; spaceAmount <= k; spaceAmount++){
               System.out.print(space);
           } 
           for(starsAmount = 0; starsAmount < m; starsAmount++){
               System.out.print(star);
           }
            System.out.println(space);
            h = h - 2;
            m = m - 2;
            k = k + 1;
            
                    
        }
    }
}

