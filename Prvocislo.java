
import java.util.Scanner;

public class Prvocislo {
    public static void main(String[] args) {
        //nacitame od uzivatele posledni cislo v poli
        Scanner sc = new Scanner(System.in);
        System.out.print("Do jakeho cisla chcete vedet prvocislo?: ");
        int lastNum = sc.nextInt();
        int [] ArrayOfNumbers = new int[lastNum - 1];
        //vytvarime pole
        ArrayOfNumbers[0] = 2;
        for (int i = 1; i < ArrayOfNumbers.length; i++) {
            ArrayOfNumbers[i] = ArrayOfNumbers[i - 1] + 1;
    
        }
        System.out.print("2, ");
        int k = 1;
        // zjistujeme ktera cisla jsou prvocisla
        while(k < ArrayOfNumbers.length){
            for (int j = 1; j <= k; j++) {
                //trapna vyjimka ve 4-ce
                if(ArrayOfNumbers[k] == 4){
                    break;
                }else if(k == j){
                    //vypisujeme to
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
      
   
    
   
