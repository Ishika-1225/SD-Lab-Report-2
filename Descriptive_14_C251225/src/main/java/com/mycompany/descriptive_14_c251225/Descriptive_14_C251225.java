
package com.mycompany.descriptive_14_c251225;

 
import java.util.Scanner; 
 
public class Descriptive_14_C251225{ 
 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int P, Q, R, S; 
        System.out.print("Enter profit of company A, P: "); 
        P = sc.nextInt(); 
        System.out.print("Enter profit of company B, Q: "); 
        Q = sc.nextInt(); 
        System.out.print("Enter profit of company C, R: "); 
        R = sc.nextInt(); 
        System.out.print("Enter profit of company D, S: "); 
        S = sc.nextInt(); 
        if ((P > (Q + R + S)) || (Q > (R + S + P)) || (R > (S + P + Q)) || (S > (P + Q + R))) { 
            System.out.println("There is a monopoly"); 
        } else { 
            System.out.println("There is no monopoly"); 
        } 
    } 
}