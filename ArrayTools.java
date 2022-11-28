
package ArrayEx;

import java.util.Scanner;


public class ArrayTools {

    static int i = 0;
    static Scanner sc = new Scanner(System.in);
    // main method
    public static void main(String[] args) {
        // Ptame se na pocet cisle a cislo
        System.out.println("Zadej pocet cisel:");
        int quNum = sc.nextInt();
        System.out.println("Zadej cisla:");
        int [] arNumbers = load(quNum);
        // vytvarime boolean pole  
        boolean truth = false;
        //indexsace promenne tempTruth
        if (arNumbers[i] < arNumbers[i + 1] ){
                t =  true;
            }else if(arNumbers[i] > arNumbers[i + 1]){
                t = false; 
        }
        boolean tempTruth = t;
        //hlavni cast
        for (int i =0; i < arNumbers.length - 1; i++) {
            truth = comp(arNumbers);
            if (truth == tempTruth){
                continue;
            }else if(truth =! tempTruth){
                System.out.println("Hodnoty v poli nejsou usporadani vzestupne ani sestupne");
                break;
            }
            
        }
        if(truth == tempTruth){
            if(t == true){
                System.out.println("Hodnoty v poli jsou usporadani vzestupne");
            }else if(t == false){    
                System.out.println("Hodnoty v poli jsou usporadani sestupne");
       }
    }
    }
    
    // nacitani cisel
    public static int[] load(int n){ 
        int[] a = new int[n];
        for (int k = 0; k < a.length; k++) {
            a[k] = sc.nextInt();
        }
        return a;
    }
    static boolean t;
    public static boolean comp(int [] arNumbers){          
            if (arNumbers[i] < arNumbers[i + 1] ){
                t =  true;
            }else if(arNumbers[i] > arNumbers[i + 1]){
                t = false; 
        }
            i++;
            return t;
            
        }
        
    
}