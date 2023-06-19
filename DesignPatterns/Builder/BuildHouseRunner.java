package DesignPatterns.Builder;

public class BuildHouseRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new VillaHouseBuilder());
        House house = director.houseBuilder();
        System.out.println(house);
    }
}
