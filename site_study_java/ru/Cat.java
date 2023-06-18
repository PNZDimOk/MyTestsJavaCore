package site_study_java.ru;

public class Cat {
    private int weight;
    private String name;
    private String color;

    public void eat(){
        System.out.println("Eating...");
    }

    public void sleep(){
        System.out.println("Sleeping zz-z-z");
    }

    public String speak(String words){
        return words+"...mauu...";
    }

    public Cat() {
    }

    public Cat(int weight, String name, String color) {
        this.weight = weight;
        this.name = name;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
