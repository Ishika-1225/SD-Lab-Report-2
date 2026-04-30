
package com.mycompany.descriptive_9_c251225; 
 
import java.util.Scanner; 
 
public class Descriptive_9_C251225 { 
 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int x, y; 
        System.out.print("Enter working hour per day, X: "); 
        x = sc.nextInt(); 
        System.out.print("Enter working hour on Wednesday, Y: "); 
        y = sc.nextInt(); 
        int total = (x * 4) + y; 
        System.out.println("total number of working hours in one week = " + total); 
    } 
} 
 