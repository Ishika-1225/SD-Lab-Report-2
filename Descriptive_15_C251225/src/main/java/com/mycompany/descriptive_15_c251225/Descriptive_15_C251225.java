
package com.mycompany.descriptive_15_c251225;
 
import java.util.Scanner; 
 
public class Descriptive_15_C251225{ 
 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int A, B, C; 
        System.out.print("Alice's required temperature A: "); 
        A = sc.nextInt(); 
        System.out.print("Bob's required temperature B: "); 
        B = sc.nextInt(); 
        System.out.print("Charlie's required temperature C: "); 
        C = sc.nextInt(); 
        if (Math.max(A, C) <= B) { 
            System.out.println("Yes"); 
        } else { 
            System.out.println("No");  } 
    } 
} 