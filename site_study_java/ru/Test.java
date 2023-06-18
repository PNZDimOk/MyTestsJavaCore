package site_study_java.ru;

import java.io.UnsupportedEncodingException;

public class Test {
    public static void main(String[] args) {
        String str3 = "20150";
        byte[] b3 = str3.getBytes();
        System.out.println(b3);
        try {
            String s = new String(b3, "cp1251");
            System.out.println(s);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }


        System.out.println();
        String s1 = "True";
        String s2 = "yes";
        boolean bool1, bool2, boolean1, boolean2;
        bool1 = Boolean.parseBoolean(s1);
        bool2 = Boolean.parseBoolean(s2);
        System.out.println( bool1 );
        System.out.println( bool2 );

        boolean1 = Boolean.valueOf(s1);
        boolean2 = Boolean.valueOf(s2);
        System.out.println( boolean1 );
        System.out.println( boolean2 );


        System.out.println();
        System.out.println(2>3? "2>3" : "2 !> 3");


        System.out.println();
        switch (2*1){
            case 1:
                System.out.println(" 1");
                break;
            case 2:
                System.out.println(" 2");
                break;
            case 3:
                System.out.println(" 3");
                break;
            case 4:
                System.out.println(" 4");
                break;
            default:
                System.out.println("Nooooooooo!!!");
        }


        System.out.println();
        int[] myArray ={-10,-40,6,200,-40,12,37,42,37,90,42,90,37,90,87,90};
        int xMin =myArray[0];
        for (int i=1;i<myArray.length;i++){
            if (xMin>myArray[i]){
                xMin=myArray[i];
            }
        }
        System.out.println("naimenshee v massive "+xMin);


        System.out.println();
        int xCount=1;
        int tempCount=myArray[0];
        for (int i=1;i<myArray.length;i++){
            if(tempCount<=myArray[i]){
                if (tempCount==myArray[i]){
                    xCount++;
                }
                else{
                    xCount=1;
                    tempCount=myArray[i];
                }
            }
        }
        System.out.println("Maximaln chislo="+tempCount+"\n"+"Kol-vo="+xCount);


        System.out.println();
        int month=11;
        switch (month){
            case 12,1,2:
                System.out.println("winter");
                break;
            case 3,4,5:
                System.out.println("spring");
                break;
            case 6,7,8:
                System.out.println("summer");
                break;
            case 9,10,11:
                System.out.println("autumn");
                break;
            default:
                System.err.println("ERROR");
        }



    }
}
