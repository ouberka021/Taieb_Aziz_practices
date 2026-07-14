package practice.taieb_tasks.task01;

public class withOutX {
    public static void main(String[] args) {
        System.out.println(without("xHxix") );

    }
    public static String without(String str) {
        String first = str.substring(0,1);
        String last = str.substring(str.length()-1);
        String result=str;

            if (first.equals("x")){
               result = str.replace(first,"");
            }

        if (last.equals("x")){
            result = str.replace(last,"");
        }


        return result;
    }

}
