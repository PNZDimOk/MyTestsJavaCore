package nested_class.local_inner_class;

public class LocalInner {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult();
    }

}

class Math{
    public void getResult(){
        class Delenie{
            private int delimoe;
            private int delitel;

            public int getDelimoe() {
                return delimoe;
            }

            public void setDelimoe(int delimoe) {
                this.delimoe = delimoe;
            }

            public int getDelitel() {
                return delitel;
            }

            public void setDelitel(int delitel) {
                this.delitel = delitel;
            }
            public int getChastnoe(){
                return delimoe/delitel;
            }
            public int getOstatok(){
                return delimoe%delitel;
            }
        }
        Delenie delenie = new Delenie();
        delenie.setDelimoe(21);
        delenie.setDelitel(4);
        System.out.println(delenie.getDelimoe()+"/"+delenie.getDelitel()
        +"="+delenie.getChastnoe()+"  i ostatok ot deleniya:"+delenie.getOstatok());
    }
}
