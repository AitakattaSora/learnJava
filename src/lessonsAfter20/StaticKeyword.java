//      Урок 21: Ключевое слово static

package lessonsAfter20;

public class StaticKeyword {
    public static void main(String[] args) {
        Human.description = "Nice"; // инициализация статической переменной
        Human.getDescription();
        Human h1 = new Human("Bob", 52);
        Human h2 = new Human("Phil", 24);
        h1.setName("Ross"); // изменилось имя у объекта h1, а не у класса
//      h1.description = "Bad"; // Это возможно, но не совсем верно и не имеет смысла с точки зрения ООП
        h1.getAllFields();
        h2.getAllFields();
        Human.description = "Good";
        h1.getAllFields();
        h2.getAllFields();

        System.out.println("");

//      Пример статической переменной
        System.out.println(Math.PI);

//      Пример статического метода
        System.out.println(Math.pow(2, 4)); // => 2 в 4 степени

//      Для обращения к статической переменной/методу нам не нужно создавать объект ее класса (Math)

    }
}

class Human {
    /*
    * Эти переменные являются переменными объекта, а не переменные класса, т.к. у каждого объекта они разные;
    * Эти переменные не принадлежат классу Human. Они создаются лишь тогда, когда создается объект класса Human.
    * Для каждого объекта создаются свои переменные.
    */
    private String name;
    private int age;

    /*
    * А эта переменная является переменной класса - ключевое слово static ставиться перед типом переменной.
    * Статическая переменная является общей для всех объектов класса Human.
    */

    public static String description; // декларация статической переменной


    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    /*
    * Методы setName и setAge тоже являются методами объекта. Т.к мы назначаем имя/возраст конкретному объекту, а не классу.
    *
    * */
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void getAllFields(){
        System.out.println(name + ", " + age + ", " + description);
    }

    // Статический метод

    public static void getDescription() {
        System.out.println(description);
    }

    /*
     * Статические переменные можно использовать в методах объектов,
     * но в статических методах нельзя использовать переменные объектов, т.к. переменные у каждого объекта свои
     ** Статический метод может работать только со статическими переменными;
     ** Статические переменные и методы создаются до создания объектов.
     *

     public static void printAllFields(){
        System.out.println(name + ", " + age + ", " + description);
        Error: non-static field 'name' cannot be referenced from a static context - т.к name у каждого объекта свой
    }

     */


}
