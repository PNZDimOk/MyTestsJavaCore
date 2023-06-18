package core;

public class InString {

    public static boolean startsWith(String text, String substr) {
        // BEGIN (write your solution here)
        for (int i=0; i<text.length()-1; i++){
            if(text.charAt(i)==substr.charAt(0)){
                int index =0;
                int k =i;
                while (substr.charAt(index)==text.charAt(k)){
                    if(index<substr.length()-1){index++;}
                    if(k<text.length()-1) {k++;}
                    if (index==(substr.length()-1)){
                        return true;
                    }
                }
            }
        } return false;
    }
    // END


    public static void main(String[] args) {
        System.out.println(startsWith("one", "o"));
        System.out.println(startsWith("one", "ne"));
        System.out.println(startsWith("one", "on"));
        System.out.println(startsWith("one", "one"));
        System.out.println(startsWith("one", "x"));
        System.out.println(startsWith("one", "en"));

    }
}
