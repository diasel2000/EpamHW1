package com.epam.cources;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input number for check count of bit");
        long n = in.nextLong();
        int counter = 0;
        while (n != 0) {
            counter += n & 1;
            n = n >> 1;
        }

        System.out.println("count of bit in n="+counter);
    }
}
