package practice.taieb_tasks.task01;

import java.util.ArrayList;
import java.util.Arrays;

public class withOut2 {
    public static void main(String[] args) {
        System.out.println(without2("x"));
    }
    public static String without2(String str) {

        ArrayList<String> list = new ArrayList<>
                (Arrays.asList("Ahmed", "Amana","Rar"));







        String result;
        if (str.substring(0,2).equals(str.substring(str.length()-2)) && str.length() > 1  ){
            result = str.substring(2);
        }else{
            result = str;
        }

return result;
    }
}
