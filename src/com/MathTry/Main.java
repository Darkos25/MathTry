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
        if (x > y) {
            for(int n = (y+1);n<=x;n++ ){
             ++b;
            }
            for (int g = y;g<=x;g+=y){
                p++;
            }
        }
        if(y > x) {
            for (int n = (x+1);n<=y;n++){
                ++b;
            }
            for (int g = x;g <= y;g += x){
                p++;
            }
        }
        if (x == y){
            b = 0;
            p = 1;
        }
        System.out.println("Результат умножения: " + a);
        System.out.println("Результат вычитания: " + b);
        System.out.println("Результат деления: " + p);
    }
}

