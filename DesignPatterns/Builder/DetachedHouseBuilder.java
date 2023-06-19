package DesignPatterns.Builder;

public class DetachedHouseBuilder extends HouseBuilder{
    @Override
    void buildType() {
        house.setTypeHouse(TypeHouse.DETACHED);
    }

    @Override
    void buildPrice() {
        house.setPrice(700);
    }

    @Override
    void buildConstructionTeam() {
        house.setConstructionTeam(24);
    }
}
