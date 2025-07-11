package collection;
import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("BLUE");
        stringList.add("GREEN");
        stringList.add("YELLOW");
        stringList.add("PURPLE");
        stringList.add("CYAN");
        stringList.add("WHITE");
        stringList.add("BLACK");
        stringList.add("RED");
        stringList.add("GREEN");
        stringList.add("YELLOW");
        stringList.add("PURPLE");
        stringList.add("CYAN");

        Set<String> stringSet = new HashSet<>(stringList);

        System.out.println("Original List (Duplicates):"+stringList);
        System.out.println("Converted Set (Duplicates Removed):"+stringSet);
    }
}
