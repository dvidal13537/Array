package com.company;

import java.util.Scanner;

public class Array {
    public static void ArrayEx() {

        int[] ages = new int[5];

        ages[0] = 10;
        ages[1] = 2;
        ages[2] = 6;
        ages[3] = 8;
        System.out.println(ages[0]);
        System.out.println(ages[1]);

    }

    public static void ArrayEx2() {

        int[] ages = new int[5];

        ages[0] = 10;
        ages[1] = 12;
        ages[2] = 15;
        ages[3] = 17;

        for (int b = 0; b < ages.length; b++ ){
            System.out.println(ages [b]);
        }
    }

    public static void ArrayEx3() {

        int[] num = new int[4];

        for (int p = 0; p < 4; p++) {
            System.out.println("Introduce un número para la Array");
            Scanner a = new Scanner(System.in);
            int az = a.nextInt();
            num[p] = az;
        }
        for (int i = 4; i > num.length; i++) {
            System.out.println(num[i]);
        }
    }



    public static void ArrayEx4() {

        int[] num = new int[4];

        for (int p = 0; p < 4; p++) {
            System.out.println("Introduce un número para la Array");
            Scanner a = new Scanner(System.in);
            int az = a.nextInt();
            num[p] = az;
        }
        for (int i = 4; i > num.length; i++) {
            System.out.println(num[i]);
        }
    }
}

