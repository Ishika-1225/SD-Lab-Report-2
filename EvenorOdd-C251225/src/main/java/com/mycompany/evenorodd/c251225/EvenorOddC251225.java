package com.mycompany.evenorodd.c251225;
import java.util.Scanner;

public class EvenorOddC251225 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  

        System.out.print("Enter a number: ");
        int number = input.nextInt();  

        if (number % 2 == 0) {  
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        input.close(); 
    }
}