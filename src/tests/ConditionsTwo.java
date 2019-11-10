package tests;

import java.util.Scanner;

public class ConditionsTwo {
    public static void main(String[] args) {
        int x;
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter a number");
        x = scan1.nextInt();

        if (x != 0){
            switch(x % 2){
                case 0:
                    System.out.println("Число четное");
                    break;
                default:
                    System.out.println("Число нечетное");
            }
        } else {
            System.out.println("Ты ввел ноль");
        }
    }
}
