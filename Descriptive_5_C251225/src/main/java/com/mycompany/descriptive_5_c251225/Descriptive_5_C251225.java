

package com.mycompany.descriptive_5_c251225;
 
import java.util.Scanner; 
 
public class Descriptive_5_C251225 { 
 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int a, b, c; 
        System.out.print("Enter numbers A,B,C : "); 
        a = sc.nextInt(); 
        b = sc.nextInt(); 
        c = sc.nextInt(); 
        if ((double) (a + b) / 2 > c) { 
            System.out.println("The average of A and B is strictly greater than C"); 
        } else { 
            System.out.println("The average of A and B is strictly not greater than C"); 
        } 
    } 
} 
 