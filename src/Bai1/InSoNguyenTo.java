package Bai1;

import java.util.Scanner;

public class InSoNguyenTo {
    public static void main(String[] args) {
        int x = 2;
        Scanner input = new Scanner(System.in);
        System.out.println("Input n: ");
       int n = input.nextInt();
        while (x < n) {
           boolean flag = true;
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println(x);


            }  x++;

        }
    }
}

