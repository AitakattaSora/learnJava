// Урок 33: Введение в параметризацию. (Generics)

package lessons31_40.generics33;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // Применение дженериков на примере коллекций ArrayList (динамический массив)

        ///// как было до Java 5 /////
        List animals = new ArrayList();
        Animal ourAnimal = new Animal();
        animals.add("cat"); // метод, который добавляет элемент в массив до тех пор, пока есть место в памяти
        animals.add("dog");
        animals.add("bird");
        animals.add(ourAnimal); // можно, т.к класс Animal наследуются от Object

        // Объект класса ArrayList по умолчанию хранит в себе объекты класса Object. Для того чтобы записать объекты ArrayList в
        // переменную String, нужно их задаункастить

        String animal = (String) animals.get(0); // downcast
        System.out.println(animal);

        ///// с появлением дженериков /////
        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("bird");
//      animals2.add(ourAnimal); // нельзя, т.к. это строковый массив (<String>)

        String animal2 = animals2.get(2);
        System.out.println(animal2);

        ///// начиная с Java 7 /////
        List<String> animals3 = new ArrayList<>(); // не обязательно указывать тип справа

    }
}

class Animal {

}