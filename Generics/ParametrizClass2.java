package Generics;

public class ParametrizClass2 {
    public static void main(String[] args) {
        Pare<String,Integer> pare = new Pare<>("Hello", 1222);
        System.out.println(pare);
        System.out.println(pare.getValue1()+"\n"+pare.getValue2());

        SingleType<String> stringSingleType = new SingleType<>("Vasya", "Poka");
        System.out.println(stringSingleType);
        System.out.println(stringSingleType.getValue1()+stringSingleType.getValue2());

    }
}

class Pare<V1,V2>{
    private V1 value1;
    private V2 value2;

    public Pare (V1 value1, V2 value2){
        this.value1=value1;
        this.value2=value2;
    }
    public String toString(){
        return "{["+ value1+"]}  "+value2;
    }

    public V1 getValue1() {
        return value1;
    }

    public V2 getValue2() {
        return value2;
    }
}

class SingleType<V>{
    private V value1;
    private V value2;

    public SingleType (V value1, V value2){
        this.value1=value1;
        this.value2=value2;
    }
    public String toString(){
        return "{["+ value1+"]}  "+value2;
    }

    public V getValue1() {
        return value1;
    }

    public V getValue2() {
        return value2;
    }
}