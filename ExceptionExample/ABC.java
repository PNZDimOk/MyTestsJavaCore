package ExceptionExample;

public class ABC {
    public void throwException1(int x) throws Exception {
        if(x<10){
            throw new Exception("Zdarova vvednoe chislo<10");
        }
    }
}
