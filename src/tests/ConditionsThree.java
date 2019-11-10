package tests;

import java.util.Scanner;

public class ConditionsThree {
    public static void main(String[] args) {
        int a;
        int b;
        int r;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter circle radius");
        r = scan.nextInt();
        System.out.println("Enter a side");
        a = scan.nextInt();
        System.out.println("Enter b side");
        b = scan.nextInt();
//        int rectArea = a * b;
//        double circleArea = Math.PI * Math.sqrt(r);

        if (a > b) {
            if (r >= a/2) {
                System.out.println("Можно");
            } else {
                System.out.println("Нельзя");
            }
        } else {
            if (r >= b/2) {
                System.out.println("Можно");
            } else {
                System.out.println("Нельзя");
            }
        }
    }
}
