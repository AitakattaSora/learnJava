package tests;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        //  Написать расчет факториала любого числа, используя цикл while.
        // 0! = 1...
        System.out.println("Task 2:");
        long x;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter X");
        x = scan.nextInt();
        long i = x; // counter
        if (x == 0) {
            System.out.println(1);
        } else {
            while (i > 1){
                x = x * (i - 1);
                i--;
            }
            System.out.println(x);
        }

        // Звездочки
/*
        System.out.println("Task 3:");
        for (int i = 0; i < 4; i++) {
            System.out.println("*****");
        }
*/

        // Вывести на экран все числа от 1 до 100, которые делятся на 3 без остатка.
/*
        System.out.println("Task 4:");
        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0){
                System.out.println(i);
            }
        }
*/

        // Вывести все буквы алфавита от A-Z по 4 шт. в строку.
/*
        System.out.println("Task 5:");
        char l = 'A';
        for (int i = 1; i < 27; i++){
            if (i % 4 == 0) {
                System.out.println(l);
            } else {
                System.out.print(l);
            }
            l++;
        }
*/

        // Написать бесконечный цикл while.
/*
        System.out.println("Task 6:");
        while (true) {
            System.out.println("1");
        }
*/
    }
}