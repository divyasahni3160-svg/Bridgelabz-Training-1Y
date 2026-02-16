package com.gla.arrays;
import java.util.Scanner;
import java.util.Arrays;
public class VoteAge {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
             int x = sc.nextInt();
             arr[i]=x;
             if(x<=0){
                 System.out.println("invalid age");
             }else if(x>=18){
                 System.out.println("The student with age"+x+"can vote");
        }else {
                 System.out.println("The student with age"+x+"can not vote");
             }
    }

}}
