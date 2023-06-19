package DesignPatterns.Builder;

public class Director {
    HouseBuilder builder;

    public void setBuilder(HouseBuilder builder) {
        this.builder = builder;
    }

    House houseBuilder(){
        builder.createHouse();
        builder.buildType();
        builder.buildPrice();
        builder.buildConstructionTeam();
        return builder.getHouse();
    }
}
