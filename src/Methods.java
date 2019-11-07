//      Урок 15 + 16: Методы и типы возвращаемых данных
public class Methods {
    public static void main(String[] args){
        Perrson perrson1 = new Perrson();
        perrson1.name = "Ai";
        perrson1.age = 22;
        Perrson perrson2 = new Perrson();
        perrson2.name = "MiyaGi";
        perrson2.age = 23;
//        perrson1.sayHello();
//        perrson2.speak();
        int year1 = perrson1.calcYearsToRetirement();
        int year2 = perrson2.calcYearsToRetirement();
        System.out.println("Первому человеку " + year1 + " года до пенсии");
        System.out.println("Второму человеку " + year2 + " года до пенсии");

        System.out.println();
        // Методы с параметрами:
        Perrson persona = new Perrson();
        persona.setName("Kanna");
        persona.setAge(19);
        persona.speak();
        Perrson perisona = new Perrson();
        perisona.setNameAndAge("Aoi", 25);
        perisona.speak();

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
        return years; // обычно return идет последним и после него ничего больше не выполняется
    }

    // Методы с параметрами:

    void setName(String personName){ // название переменной внутри метода может быть любым, т.к она видна только в теле этого метода
        name = personName;
    }

    void setAge(int personAge){
        age = personAge;
    }

    void setNameAndAge(String personName, int personAge){
        name = personName;
        age = personAge;
    }
}
