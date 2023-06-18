package site_study_java.ru;

import java.util.Arrays;
import java.util.Collections;

public class TestSort {
    public static void main(String[] args) {
        Integer[] myArray=new Integer[20];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i]=(int)(Math.random()*100);
        }
        System.out.println("Ishodnii massiv");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("["+myArray[i]+"]");
        }
        System.out.println();
        Arrays.sort(myArray, Collections.reverseOrder());
        System.out.println("Sort massiv");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("["+myArray[i]+"]");
        }
    }
}
