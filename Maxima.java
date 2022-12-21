/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SamostatneALG;

import java.util.Scanner;

public class Maxima {
    public static void main (String[] args) {
        // VYTVARENI PROMENNYCH
        Scanner sc = new Scanner(System.in);
        int pocetUloh, max1temp, cislo, max2temp, max3temp, max4temp;
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
    }
}