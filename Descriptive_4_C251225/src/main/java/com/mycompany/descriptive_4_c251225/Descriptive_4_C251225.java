
package com.mycompany.descriptive_4_c251225;
 
import java.util.Scanner; 
 
public class Descriptive_4_C251225 { 
 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int a, b, c; 
        System.out.print("Enter digits a,b,c : "); 
        a = sc.nextInt(); 
        b = sc.nextInt(); 
        c = sc.nextInt(); 
        if (a == b) { 
            System.out.println("Value that occurs once is = " + c); 
        } else if (b == c) { 
            System.out.println("Value that occurs once is = " + a); 
        } else if (c == a) { 
            System.out.println("Value that occurs once is = " + b); 
        } 
    } 
}