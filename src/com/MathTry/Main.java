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
        int k = 0;
        int b = 0;
        int c = 0;
        int p = 0;
        for (int n = 1; n <= y; n++) {
            a += x;
        }
        if (x >= y) {
            k = Math.negateExact(y);
            b = x+(k);
            c = x;
            for (int z = 0; c>0; z++) {
                c += (k);
                ++p;
            }
        } else {
            k = Math.negateExact(x);
            b = y+(k);
            c = y;
            for (int z = 0; c>0; z++){
                c += (k);
                ++p;
            }
        }
        System.out.println("Результат умножения: " + a);
        System.out.println("Результат вычитания: " + b);
        System.out.println("Результат деления: " + p);
    }
}

