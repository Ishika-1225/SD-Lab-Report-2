
package com.mycompany.sum.c251225;

import java.util.Scanner;

public class SumC251225 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();  // input N
        
        int sum = n * (n + 1) / 2;
        
        System.out.println("Sum = " + sum);
    }
}