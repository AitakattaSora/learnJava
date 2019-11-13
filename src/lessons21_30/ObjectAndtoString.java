//      Урок 24. Класс Object и toString

package lessons21_30;

public class ObjectAndtoString {
    public static void main(String[] args) {
        Pupil p1 = new Pupil("Ross", 13);
        p1.toString();
        System.out.println(p1);
    }

    // Все классы в Java наследуются от класса Object

}

class Pupil {
    private String name;
    private int age;

    public Pupil(String name, int age){
        this.name = name;
        this.age = age;
    }

//    Переопределение метода.

    /*   Для этого нужно полностью повторить сигнутуру метода.
     * Если сигнатура метода совпадает с сигнатурой этого метода в классе родителя (Object), то при вызове этого метода,
     * будет вызываться переопределенный
     * Предназначение метода toString - представление объекта в виде строки
     */

    public String toString(){
        return name + ", " + age;
    }
}
