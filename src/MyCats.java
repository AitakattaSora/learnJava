/* Задание от Жени :)
 * Напиши класс Cat:
 * У кошечки может быть имя name, возраст age и цвет color - все это private
 * Поставить геттеры и сеттеры
 * Должно быть 4 конструктора:
 * 1 - по умолчанию
 * 2 - принимаем имя
 * 3 - принимаем имя и возраст
 * 4 - все параметры
 */

public class MyCats {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setName("Simba");
        cat1.setAge(3);
        cat1.setColor("dark");
        Cat cat2 = new Cat("Fluffy");
        Cat cat3 = new Cat("Smokey", 1);
        Cat cat4 = new Cat("Kitty", 2, "white");
//        System.out.println(cat1.getName() + ", " + cat1.getAge() + ", " + cat1.getColor());
//        System.out.println(cat2.getName());
//        System.out.println(cat3.getName() + ", " + cat3.getAge());
//        System.out.println(cat4.getName() + ", " + cat4.getAge() + ", " + cat4.getColor());
        cat1.toString();
        System.out.println(cat1);
    }
}

class Cat{
    private String name;
    private int age;
    private String color;

//  Переопределение дефолтного метода toString
    @Override
    public String toString (){
            return "Name: " + name + ", Age: " + age + ", Color: " + color;
        }
        //  конструктор 1
    public Cat(){

    }
//  конструктор 2
    public Cat(String name){
        this.name = name;
    }
//  конструктор 3
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }
//  конструктор 4
    public Cat(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }
//  геттеры и сеттеры..
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

}