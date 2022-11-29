
package ArrayEx;

import java.util.Scanner;

public class Prvocislo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Do jakeho cisla chcete vedet prvocislo?: ");
        int lastNum = sc.nextInt();
        int [] ArrayOfNumbers = new int[lastNum - 1];
        ArrayOfNumbers[0] = 2;
        for (int i = 1; i < ArrayOfNumbers.length; i++) {
            ArrayOfNumbers[i] = ArrayOfNumbers[i - 1] + 1;
    
        }
      //  for (int j = 0; j < ArrayOfNumbers.length; j++) {
      //   System.out.println(ArrayOfNumbers[j]);
        System.out.print("2, ");
        /*for (int j = 0; j < ArrayOfNumbers.length; j++) {
            if( ArrayOfNumbers[j] % 2 != 0)
                System.out.print(ArrayOfNumbers[j] + ", ");
        else
              continue;
    }
        System.out.println("- jsou prvocisla");
            
        */
        int k = 1;
        while(k < ArrayOfNumbers.length){
            for (int j = 1; j <= k; j++) {
                if(ArrayOfNumbers[k] == 4){
                    break;
                }else if(k == j){
                    System.out.print(ArrayOfNumbers[k] + ", ");
                }else if(ArrayOfNumbers[k] % ArrayOfNumbers[j] == 0){
                    break;
                }
                
            }
            k++;
        }
        System.out.println("- jsou prvocisla");
    }

    }
      
   
    
   
