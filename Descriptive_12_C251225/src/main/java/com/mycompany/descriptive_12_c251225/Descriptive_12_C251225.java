
package com.mycompany.descriptive_12_c251225;
 
import java.util.Scanner; 
 
public class Descriptive_12_C251225 { 
     
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int N, X; 
        System.out.print("Enter number of children, N: "); 
        N = sc.nextInt(); 
        System.out.print("Already has number of candies, X: "); 
        X = sc.nextInt(); 
        double candyPacketNo = (double) (N - X) / 4; 
        System.out.println("Minimum number of candy packets = " + Math.ceil(candyPacketNo)); 
    } 
} 
