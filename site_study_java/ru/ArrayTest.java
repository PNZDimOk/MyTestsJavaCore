package site_study_java.ru;

public class ArrayTest {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        int ind =0;
        int temp =0;
        while (ind<myArray.length){
            if (temp%2==0&&temp!=0){
                myArray[ind]=temp;
                ind++;
            }
            temp++;
        }
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        System.out.println();
        System.out.println("srednee arif");
        int sum = 0;
        int[] myArray1 ={45,-23,3,11,29,-14,0,100};
        for (int i = 0; i < myArray1.length; i++) {
            sum+=myArray1[i];
        }
        System.out.println(sum/myArray1.length);

        System.out.println("do perestanovka min u max");
        for (int i = 0; i < myArray1.length; i++) {
            System.out.print("["+myArray1[i]+"]");
        }
        System.out.println();
        int tempMin=myArray1[0];
        int tempMax=myArray1[0];
        int temp1;
        int indexMin=0;
        int indexMax=0;
        for (int i = 0; i < myArray1.length; i++) {
            if (tempMin>myArray1[i]){
                tempMin=myArray1[i];
                indexMin=i;
            }
            if (tempMax<myArray1[i]){
                tempMax=myArray1[i];
                indexMax=i;
            }
        }
        temp1=myArray1[indexMin];
        myArray1[indexMin]=myArray1[indexMax];
        myArray1[indexMax]=temp1;

        System.out.println("posle perestanovka min u max");
        for (int i = 0; i < myArray1.length; i++) {
            System.out.print("["+myArray1[i]+"]");
        }
    }






}


