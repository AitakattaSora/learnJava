//      Продолжение урока 23: Форматирование строк

package lessons21_30;

public class StringBuilderPt2 {
    public static void main(String[] args) {
        System.out.print("Some"); // следующий принт окажается на этой же строке
        System.out.println("body once told me"); // следующий принт окажается на след строке
        System.out.println("The word is gonna roll me");

        System.out.printf("This is a string, %s", "this string will be printed instead of %s \n"); // метод для форматирования строк
        System.out.printf("String: %10d \n", 5); // ширина строки 10
        System.out.printf("String: %10d \n", 5419); // \n - переход на новую строку
        System.out.printf("String: %10d \n", 10000);
        System.out.printf("String: %10d \n", 1000000000);
        System.out.printf("String: %-10d \n", 5); // числа будут идти слева
        System.out.printf("String: %-10d \n", 5419);

        // Форматирование вещественных чисел

        System.out.printf("String: %.4f \n", 54.23);
        System.out.printf("String: %.2f \n", 54.1345); // выводить только 2 знака после запятой(точки)
        System.out.printf("String: %.2f \n", 54.32999); // кроме того, этот метод округляет числа


        /*
        Summary:
        * %s - string
        * %d - decimal
           - %10d - ширина числа 10
           - %-10d - числа будут идти слева. Ширина все еще 10
        * %f - floating (вещ.)
           - %.3f - будут выведены только первые 3 знака после запятой
        * \n - переход на новую строку (как println)
        */
    }
}

