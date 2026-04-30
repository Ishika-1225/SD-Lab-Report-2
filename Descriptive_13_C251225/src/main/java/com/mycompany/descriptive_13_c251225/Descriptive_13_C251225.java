package com.mycompany.descriptive_13_c251225; 
 
import java.util.Scanner; 
 
public class Descriptive_13_C251225{ 
 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        char x; 
        System.out.print("Enter topic name, X: "); 
        x = sc.next().charAt(0); 
        if (x == 'A' || x == 'B' || x == 'C') { 
            System.out.println("Yes"); 
        } else { 
            System.out.println("No"); 
        } 
    } 
}