package nested_class.anonymous_class;

public class AnonymousClass {
    public static void main(String[] args) {
        Math m = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a+b;
            }
        };
        int x=m.doOperation(7,2);
        System.out.println(x);
        Math m2 = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a*b;
            }
        };
        System.out.println(m2.doOperation(7,2));
    }
}

interface Math{
    int doOperation(int a, int b);
}