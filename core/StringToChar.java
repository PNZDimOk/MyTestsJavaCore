package core;

public class StringToChar {
    static int countChars(String str, char simv){
        int result = 0;
        int i = 0;
        while ( i < str.length() )
            if (str.charAt(i)==simv){
                result++;
            }
        return result;
    }

    public static void main(String[] args) {
        String str = "If I look back I am lost";

        System.out.println(countChars(str, 'I'));
        System.out.println(countChars(str, 'z'));
        System.out.println(countChars(str, 'o'));

    }
}
