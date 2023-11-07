package com.MathTry;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int x = sc.nextInt();
        System.out.println("Введите второе число");
        int y = sc.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        for (int n = 1; n <= y; n++) {
            a += x;
        }
        for (int z = 1; z<=y;z++){
            b=x;
        }
        System.out.println(b);
        System.out.println(a);
    }
}
