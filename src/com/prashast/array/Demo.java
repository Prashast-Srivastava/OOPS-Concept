package com.prashast.array;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9};
//        System.out.println(num);
//        for (int i = 0; i < num.length; i++) {
//            System.out.println(num[i]);
//        }
//        System.out.println(Arrays.toString(num));

//        Scanner in = new Scanner(System.in);
//        System.out.println("enter the elements: ");

        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = in.nextInt();
                arr[i][j] = (int) (Math.random()*10);
            }
        }
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
