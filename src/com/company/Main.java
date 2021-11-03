package com.company;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        double [] arr = {1,23,43,5,76,78,6};
        sort(arr);
        System.out.println(Arrays.toString(arr));

        // write your code here
    }

    public static void sort(double[] a) {
        for (int i = 0; i < a.length; i++) {
            double min = a[i];
            for (int j = i; j < a.length; j++) {
                if (min > a[j]) {
                    double d = min;
                    min = a[j];
                    a[j] = d;
                }
            }
            a[i] = min;
        }
    }
}