//      Урок 4: Цикл while.

public class WhileLoops {
    public static void main(String[] args) {
        int i = 3;
        boolean b = true;
        boolean greater = i > 3;
        boolean equal = i == 5; // для сравнения двух чисел на равенство используется оператор "==".
                            // Не "=" т.к он уже зарезрвирован под оператор присваивания
        System.out.println(b);
        System.out.println(greater);
        System.out.println(equal);
/*
* Цикл While выполняется до тех пор, пока условие цикла верно
*   В круглых скобках пишется условие выполнения
*   В квадратных скобках пишется тело цикла (что будет выполняться пока условие верно)
* */
        // все операторы в Java пишутся с маленькой буквы
        while(i < 10) {
            System.out.println(i + ": Hello");
            i = i + 1;
        }
    }
}
