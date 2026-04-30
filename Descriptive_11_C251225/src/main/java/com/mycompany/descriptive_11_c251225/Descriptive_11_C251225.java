
package com.mycompany.descriptive_11_c251225;
 
import java.util.Scanner; 
 
public class Descriptive_11_C251225{ 
 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        double N; 
        System.out.print("Enter kg of pulp, N: "); 
        N = sc.nextDouble(); 
        double total = N * 10; 
        System.out.println("Number of notebook = "+(int)Math.floor(total)); 
    } 
} 
 