package lessons21_30.interfaces;

public class Animal implements Info {
    public int id;

    public Animal (int id){
        this.id = id;
    }

    public void sleep(){
        System.out.println("I am sleeping");
    }

    // имплементация метода интерфейса

    public void showInfo(){
        System.out.println("id is " + this.id);
    }
}


/*
* Интерфейс = контракт
* то есть теперь класса, которые имплементируют(реализуют) интерфейс Info, обязаны реализовать все методы,
* которые есть в интерфейсе Info
* */
