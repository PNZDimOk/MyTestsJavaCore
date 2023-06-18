package site_study_java.ru;

public class MatrixArray {
    public static void main(String[] args) {
        int[][] myArray=new int[2][3];
        myArray[0][0]=-2;
        myArray[0][1]=4;
        myArray[0][2]=8;
        myArray[1][0]=5;
        myArray[1][1]=-4;
        myArray[1][2]=7;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+myArray[i][j]+"]");
            }
            System.out.println();
        }
        System.out.println();

        int[][] myArray1={{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+myArray1[i][j]+"]");
            }
            System.out.println();
        }

    }
}
