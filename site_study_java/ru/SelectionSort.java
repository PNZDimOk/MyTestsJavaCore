package site_study_java.ru;

public class SelectionSort {
    public static void main(String[] args) {
        int[] myArray={6,3,4,8,9,12,-2,45,4,97};
        System.out.println("Ishodnii massiv");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("["+myArray[i]+"]");
        }
        System.out.println();


        for (int i = 0; i < myArray.length; i++) {
            int min=myArray[i];
            int minIndex=i;
            for (int j = i+1; j < myArray.length; j++) {
                if (min>myArray[j]){
                    min=myArray[j];
                    minIndex=j;
                }
            }
            if (minIndex!=i){
                int temp = myArray[minIndex];
                myArray[minIndex]=myArray[i];
                myArray[i]=temp;
            }
        }
        System.out.println("Sort massiv");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("["+myArray[i]+"]");
        }

    }
}
