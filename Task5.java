package com.epam.cources;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input what bit you want change");
        int pos = in.nextInt();
        System.out.println("Input a number where you want change bit");
        int per=in.nextInt();

        String bin = Integer.toBinaryString(per);
        System.out.println(bin+"  "+per);

        per ^= (1 << (pos-1));

        String bin2 = Integer.toBinaryString(per);
        System.out.println(bin2+"  "+per);
    }
}
