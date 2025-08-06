package Day7Homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StudentNameList_7_4 {
    public static void main(String[] args) {
        HashMap<String, Integer> studentList = new HashMap<>();
        studentList.put("Hayden", 77);
        studentList.put("Rina" , 57);
        studentList.put("Axel petty" , 95);
        studentList.put("Royal" , 100);
        studentList.put("Mary" , 78);
        studentList.put("James" , 88);

        Iterator<Map.Entry<String, Integer>> it = studentList.entrySet().iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }


        studentList.remove("Rina");

        System.out.println("The student list is: " + studentList.size());
    }
}
