//      Урок 22: Ключевое слово final

package lessons21_30;

public class FinalKeyword {
    public static void main(String[] args) {
        final int X = 10;
        System.out.println(X);
    }
}

    /*
     * Ключевое слово final нужно для обозначения констант.
     * Константы принято называть заглавными буквами, чтобы отличать от других.
     * Значение константы после инициализицаии нельзя изменить.
     * Обычно константы являются статическими переменными. Иначе будет перегрузка памяти.
     */

class Test {
    public static final int KONSTANTA = 0;
}