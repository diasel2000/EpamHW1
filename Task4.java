package com.epam.cources;

import java.util.Scanner;


public class Task4 {

    public static int GCD(int a, int b){

        while (b!=0){
            int temp = a % b;
            a = a ^ b;
            b = a ^ b;
            a = a ^ b;
            b = temp;
        }if (a <= 0||b<=0)
            return Math.abs(a);
        return GCD(b, a % b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = in.nextInt();
        System.out.print("Input b: ");
        int b = in.nextInt();

        System.out.println("GCD:"+GCD(a,b));
    }



    }

