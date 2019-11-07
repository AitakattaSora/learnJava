//  Урок 18: Инкапсуляция, геттеры и сеттеры
public class SettersAndGetters {
    public static void main(String[] args){

        /*
         *
         * 1 - для гибкости (если поменять имя переменной в классе, то юзер не сможет больше к ним обращаться)
         * 2 - в методы можно присвоить проверку
         *
         * Геттеры и сеттеры используются в API
         * */

        Song song1 = new Song();
        song1.setArtist("МАКСИМ СВОБОДА");
        song1.setTitle("ВОЗДУХ НА СИГАРЕТЫ");
        song1.setYear(2018);
        song1.getSongInfo();
        Song song2 = new Song();
        song2.setArtist("ЛСП");
        song2.setTitle("Лучше чем интернет");
        song2.setYear(2014);
        System.out.println(song2.getArtist() + " - " + song2.getTitle() + " (" + song2.getYear() + ")");
        // test validation
        Song song3 = new Song();
        song3.setArtist("");
        song3.setTitle("");
        song3.setYear(-3);

    }


}

class Song {
    private String artist; // private - поле доступно только в пределах класса
    private String title;
    private int year;

    public void getSongInfo(){
        System.out.println(artist + " - " + title + " (" + year + ")");
    }

    public void setArtist(String songArtist){
        if (songArtist.isEmpty()) {
            System.out.println("Вы че дебилы?");
        } else {
            artist = songArtist;
        }
    }

    public String getArtist(){
        return artist;
    }

    public void setTitle(String songTitle) {
        if (songTitle.isEmpty()) {
            System.out.println("Вы че ебанутые?");
        } else {
            title = songTitle;
        }
    }

    public String getTitle(){
        return title;
    }

    public void setYear (int songYear){
        if (songYear <= 0){ // validation
            System.out.println("Вы внатуре ебанутые");
        } else {
            year = songYear;
        }
    }

    public int getYear (){
        return year;
    }


}