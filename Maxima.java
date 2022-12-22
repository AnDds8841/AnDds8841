/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ALGSamostatne;

import java.util.Scanner;

public class Maxima {
    public static void main (String[] args) {
        // VYTVARENI PROMENNYCH
        Scanner sc = new Scanner(System.in);
        int rep = 0;
        int pocetUloh = 0;
        int size;
        int max = 1;
        int opakov = 0;
        int nejvCislo = 2147483647;
        int[] ar;
        int[] maximy = new int [4];
        int[] opakovani = new int [4];
        int poziceMaximum;
        
        //KOMUNIKACE S UZIVETELEM
        pocetUloh = sc.nextInt();
        
        while(rep < pocetUloh){
            //NACITANI POSLOUPNOSTI
            //НЕ ЗУПИНЯЄТЬСЯ ЯКЩО НУЛЬ
            size = 2;
            ar = new int [size + 1];
            ar[0] = sc.nextInt();
            for (int i = 1; ar[i - 1] >= 0; i++) {
                if(i <= size){
                ar[i] = sc.nextInt(); 
                }else{
                    ar = addSize(ar, size);
                    size = size + 1;
                    i = i - 1;
                }
            }
            //ZPRACOVANI POSLOUPNOSTI
            poziceMaximum = 0;
            while(poziceMaximum < 4){
            for (int i = 0; i < ar.length; i++) {
                if(ar[i] >= max && ar[i] < nejvCislo){
                    max = ar[i];
                }   
            }
            maximy[poziceMaximum] = max;
            opakovani[poziceMaximum] = amountSearch(ar, max);
            nejvCislo = max;
            max = 1;
            poziceMaximum++;
        }
            for (int i = 0; i < 4; i++) {
            System.out.print(maximy[i] + " ");
            System.out.println(opakovani[i]);
            }
            rep++;
        }
        
    } 
        public static int[] addSize(int [] a, int size){
        int [] temp = new int [size + 2];
        for (int i = 0; i < a.length; i++) {
            temp[i] = a[i];  
        }
      return temp;
    }
        
        public static int amountSearch(int [] a, int max){
            int k = 0;
            for (int i = 0; i < a.length; i++) {
                if(a[i] == max){
                   k++; 
                }  
            }
            return k;
        }
                
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       /* int pocetUloh, max1temp, cislo, max2temp, max3temp, max4temp;
        int max1 = 1;
        int max2 = 1;
        int max3 = 1;
        int max4 = 1;
        int max1rep = 0;
        int max2rep = 0;
        int max3rep = 0;
        int max4rep = 0;
        int rep = 0;
        //KOMUNIKACE S UZIVATELEM
        pocetUloh = sc.nextInt();
        
        while(rep < pocetUloh){
        //NACITANI CISEL
        //неправильний підрахунок повторень
            for (cislo = 1; cislo > 0;) {
                max4temp = max4;
                cislo = sc.nextInt();
                if(cislo > max4){
                    max4 = cislo;
                    if(cislo != max4temp){
                        max4rep = 0;
                        max4rep++;
                    }else if(cislo == max4temp){
                        max4rep++;   
                }                     
            }
            if(cislo <= 0){
                rep++;    
                }
        
        //
        
        }
        System.out.println("SamostatneALG.Maxima.main()");
    }
    } 
    
    //METODA PRO ZVETSENI POLE
    public static int[] addSize(int [] a, int size){
        int [] temp = new int [size + 2];
        for (int i = 0; i < a.length; i++) {
            temp[i] = a[i];  
        }
      return temp;
*/

}