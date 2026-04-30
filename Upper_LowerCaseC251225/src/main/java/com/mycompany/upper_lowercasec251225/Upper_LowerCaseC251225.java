

package com.mycompany.upper_lowercasec251225;
 
import java.util.Scanner; 
 
public class Upper_LowerCaseC251225 { 
 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        String s; 
        System.out.print("Enter string: "); 
        s = sc.nextLine(); 
        String upper = s.toUpperCase(); 
        String lower = s.toLowerCase(); 
        System.out.println("String in uppercase letters = " + upper); 
        System.out.println("String in lowercase letters = " + lower); 
    } 
} 