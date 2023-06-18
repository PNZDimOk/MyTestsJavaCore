package site_study_java.ru;

public class BubbleSort {
    public static void main(String[] args) {
        int[] myArray={6,3,4,45,8,9,12,-2,45,4,97};
        System.out.println("Ishodnii massiv");
        for (int j : myArray) {
            System.out.print("[" + j + "]");
        }
        System.out.println();

        for (int i = myArray.length-1; i >0; i--) {
            for (int j = 0; j < i; j++) {
                if (myArray[j]>myArray[j+1]){
                    int temp = myArray[j+1];
                    myArray[j+1]=myArray[j];
                    myArray[j]=temp;
                }
            }
        }
        System.out.println("sort massiv");
        for (int j : myArray) {
            System.out.print("[" + j + "]");
        }


    }
}
