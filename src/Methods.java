import java.sql.SQLOutput;

//      Урок 15: Методы в Java.
public class Methods {
    public static void main(String[] args){
        Perrson perrson1 = new Perrson();
        perrson1.name = "Ai";
        perrson1.age = 22;
        Perrson perrson2 = new Perrson();
        perrson2.name = "MiyaGi";
        perrson2.age = 27;
//        perrson1.sayHello();
//        perrson2.speak();
        int year1 = perrson1.calcYearsToRetirement();
        int year2 = perrson2.calcYearsToRetirement();
        System.out.println(year1);
        System.out.println(year2);

    }
}

class Perrson {
    String name;
    int age;

    // Методы пишутся с маленькой буквы, но в camelCase

    void speak (){
        for (int i = 0; i < 3; i++) {
            System.out.println("My name is " + name + ", I am " + age + " years old");
        }
    }

    /*
     * Синтаксис создания методов:
     * тип_возвращаемого_значения название_метода (параметры){
     *     тело
     * }
     *
     * void - пустота. Метод сам по себе ничего не возвращает
     *
     */

    void sayHello (){
        System.out.println("Hello! ");
    }

    int calcYearsToRetirement(){
        int years = 65 - age;
        return years;
    }
}
