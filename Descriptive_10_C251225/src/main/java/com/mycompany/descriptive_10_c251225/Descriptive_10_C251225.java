

package com.mycompany.descriptive_10_c251225;
import java.util.Scanner; 
 
public class Descriptive_10_C251225 { 
 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int B1, B2, B3; 
        System.out.print("Enter B1: "); 
        B1 = sc.nextInt(); 
        System.out.print("Enter B2: "); 
        B2 = sc.nextInt(); 
        System.out.print("Enter B3: "); 
        B3 = sc.nextInt(); 
        if ((B1 == 0 && B2 == 0) || (B2 == 0 && B3 == 0) || (B3 == 0 && B1 == 0)) { 
            System.out.println("Water filling time"); 
        } else { 
            System.out.println("Not now"); 
        } 
    } 
}