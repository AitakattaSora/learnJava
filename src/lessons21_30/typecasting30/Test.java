//      Урок 30: Приведение примитивных типов данных.

package lessons21_30.typecasting30;

public class Test {
    public static void main(String[] args) {


        float f1 = 123.2f; // по умолчанию вещественные числа имеют тип double
        long l1 = 123123L; // то же самое с long (по умолчанию int)

        // из int в long конвертировать можно, а из long в int - нельзя
        int a = 123;
        long l = a; // неявное приведение (делается за нас и неявно, что будет по итогу)
        int x = (int)l; // явное приведение, мы сами его прописываем

        // все, что является int может быть long, но не наоборот (Г - ЛОГИКА)

        float f = (float)123.2; // <=> float f = 123.2f;
        int b = 322;
        double d = b; // неявно

        double d2 = 22.8;
        int x2 = (int)d2; // вещественная часть просто отрезается (не округление)
        System.out.println(x2);
    }
}
