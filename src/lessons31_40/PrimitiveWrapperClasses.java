//      Урок 31: Классы-обертки примитивных типов данных

package lessons31_40;

public class PrimitiveWrapperClasses {
    public static void main(String[] args) {
        // Классы обертки примитивов нужны т.к у примитивов нет своих методов
        // Double, Float, Long, Integer, Short, Byte, Character и Boolean

        int x = 1;
        Integer x2 = 123;
        Integer.parseInt("123"); // метод, который конвертирует числовую строку в число(int)

        // Автоупаковка
        Integer x3 = 1448; // Java сама "упаковала" это значение в объект класса Integer (Integer x3 = new Integer(1448))

        // Автораспаковка
        Integer x4 = 1337; // здесь мы упаковали примитив в класс обертку
        int y = x4; // здесь мы его распаковали в примитив
        System.out.println(y);

    }
}
