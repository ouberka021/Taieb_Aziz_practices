package practice.taieb_tasks.task01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class removeChar {
    public static void main(String[] args) {

           /*
           ameFirstAndLast Task: Create a class called SameFirstAndLast and write a program with the following specifications:
           11.1 Given an ArrayList of strings, remove elements if the first and last characters of the string are the same.
			Example:
				list = {"Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"}
			output:
				["Canada", "Lan", "Ebrahim", "Farida"]
			Example:
			*/
        ArrayList<String> list = new ArrayList<>
                (Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));
       // Solution using lambda expression
       list.removeIf(p -> p.substring(0,1).equalsIgnoreCase(p.substring(p.length()-1)));
        System.out.println(list);
        ArrayList<String> newList = new ArrayList<>();

        // Solution Using For loop with remove method
        for (int i = 0; i < list.size(); i++) {
           String str = list.get(i);
            if(str.substring(0, 1).equalsIgnoreCase(str.substring(str.length() - 1))){
                list.remove(i);
            }
        }
        // Solution Using For each with add element to new List
        for (String p : list) {
            if (!(p.substring(0, 1).equalsIgnoreCase(p.substring(p.length() - 1)))){
                newList.add(p);
            }
        }
        System.out.println(list);


    }
}
