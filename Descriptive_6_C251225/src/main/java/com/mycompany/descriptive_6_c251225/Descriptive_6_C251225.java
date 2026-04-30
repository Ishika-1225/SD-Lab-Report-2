

package com.mycompany.descriptive_6_c251225; 
 
import java.util.Scanner; 
 
public class Descriptive_6_C251225 { 
 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int n, x; 
        System.out.print("Enter number of friends in the group, n : "); 
        n = sc.nextInt(); 
        System.out.print("Enter the cost of one IIUC-TV subscription, x : "); 
        x = sc.nextInt(); 
        double subscriptionNo; 
        double total; 
        subscriptionNo = (double) n / 6; 
        total = Math.ceil(subscriptionNo) * x; 
        System.out.println("Minimum total cost of " + n + " friends " + total); 
    } 
}