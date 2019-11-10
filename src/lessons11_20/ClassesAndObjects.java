//      Урок 14: Классы и объекты.

package lessons11_20;

public class ClassesAndObjects {

    /*
     * В java-файле может быть только один публичный класс
     * Имя публичного класса должно соответствовать имени java-файла
     *
     *
     */

    public static void main(String[] args){
        Person person1 = new Person();
        person1.name = "Ai";
        person1.age = 22;
        System.out.println("My name is " + person1.name + ", I am " + person1.age + " years old");

        Person person2 = new Person();
        person2.name = "Miyagi";
        person2.age = 27;
        System.out.println("My name is " + person2.name + ", I am " + person2.age + " years old");
    }
}

class Person{
    // У класса могут быть:
    // 1. Данные (поля)
    // 2. Действия, которые он может совершать (методы)

    // Данные/поля:
    String name;
    int age;

}
