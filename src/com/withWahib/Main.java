package com.withWahib;
import java.util.Scanner;
import java.lang.*;
public class Main {
    public static int linearSearch(double[] num, double key) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == key)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        double numbers[] = {1.9,1.9,2.8,8.9};
        double u = linearSearch(numbers,8.9);
        double t = linearSearch(numbers,1.7);
        double p = linearSearch(numbers,2.8);
        System.out.println(u);
        System.out.println(t);
        System.out.println(p);
    }
}