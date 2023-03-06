
package ALG2;

/**
 *
 * Represents Money Box
 */
public class MoneyBoxApp {
    int aliceSum, bobSum;
    public void Alice(){
        aliceSum = 16;
    }
    public void Bob(){
        bobSum = 0;
    } 
    public void bobAddkorun(){
        bobSum = bobSum + 2;
    }
    public void bobAddDvoukorun(){
        bobSum = bobSum + 3*2;
    }
    public void bobAddTwoNominals(){
        bobSum = bobSum + 5;
        bobSum = bobSum + 10*2;
    }
    public void allMoney(){
        System.out.println("Alice ma: " + aliceSum + "  korun");
        System.out.println("Bob ma: " + bobSum + "  korun");
    }
    public void canBuyBurger(){
        if(aliceSum >= 39 && bobSum >= 39){
            System.out.println("Oba muzou koupit hamburger");
        }else if(bobSum >= 39){
            System.out.println("Bob muze koupit hamburger");
        }else if(aliceSum >= 39){
            System.out.println("Alice muze koupit hamburger");
        }else{
            System.out.println("Nikdo nemuze koupit hamburger");
        }
    }
    public void moreMoney(){
        if(aliceSum == bobSum){
            System.out.println("Maji stejny pocet penez");
        }else if(aliceSum > bobSum){
            System.out.println("Alice ma vic penez");
        }else{
            System.out.println("Bob ma vic penez");
        }
    }
    public void bobsDonation(){
        aliceSum = aliceSum + bobSum;
        bobSum = 0;
    }
    }
    
