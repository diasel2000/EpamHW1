package com.epam.cources;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input а number: ");
        int inve = in.nextInt();
        System.out.println("Inversion of your number: "+(~inve+1));
    }
}
