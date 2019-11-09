public class Constructors {
    public static void main(String[] args) {
        Game game1 = new Game();
        Game game2 = new Game("Bloodborne");
        Game game3 = new Game("Dota", "pomoika dlya daunov", 2);
        System.out.println(game1.getGenre());


    }

}

class Game {
    private String name;
    private String genre;
    private int score;

    /*
    * Конструктор вызывается каждый раз при создании объекта
    * Конструктор от метода отличается тем, что у него нет типа возрвращаемых данных
    * Имя конструктора должно совпадать с именем конструктора
    *
    * В одном джава классе можно иметь несколько методов с одинаковыми названиями до тех пор, пока они принимают разные
    * параметры - это называется перегрузка методов.
    * Джава определяет какой метод вызывать на основе переданных объекту параметров
    *
    * Идея конструктора в том, чтобы при создании объекта инициализировались поля
    */



    // Конструктор по-умолчанию/пустой конструктор (объект всегда строиться по нему, если конструктор не объявлен)
    public Game() {
        this.name = "no name";
        this.genre = "unknown";
        this.score = 0;
        System.out.println("Привет из первого конструктора");
    }

    // Конструктор, который принимает значение name
    public Game(String name){
        this.name = name;
        System.out.println("Привет из второго конструктора");
    }

    // Конструктор, который принимает name, genre и score
    public Game(String name, String genre, int score){
        this.name = name;
        this.genre = genre;
        this.score = score;
        System.out.println("Привет из третьего конструктора");
    }




    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public String getGenre(){
        return genre;
    }
    public void setScore(int score){
        this.score = score;
    }
    public int getScore(){
        return score;
    }
}