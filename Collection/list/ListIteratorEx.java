package Collection.list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {
    public static void main(String[] args) {
        String s = "Dmitrii";
        List<Character> list = new LinkedList<>();
        for (char ch: s.toCharArray()){
            list.add(ch);
        }

        System.out.println(list);

        ListIterator<Character> stIterator = list.listIterator();
        ListIterator<Character> reIterator = list.listIterator(list.size());

        boolean isPalindrome = true;

        while (stIterator.hasNext()&&reIterator.hasPrevious()){
            if(stIterator.next()!=reIterator.previous()){
                isPalindrome=false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palinfrome");
        }
    }
}
