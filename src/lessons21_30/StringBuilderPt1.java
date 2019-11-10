//		Урок 23: StringBuilder

package lessons21_30;

public class StringBuilderPt1 {
    public static void main(String[] args) {

        // Mutable/Immutable

        /*
        * В Java есть 2 типа объектов: Mutable и Immutable (Изменяемые и Неизменяемые)
        * Тип String - immutable.
        * Все методы класса String не изменяют строку, а возвращают новую, которая является результатом выполнения метода.
        *
        */

        String x = "Hello";
        x.toUpperCase();
        System.out.println(x);
        x = x.toUpperCase(); // метод не переопределяет строку x, а возвращает новую
        System.out.println(x);
        System.out.println("------");


        // Конкатенация строк

        String string1 = "Welcome";
        String string2 = " my";
        String string3 = " friend";
        String message = string1 + string2 + string3;
        System.out.println(message);

        /*
        * При сложении string1 и string2 значения этих переменных не изменились, а создалась новая строка, которая создержит в себе обе.
        * При сложении этой новой строки и string3 так же создалась новая строка, которая содержит 1+2 и 3
        *
        * В данном случае у нас происходит создание двух дополнительных строк.
        * Если количество конкатенаций небольшое, то ничего страшного, но если их много и они, например, в цикле, то
        * это сильно снижает скорость программы и расход памяти. Для таких целей есть StringBuilder
        */


        // Mutable String = StringBuilder

        /*
        * Суть StringBuilder в том, что можно не создавая новые объекты класса конкатенировать сколько угодно строк
        * Если необходимо часто изменять строрку, то лучше использовать не String, а StringBuilder
        */

        StringBuilder sb = new StringBuilder("Hello"); // значение объекта можно задать сразу, а можно и не делать этого
        System.out.println(sb.toString());
        sb.append(" my"); // метод конкатенации
        sb.append(" friend");
        System.out.println(sb.toString());

// То же самое можно сделать при помощи Method chaining

        StringBuilder sb2 = new StringBuilder("Neil");
        // метод append возвращается объект класса StringBuilder, на котором он был вызван
        sb2.append(" is").append(" the best").append(" teacher"); // method chaining - вызов методов по цепочке

        System.out.println(sb2.toString());

    }
}