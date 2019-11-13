package lessons21_30;

public class Dog extends Animal {
    // Теперь Dog наследуется от Animal (Собака является животным)
    public void bark(){
        System.out.println("Dog is barking");
    }
    // переопределние метода родителя
    public void eat(){
        System.out.println("Dog is eating");
    }

    public void showName(){
        System.out.println(name);
    }
}
