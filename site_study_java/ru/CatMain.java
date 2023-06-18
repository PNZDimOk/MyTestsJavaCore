package site_study_java.ru;

public class CatMain {
    public static void main(String[] args) {
        Cat cat = new Cat(12, "Ryzhik","black-white");
        cat.eat();
        cat.sleep();
        System.out.println(cat.speak("play"));



    }

}
