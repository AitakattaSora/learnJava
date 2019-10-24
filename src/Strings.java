//      Урок 3: Строки(String) в Java. Ссылочные типы данных.
public class Strings {
    public static void main(String [] args){
        int x = 5;
/**
 * String это Java класс, поэтому пишется с большой буквы и является ссылочной переменной.
 * String = класс, значение переменной = объект
 *
 * Отличие примитивных переменных от ссылочных заключается в том, что примитивные хранят в себе значение переменной,
   а ссылочные ссылаются на объект класса
*/

        String s = "Hello, "; // Переменная s ссылается на объект класса String
        String name = "John";
        String summ = "Summ: ";
        System.out.println(s+name); // sout + tab для автозаполнения метода println
        System.out.println("Hello, " + "Bob");
        System.out.println("The summ is: " + x);
        System.out.println(summ + x);
    }

}
