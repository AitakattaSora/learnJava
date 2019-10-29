//      Урок 12: Цикл for each, Массивы строк.

public class Array_of_Strings {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        String[] strings = new String[3]; //  данный массив может вместить в себя 3 объекта класса String (3 строки)
        strings[0] = "Привет";
        strings[1] = "Пока";
        strings[2] = "Java";

        for(int i = 0; i < strings.length; i++){ // fori - idea shortcut to create For loop
            System.out.println(strings[i]);
        }
        System.out.println();

        /*
        * Цикл Foreach подходит для работы с массивами - последовательно проходит по каждому элементу массива и выполняет
        * инструкции в теле цикла
        *
        * Синтаксис:
        * for (объвление переменной: название массива){
        *   тело;
        * }
        *
        * строка string ссылается на первый элемент массива strings, выполняет инструкцию в теле
        * затем идет вторая итерация, в которой строка string ссылается на второй элемент массива и так до конца массива
        * */

        for (String string:strings){ //  сидет на след. итерацию
            System.out.println(string);
        }

        int[] numbers1 = {1, 2, 3};
        int sum = 0;
        for (int x: numbers1){
            sum = sum + x;
        }
        System.out.println(sum);

        int value = 0;
        String s;
    }
}