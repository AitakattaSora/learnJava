// Урок 9: Операторы break и continue

public class Break_Continue {
    public static void main(String[] args) {

        /*
         * Оператор break используется для выхода из цикла
         * */

        int i = 0;
        while (true) {      // true is always true :)
            if (i == 15){
                break;
            }
            System.out.println(i);
            i++;
        }

        System.out.println("Мы вышли из цикла");
        System.out.println("Теперь оператор continue:");
        System.out.println("");

        /*
        * Оператор continue в цикле переходит к следующей итерации цикла если условие = true, минуя все, что после оператора continue
        * From w3s: The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.
        * */

        for (int n = 0; n <= 15; n++) {
            if (n % 2 == 0) {       // % - остаток от деления n на 2. Н-р: 7 % 2 = 1; 1 % 2 = 1
                continue;
            }
            System.out.println("Число " + n + " является нечетным");
        }
    }
}
