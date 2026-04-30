
package com.mycompany.descriptive_3_c251225; 
 
import java.util.Scanner; 
 
public class Descriptive_3_C251225{ 
 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        String s; 
        System.out.print("Enter string: "); 
        s = sc.nextLine(); 
        String result = s.substring(0, 1).toUpperCase() + s.substring(1); 
        System.out.println("String after capitalization: " + result); 
    } 
}