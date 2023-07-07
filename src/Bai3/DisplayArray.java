package Bai3;

import java.util.Arrays;
import java.util.Scanner;

public class DisplayArray {
    public static void main(String[] args) {
        int[] array = new int[8];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Input index number " + (i + 1));
            array[i] = input.nextInt();
        }
        System.out.println("New Array: "+ Arrays.toString(array));

    }
}