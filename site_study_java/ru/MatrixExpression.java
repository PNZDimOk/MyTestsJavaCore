package site_study_java.ru;

import java.util.Arrays;

public class MatrixExpression {
    public static void main(String[] args) {
        int[][] array1 ={{1,2,3},{1,2,3},{3,2,1}};
        int[][] array2 ={{5,6,7},{5,6,7},{7,6,5}};
        int[][] answer =new int[3][3];
        int[][] answerMult = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               answer[i][j]=array1[i][j]+array2[i][j];
            }
        }

        System.out.println("1 matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array1[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("2 matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array2[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("1 matrrix + 2 matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(answer[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
