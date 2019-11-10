//      Урок 11: Массивы в Java.

package lessons11_20;

public class Arrays {
    public static void main(String[] args) {

        char character = 'a'; // примитив
        String s = "Hello"; // <=> String s = new String("Hello") // ссылочный

        int number = 10; // примитивный тип данных  // [10] (коробка)

//        Создание массива
        int[] numbers = new int[5]; // ссылочный    // numbers ссылается на [массив]

//        По умолчанию все элементы массива имеют значение 0, если это целочисленный массив
        System.out.println(numbers[0] + ", " + numbers[3] + ", " + numbers[4]);

        System.out.println();       // вывод пустой строки

//        Цикл for отлично подходит для инициализации элементов всего массива
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = i;
            System.out.println(numbers[i]);
        }

        System.out.println("второй спобоб инициализации массивов:");
//        Также можно сразу инициализировать массив таким образом
        int[] newNumbers = {1,2,3};
        for (int i = 0; i < newNumbers.length; i++){
            System.out.println(newNumbers[i]);
        }
    }
}
