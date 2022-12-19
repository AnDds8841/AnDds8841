
package ALG1Sem;

import java.util.Scanner;
public class semestralniPrace {
    static Scanner sc = new Scanner(System.in);
    static int j = 0;
    public static void main(String[] args) {
        //VYTVARENI PROMENNYCH
        int size = 2;
        int [] mainAr;
        int [] searchedAr;
        boolean continuation;
        boolean result = false;
        int tempi = 0;
        //
        System.out.println("Pokracovat ve zpracovani (a/n):");
        char c = sc.next().charAt(0);
        // ZACATEK ZPRACOVANI 
        continuation = gettingStarted(c);
        while(continuation == true){
            //NACITANI DVOU POLI
            mainAr = new int [size + 1];
            System.out.println("Zadej posloupnost:");
            mainAr[0] = sc.nextInt();
            for (int i = 1; mainAr[i - 1] >= 0; i++) {
                if(i <= size){
                mainAr[i] = sc.nextInt(); 
                }else{
                    mainAr = addSize(mainAr, size);
                    size = size + 1;
                    i = i - 1;
                }
            }
            size = 2;
            searchedAr = new int [size + 1];
            System.out.println("Hledana sekvence: ");
            searchedAr[0] = sc.nextInt();
            for (int i = 1; searchedAr[i - 1] >= 0; i++) {
                if(i <= size){
                searchedAr[i] = sc.nextInt();
                }else if(i > size){
                   searchedAr = addSize(searchedAr, size);
                   size = size + 1;
                   i = i - 1;
                }    
            }
            
            //NALEZENI SEKVENCE
            for (int i = 0; i < mainAr.length -1; i++) {
                tempi = i;
                for (j = 0; j < searchedAr.length -1; j++) { 
                    if(mainAr[i] == searchedAr[j]){
                        result = true;
                        i++;
                    }else if(result == true && mainAr[i] != searchedAr[j]){
                        result = false;
                        i = i - 1;
                        break;
                    }else{
                        result = false;
                        break;
                    }
                }
                if(j == searchedAr.length - 1 && result == true){
                    tempi++;
                    System.out.println("Sekvence nalezena na pozici " + tempi);
                    System.out.println("");
                    break;
                }   
            }
            if(result == false){
               System.out.println("Sekvence nenalezena ");
               System.out.println(""); 
            }
            //UKONCENI PROGRAMU
            System.out.println("Pokracovat ve zpracovani (a/n):");
            c = sc.next().charAt(0);
            continuation = gettingStarted(c);
        }
    }      
    // METODA PRO NACITANI ODPOVEDI
    public static boolean gettingStarted(char c){
        boolean k = false;
        boolean flag = true;
        do{
            if(c == 'a' || c == 'A'){
                k = true;
                break;
            }else if(c == 'n' || c == 'N'){
                break;
            }else{
              System.out.println("Pokracovat ve zpracovani (a/n):");
              c = sc.next().charAt(0);  
            }
            }while(flag = true);
        
            return k;
    }
    
    public static int[] addSize(int [] a, int size){
        int [] temp = new int [size + 2];
        for (int i = 0; i < a.length; i++) {
            temp[i] = a[i];  
        }
      return temp;
    }
}