/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week07;

/**
 *
 * @author andrij.diadius
 */
public final class DateTimeTools {
    private DateTimeTools(){
        
    }
        
        public static boolean isLeap(int year){
      
        boolean isLeap = (year % 4 == 0) && (year % 100 != 0) || (year % 4 == 0);
        return isLeap;
        
                
    }
}

    

