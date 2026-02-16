package com.gla.arrays;
import java.util.Scanner;
public class Input5No {
    public static void main(String[] args) {
        int[] arr= new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            int x = sc.nextInt();
            arr[i]=x;
            if(x>0){
                if(x%2==0){
                System.out.println("even");
                }else {
                    System.out.println("odd");
                }
            }
            else if(x<0){
                System.out.println("negative");
            } else {
                System.out.println("zero");
            }
        }
        if (arr[0]==arr[4]){
            System.out.println("first and last are equal");
        }else if(arr[0]>arr[4]){
            System.out.println("first is greater");
        }else {
            System.out.println("last is greater");
        }

    }
}
