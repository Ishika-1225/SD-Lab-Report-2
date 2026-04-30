
package com.mycompany.oneton.c251225;

import java.util.Scanner;

public class OnetoNC251225 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (N): ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}