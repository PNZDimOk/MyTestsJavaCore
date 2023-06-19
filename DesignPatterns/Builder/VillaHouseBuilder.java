package DesignPatterns.Builder;

public class VillaHouseBuilder extends HouseBuilder{
    @Override
    void buildType() {
        house.setTypeHouse(TypeHouse.VILLA);
    }

    @Override
    void buildPrice() {
        house.setPrice(300);
    }

    @Override
    void buildConstructionTeam() {
        house.setConstructionTeam(8);
    }
}
