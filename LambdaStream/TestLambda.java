package LambdaStream;
import java.util.LinkedList;


public class TestLambda {
    int age;
    String name;
    public static void test(String str){
        System.out.println(str.charAt(0));
    }


    static void test1(String str){

        if (str.charAt(0) == 'А'){
            System.out.println("Долбаёб на букву А  "+str);
        } else {
            System.out.println("следующий долбаёб  "+str);
        }

    }
    public static void main(String[] args) {
        LinkedList<String> dolbaebs = new LinkedList<>();
        dolbaebs.add("Алексей Грузинов");
        dolbaebs.add("Сергей Прокопьев");
        dolbaebs.add("Илья Грузинов");
        dolbaebs.add("Вадим Палутов");
        dolbaebs.add("Аркадий Палутов");
        dolbaebs.add("Альбер Палутов");
        dolbaebs.add("Григорий Палутов");
        System.out.println(dolbaebs);
        System.out.println();
        System.out.println();
        dolbaebs.stream().sorted().forEach(System.out::println);
        System.out.println();
        System.out.println();
        dolbaebs.stream().sorted().forEach(x -> test(x));
        dolbaebs.stream().sorted().forEach(x->test1(x));


    }


}
