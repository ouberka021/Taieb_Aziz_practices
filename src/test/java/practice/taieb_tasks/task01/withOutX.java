package practice.taieb_tasks.task01;

public class withOutX {
    public static void main(String[] args) {
        System.out.println(without("xHx"));

    }

    public static String without(String str) {
        String last = str.substring(0, str.length() - 1);
        String first = str.substring(1);
        String result;
        if (str.startsWith("x") && str.endsWith("x") && str.length() >= 2) {
            result = str.substring(1, str.length() - 1);
        } else if (str.startsWith("x")) {
            result = first;
        } else if (str.endsWith("x")) {
            result = last;
        } else {
            result = str;
        }
        return result;
    }

}
