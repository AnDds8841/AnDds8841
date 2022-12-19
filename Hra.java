
package piskvorky;

import java.util.Scanner;
//
public class Hra {
    static char symbolHrace;
    static Scanner sc  = new Scanner(System.in);
    public static void main(String[] args) {
        boolean freeSpace = true;
        boolean winning = false;
        // VYTVARENI PLOCHY
        System.out.println("Zadej velikost hraci plochy: ");
        int velikost = sc.nextInt();
        int vyhra  = velikost;
        boolean flag = true;
        char [][] plocha = new char [velikost][velikost];
        int m,n;
        int min = 0;
        int max = velikost - 1;
        
        //VYBER SYMBOLU
        System.out.println("Jaky si symbol vyberes(x/o): ");
        symbolHrace = sc.next().charAt(0);
        char symbolPocitace;
        if (symbolHrace == 'x'){
            symbolPocitace = 'o';
        }else if (symbolHrace == 'o'){
            symbolPocitace = 'x';
        }else{
            symbolPocitace = charChoose(symbolHrace);
        }
        
        //
        System.out.println("Zahrajeme si? (a/n):");
        char c = sc.next().charAt(0);
    
        //PRUBEH HRY
        boolean continuation = gettingStarted(c);
        while (continuation == true){
            for (int i = 0; i < plocha.length; i++) {
                for (int j = 0; j < plocha.length; j++) {
                    plocha [i][j] = '-';
                }
            }
            do{
            System.out.print(matrixBuild(plocha));
            
            //FRONTA HRACE
            System.out.println("Vase fronta, kam date svuj znak (0 0 az " + max + " " + max + "):");
            m = sc.nextInt();
            n = sc.nextInt();
            plocha[m][n] = symbolHrace;
            System.out.print(matrixBuild(plocha));
            winning = winCheck(plocha, m, n, symbolHrace);
            if(winning == true){
                System.out.println("Vyhral jste!");
                break;
            }
            freeSpace = freeSpaceCheck(plocha);
            if(freeSpace == false){
                System.out.println("Nejsou vis volna mista");
                break;
            }
            // FRONTA POCITACE
            m = (int)(Math.random()*(max-min+1)+min);
            n = (int)(Math.random()*(max-min+1)+min);
            do{
            flag = true;
            if(plocha [m][n] == '-'){
                plocha[m][n] = symbolPocitace;
                flag = false;
            }else{
               m = (int)(Math.random()*(max-min+1)+min);
               n = (int)(Math.random()*(max-min+1)+min); 
            }  
            }while(flag == true);
            winning = winCheck(plocha, m, n, symbolPocitace);
            if(winning == true){
                System.out.println("Vyhral pocitac");
                System.out.print(matrixBuild(plocha));
                break;
            }   
            freeSpace = freeSpaceCheck(plocha);
            if(freeSpace == false){
                System.out.println("Nejsou vis volna mista");
                break;
            }
        }while(continuation == true);
            System.out.println("Zahrajeme si? (a/n):");
            c = sc.next().charAt(0);
            continuation = gettingStarted(c);
        }
        
    }
        // METODA PRO ZACINANI HRY
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
              System.out.println("Zahrajeme si? (a/n):");
              c = sc.next().charAt(0);  
            }
            }while(flag = true);
        
            return k;     
    }
        // METODA PRO VYBER SYMBOLU
        public static char charChoose(char c){
        char k = 'o';
        boolean flag = true;
        do{
            if(c == 'x'){
                k = 'o';
                break;
            }else if(c == 'o'){
                k = 'x';
                break;
            }else{
              System.out.println("Jaky si symbol vyberes(x/o): ");
              c = sc.next().charAt(0);  
            }
            }while(flag = true);
            symbolHrace = c;
            return k;     
    }
        // METODA PRO VYPIS PLOCHY
        public static String matrixBuild(char [][] a) {
        String k = "";
        for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    System.out.print(a[i][j]);
                    System.out.print("  ");   
                }
                System.out.println("");
            }
        System.out.println("");
        return k;
    }
        // METODA PRO ZJISTENI VITEZTVI
        public static boolean winCheck(char [][] a, int m, int n, char t){

            boolean k = false;
            for (int j = 0; j < a.length; j++) {
                if (a[m][j] == t){
                  k = true;  
                }else{
                    k = false;
                    break;
                }
            } 
            
            if(k == true){
                return k;
            }    
                
            for (int i = 0; i < a.length; i++) {
                if (a[i][n] == t){
                  k = true;  
                }else{
                    k = false;
                    return k;
                }
            }
            return k;
        }
        //METODA PRO ZJISTENI VOLYCH POLI
        public static boolean freeSpaceCheck(char a [][]){
            boolean k = false;
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    if(a[i][j] == '-'){
                        k = true;
                        return k;
                    } 
                }
            }
            return k;
        }
  }
    

