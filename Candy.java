/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author Aravind
 */
public class Candy {
     public static void main(String[] args) {
        // TODO code application logic here
         int b=0;
         System.out.println("How many children u want to check:");
         Scanner s1=new Scanner(System.in);
         int n=s1.nextInt();
         System.out.println("Rating for childrens:");
         int[] a=new int[100];
         for(int i=0;i<n;i++){
             a[i]=s1.nextInt();
         }
         for(int j=0;j<n;j++){
             b=b+a[j];
         }
         System.out.println("The minimum no. of candies is:"+b);
     }
}
