//      Урок 7: Ввод данных. Класс Scanner.

package lessons1_10;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        /*
         * Scanner - класс
         * new Scanner - объект класса Scanner
         * System.in - стандартный входной поток
         * Теперь s ссылается на объект класса Scanner
        */

        Scanner s = new Scanner(System.in); // new - ключевое слово, которое обозначает создание нового объекта класса
        System.out.println("Enter something");
        String myString = s.nextLine(); // nextLine - метод класса Scanner, который считывае 1 строчку чего-либо
        System.out.println("You have entered: " + myString);


    }
}