package site_study_java.ru;

public class Mod
{
    public static void main(String args[])
    {
        int[] day = new int[] { 1, 2, 5 };
        int[] hour = new int[] { 1, 4, 23};

        System.out.println("vi igraete uzhe " + day[0] + " " + declension(day[0], "Days") + " u " + hour[0] + " " + declension(hour[0], "Hour"));
        System.out.println("vi igraete uzhe " + day[1] + " " + declension(day[1], "Days") + " u " + hour[1] + " " + declension(hour[1], "Hour"));
        System.out.println("vi igraete uzhe " + day[2] + " " + declension(day[2], "Days") + " u " + hour[2] + " " + declension(hour[2], "Hour"));
    }

    public static String declension(int count, String type)
    {
        String one = "";
        String two = "";
        String five = "";

        if(type.equals("Days"))
        {
            one = "den";
            two = "dnya";
            five = "dney";
        }
        else if(type.equals("Hour"))
        {
            one = "chas";
            two = "chasa";
            five = "chasov";
        }

//        if(count > 100)
//            count %= 100;

        if(count > 20)
            count %= 10;

        switch(count)
        {
            case 1:
                return one;
            case 2:
            case 3:
            case 4:
                return two;
            default:
                return five;
        }
    }
}