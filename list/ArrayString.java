package list;

public class ArrayString {
    public static void main(String[] args) {
        String [] students =  {
                "Игорь",
                "Ирина",
                "Олег",
                "Ольга",
                "Дмитрий",
                "Дарья"
        };


        //добавление элемента
        String [] copyStudents_with_Yulia = new String[students.length];
        for (int i = 0; i<students.length; i++){
            copyStudents_with_Yulia[i]=students[i];
        }
        copyStudents_with_Yulia[copyStudents_with_Yulia.length-1]="Юля";
        copyStudents_with_Yulia[2] = null;

        //удаление элемента в массиве
        String [] students_del = new String[copyStudents_with_Yulia.length-1];
        for (int k = 0, j = 0; k < copyStudents_with_Yulia.length; k++){
            if (copyStudents_with_Yulia[k] != null){
                students_del[j]=copyStudents_with_Yulia[k];
                j++;
            }
        }


        students = students_del;
        for (String name : students) {
            System.out.println(name);
        }
    }

}
