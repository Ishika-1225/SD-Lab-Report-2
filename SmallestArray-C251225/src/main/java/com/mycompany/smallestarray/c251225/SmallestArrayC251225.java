
package com.mycompany.smallestarray.c251225;

import java.util.Scanner; 
 
public class SmallestArrayC251225 { 
 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int i,size; 
        System.out.print("Enter array size : "); 
        size = sc.nextInt(); 
        int[] arr = new int[size]; 
        System.out.print("Enter array elements: "); 
        for (i = 0; i < size; i++) { 
            arr[i] = sc.nextInt(); 
        } 
        int min=arr[0]; 
        for(i=1;i<size;i++) 
        { 
            if(arr[i]<min) 
            { 
                min=arr[i]; 
            } 
        } 
        System.out.println("Smallest element is = "+min); 
    } 
} 