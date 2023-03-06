/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ALG2;

public class MoneyBoxApp1 {

    public static void main(String[] args) {
        MoneyBox moneyBoxA = new MoneyBox("Alice", 3, 7);
        MoneyBox moneyBoxB = new MoneyBox("Bob");

        moneyBoxB.addPocetkc(2, 0);
        moneyBoxB.addPocetkc(0, 3);
        moneyBoxB.addPocetkc(5, 10);

        moneyBoxA.getSum();
        moneyBoxB.getSum();
        moneyBoxA.toString();
        moneyBoxB.toString();

        if (moneyBoxA.isEnough(39) == true) {
            System.out.println("Alice si muze koupit hamburger");
        } else if (moneyBoxB.isEnough(39) == true) {
            System.out.println("Bob si muze koupit hamburger");
        }

        if (moneyBoxA.getSum() == moneyBoxB.getSum()) {
            System.out.println("Maji stejny pocet penez");
        } else if (moneyBoxA.getSum() > moneyBoxB.getSum()) {
            System.out.println("Alice ma vic penez");
        } else {
            System.out.println("Bob ma vic penez");
        }
        
        
    }

}
