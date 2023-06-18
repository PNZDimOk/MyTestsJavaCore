package site_study_java.ru;

public class TestWhile {
    public static void main(String[] args) {

        int[] arrayInt={5,2,1,-40,23,76,4,52,8};
        int x=1;
        int count = 0;
        while (count<arrayInt.length){
            System.out.println("["+count+"] :"+arrayInt[count]);
            if (x==arrayInt[count]){
                System.out.println(x+" v massive pod indexom "+count);
                break;
            }
            count++;
            if (count==arrayInt.length) {
                System.out.println("net chisla " +x+ " v massive");
            }
        }
        System.out.println();


        String text = "kakoito text";
        char find ='k';
        int chetchik =0;
        int i=0;
        while (chetchik<2&&i<text.length()){
            if (text.charAt(i)==find){
                chetchik++;
                System.out.println("bukva "+find+" vstrechaetsya "+chetchik+" raz");
            }
            i++;
        }




    }
}
