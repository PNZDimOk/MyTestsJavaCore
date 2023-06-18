package list;

import java.util.LinkedList;

public class MyArrayList {
    private String[] array = new String[10];
    private int size = 0;

    public void add (String s) {

        this.array[this.size] = s;
        this.size++;
        if (this.size == this.array.length) {
            String[] newArray = new String[this.array.length * 2];
            System.arraycopy(this.array, 0, newArray, 0, this.array.length);
            this.array=newArray;
        }
    }

    public void remove (int index){
        if (index >= 0 && index <= this.size) {
            if (this.size - 1 - index >= 0) System.arraycopy(array, index + 1, array, index, this.size - 1 - index);
            this.size--;
        }
    }

    public void remove (String s){
        int index = -1;
        for (int i =0; i<size; i++){
            if (array[i].equals(s)){
                index = i;
                break;
            }

        }
        remove(index);
    }


    public int getSize(){
        return size;
    }

    public String get(int index){
        if (index >= 0 && index <= size) {
            return array[index];
        }
        return "За пределами массива";
    }

    public static void main(String[] args) {
        MyArrayList students = new MyArrayList();
        students.add("Егор");
        for (int i =1; i< 100; i++){
            students.add("Студент  "+i);
        }
        students.remove("Студент  "+4);

        for (int i = 0; i<students.getSize(); i++){
            System.out.println(students.get(i));
        }

    }
}
