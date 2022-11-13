
package VanocniUloha;

import java.util.Scanner;

public class Malovani {
    public static void main(String[] args) {
    
        Scanner sc  = new Scanner (System.in);
            int h = 0;
            int figSize;
            int spaceAmount;
            int starsAmount;
            int j;
            int i;
            int m = 3;
            String space = " ";
            String star = "*";
        System.out.println("Namaluju pro vas Vanocni stromeckovou dekorace");
        System.out.println("");
            //Ptame se uzuvatele, jak velkou chce dekorace
        System.out.print("Jak velkou chcete(jenom licha cisla)?: "); 
            figSize = sc.nextInt();
            while(figSize == 1 || figSize % 2 == 0 || figSize <= 0){
                System.out.println("Neni mozne vytvorit takovou dekorace,");
                System.out.print("uvedte jine cislo: ");
                figSize = sc.nextInt();
            }
            int lace = (int) (figSize/2);
            int k = lace - 1;
            
            //ciklus pro lano nase dekorace
        for (i = 0; i < (int) (lace * 0.5); i++){
            for (j = 0; j < lace; j++){
               System.out.print(space);
            }
               System.out.print(star);
      
               System.out.println(space);
            }
          
             
             // Ciklus pro prvni cast dekorace
        while(h < figSize - 1){
            for(spaceAmount = 0; spaceAmount < k; spaceAmount++ ){
                System.out.print(space);
            }
                
            for(starsAmount = 0; starsAmount < m; starsAmount++ ){
                System.out.print(star);
            }
            System.out.println(space);
            k = k - 1;
            m = m + 2;
            h = h + 2;
        }
        
        
        k = k + 2;
        m = m - 4;
        // Ciklus pro druhou cast dekorace
        while(h <= figSize - 1){
            for(spaceAmount = 0; spaceAmount < k; spaceAmount++ ){
                System.out.print(space);
            }
                
            for(starsAmount = 0; starsAmount < m; starsAmount++ ){
                System.out.print(star);
            }
            System.out.println(space);
            if (m == 1){
                 break;
            }else{
            k = k + 1;
            m = m - 2;
            h = h - 2;
            }
        }
    }
    }
   

