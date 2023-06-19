package DesignPatterns.Builder;

public class House {
    private TypeHouse typeHouse;
    private int price;
    private int constructionTeam;

    public TypeHouse getTypeHouse() {
        return typeHouse;
    }

    public void setTypeHouse(TypeHouse typeHouse) {
        this.typeHouse = typeHouse;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getConstructionTeam() {
        return constructionTeam;
    }

    public void setConstructionTeam(int constructionTeam) {
        this.constructionTeam = constructionTeam;
    }

    @Override
    public String toString() {
        return "House{" +
                "typeHouse=" + typeHouse +
                ", price=" + price +
                ", constructionTeam=" + constructionTeam +
                '}';
    }
}
