package Generics;

public class ParametrizClass {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("Hello");
        System.out.println(info1);
        String s = info1.getValue();
        System.out.println(s);

        Info<Integer> info2 = new Info<>(127);
        System.out.println(info2);
        Integer i = info2.getValue();
        System.out.println(i);
    }

}

class Info<T>{
    private T value;
    public Info (T value){
        this.value=value;
    }
    public String toString(){
        return "{["+ value+"]}";
    }

    public T getValue() {
        return value;
    }
}