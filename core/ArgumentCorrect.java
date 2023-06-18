package core;

public class ArgumentCorrect {
    static boolean isArgumentsForSubstrCorrect(String str, int index, int length){
        System.out.println("------------НОВЫЙ-----------------");
        System.out.println(length<0);
        System.out.println(index<0);
        System.out.println(index>(str.length()-1));
        System.out.println((index+length)>(str.length()-1));
        System.out.println(length>str.length()-1);

        if (0 > length){
            return false;
        } else if(index<0){
            return false;
        }else if (index>(str.length()-1)){
            return false;
        }else if ((index+length)>(str.length()-1)){
            return false;
        }else if (length>str.length()-1){
            return false;
        } else return true;
    }





    public static void main(String[] args) {
        String str ="Sansa Stark";

        System.out.println(isArgumentsForSubstrCorrect(str, -1, 3));
        System.out.println(isArgumentsForSubstrCorrect(str, 4, 100));
        System.out.println(isArgumentsForSubstrCorrect(str, 10, 10));
        System.out.println(isArgumentsForSubstrCorrect(str, 11, 1));
        System.out.println(isArgumentsForSubstrCorrect(str, 3, 3));

















    }



}
