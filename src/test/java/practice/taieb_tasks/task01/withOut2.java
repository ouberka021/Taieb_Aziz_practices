package practice.taieb_tasks.task01;

public class withOut2 {
    public static void main(String[] args) {
        System.out.println(without2("HelloHe"));
    }
    public static String without2(String str) {
        String firstTwo = str.substring(0,2);
        String lastTwo = str.substring(str.length()-2);
        String result;
        if (firstTwo.equals(lastTwo)){
            result = str.substring(2);
        }else {
            result = str;
        }

return result;
    }
}
