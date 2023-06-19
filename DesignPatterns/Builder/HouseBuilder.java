package DesignPatterns.Builder;

public abstract class HouseBuilder {
    House house;
    void createHouse(){
        house = new House();
    }
    abstract void buildType();
    abstract void buildPrice();
    abstract void buildConstructionTeam();

    House getHouse(){
        return house;
    }
}
