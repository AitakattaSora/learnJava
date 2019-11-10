package tests;

import java.util.Scanner;

public class ConditionsOne {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number");
        int x = scan.nextInt();
        switch (x){
            case 7:
                System.out.println("You have entered 7");
                break;
            default:
                System.out.println("You have entered something else");
        }
    }
}
