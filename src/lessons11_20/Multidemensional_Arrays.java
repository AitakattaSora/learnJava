//      Урок 13: Многомерные массивы

package lessons11_20;

public class Multidemensional_Arrays {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[1]);

        System.out.println();
//        int[][] numbers1 = new int[2][2];
        int[][] numbers2 = {{1,2,3}, {4,5,6}, {7,8,9}};

        /**
         * Многомерный массив это по сути матрица
         * Чаще всего используются двумерные массивы
         * У каждого элемента многомерного массива есть индекс, который состоит из номера строки и номера столбца
         *
         * Массив numbers2 можно представить как:
         *            {1, 2, 3}
         * numbers =  {4, 5, 6}
         *            {7, 8, 9}
         *
         */

        // Цикл для работы с двумерными массивами

        for (int i = 0; i < numbers2.length; i++) { //  первый цикл проходится по элементам внешних массивов
            for (int j = 0; j < numbers2[i].length ; j++) { // второй цикл проходится по элементам внутренних массивов
                System.out.print(numbers2[i][j] + " "); // println - вывод на новой строке, print - вывод на одной строке
            }
            System.out.println();
        }
    }
}
