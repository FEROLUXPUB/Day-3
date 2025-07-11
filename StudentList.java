package List;

import java.util.*;

public class StudentLIst {
    public static void main(String[] args){
        ArrayList<String> students = new ArrayList<>();
        students.add("Undertaker");
        students.add("Batista");
        students.add("Triple-H");
        students.add("Undertaker");
        students.add("Ramesh Studio");
        students.add("Kane");
        students.add("John cena");
        students.add("Batista");

        System.out.println("Original list(with duplicates): "+ students);

        Set<String> uniqueStudents = new LinkedHashSet<>(students);

        List<String> sortedList = new ArrayList<>(uniqueStudents);
        Collections.sort(sortedList);

        System.out.println("Final sorted List(no Duplicates): " +sortedList);
    }
}
