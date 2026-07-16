package practice.taieb_tasks.task01;

public class withOut2 {
    public static void main(String[] args) {
        System.out.println(without2("x"));
    }
    public static String without2(String str) {

        String result="";
        if (str.length() > 1){
        if (str.substring(0,2).equals(str.substring(str.length()-2))){
            result = str.substring(2);
        }else{
            result = str;
        }}else {
            result = str;
        }

return result;
    }
}
