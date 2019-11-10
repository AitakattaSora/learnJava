package tests;

import java.util.Scanner;

public class ConditionsFour {
    public static void main(String[] args) {
        int dayN;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введи число от 1 до 7");
        dayN = scan.nextInt();
        switch (dayN) {
            case 1:
                System.out.println("пн");
                break;
            case 2:
                System.out.println("вт");
                break;
            case 3:
                System.out.println("ср");
                break;
            case 4:
                System.out.println("чт");
                break;
            case 5:
                System.out.println("пт");
                break;
            case 6:
                System.out.println("сб");
                break;
            case 7:
                System.out.println("вс");
                break;
            default:
                System.out.println("ty eban");
        }
    }
}
