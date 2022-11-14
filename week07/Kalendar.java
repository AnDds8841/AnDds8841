/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week07;

import java.util.Scanner;


public class Kalendar {
    static Scanner sc = new Scanner (System.in);
    
    public static void main(String[] args) {
        System.out.println("Zadej rok");
        int y = sc.nextInt();
        
       boolean result = DateTimeTools.isLeap(y);
        System.out.println("Zadany rok " + (result?"je":"neni") + " prestupny");
    }
}
