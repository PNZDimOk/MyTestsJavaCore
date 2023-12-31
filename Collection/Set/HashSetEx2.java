package Collection.Set;

import java.util.HashSet;

public class HashSetEx2 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(5);
        hashSet1.add(7);
        hashSet1.add(2);
        hashSet1.add(3);
        hashSet1.add(10);
        System.out.println("hashset1 "+hashSet1);

        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(1);
        hashSet2.add(4);
        hashSet2.add(10);
        hashSet2.add(9);
        hashSet2.add(7);
        System.out.println("hashset2 "+hashSet2);

        HashSet<Integer> union = new HashSet<>(hashSet1);
        union.addAll(hashSet2);
        System.out.println("union    "+union);

        HashSet<Integer> intersect = new HashSet<>(hashSet1);
        intersect.retainAll(hashSet2);
        System.out.println("intersect"+intersect);

        HashSet<Integer> subtract = new HashSet<>(hashSet1);
        subtract.removeAll(hashSet2);
        System.out.println("subtract"+subtract);
    }
}
