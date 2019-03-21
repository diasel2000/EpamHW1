package com.epam.cources;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Task1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input а binary number: ");
        try {
            String bin = in.nextLine();
            int binNumber = Integer.parseInt(bin,2);
            System.out.println(binNumber);

        }catch (NumberFormatException nfe){
            System.out.println("Your number is not binary");
        }

    }
}