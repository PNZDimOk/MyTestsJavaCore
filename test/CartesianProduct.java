package test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class CartesianProduct{
    public static void main(String[] args) {
        List<String> arg0 = asList("1", "2", "3");
        List<String> arg1 = asList("A","B","C");
        for (List<String>elem:mul(arg0,arg1)){
            System.out.println(elem);
        }
    }
    public static <T> List<List<T>> mul(List<T> arg0, List<T> arg1){
        List<List<T>> result = new ArrayList<>();
        for (T elFrom1list : arg0){
            for (T elFrom2list : arg1 ){
                result.add(asList(elFrom1list,elFrom2list));
            }
        }
        return result;
    }
}


