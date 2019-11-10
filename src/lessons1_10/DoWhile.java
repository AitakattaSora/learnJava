//      Урок 8: Цикл do...while.

package lessons1_10;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите 5")
//        int value = scanner.nextInt();
//        while(value != 5) {
//            System.out.println("Введи 5");
//            value = scanner.nextInt();
//
//        }

//        То же самое можно написать с помощью цикла do-while:

        /*
         * Цикл do-while используется достаточно редко
         * Отличие цикла do-while от while в том, что действие в do-while выполнится хотя бы 1 раз, не смотря на true/false.
         */
        Scanner scanner = new Scanner(System.in);
        int value;



        do {
            System.out.println("Введи 5");
            value = scanner.nextInt();
        } while(value != 5);


        System.out.println("Вы ввели 5");
    }
}

