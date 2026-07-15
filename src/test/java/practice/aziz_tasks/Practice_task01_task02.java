package practice.aziz_tasks;

public class Practice_task01_task02 {

    public static void main(String[] args) {

        System.out.println(withoutX("x"));

        System.out.println(without2(""));

    }


    public static String withoutX(String str) {

        if (str.startsWith("x") && str.endsWith("x") && str.length() > 1) {
            return str.substring(1, str.length() - 1);

        } else if (str.startsWith("x")) {
            return str.substring(1);

        } else if (str.endsWith("x")) {
            return str.substring(0, str.length() - 1);

        } else {
            return str;

        }
    }


    public static String without2(String str2) {

        if (str2.length() == 0) {
            return str2;

        } else if (str2.length() == 1) {
            return str2;

        } else if (str2.substring(0, 2).equals(str2.substring(str2.length() - 2))) {
            return str2.substring(2);

        } else {
            return str2;
        }

    }

}
