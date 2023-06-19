package DesignPatterns.Builder;

public class SkyscraperHouseBuilder extends HouseBuilder{
    @Override
    void buildType() {
        house.setTypeHouse(TypeHouse.SKYSCRAPER);
    }

    @Override
    void buildPrice() {
        house.setPrice(1800);
    }

    @Override
    void buildConstructionTeam() {
        house.setConstructionTeam(70);
    }
}
