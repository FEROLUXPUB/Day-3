package ForEach_Iterator;


import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        // Step 1: Initialize the list
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Eve");
        names.add("Oscar");
        names.add("Uma");
        names.add("Charlie");
        names.add("Igor");

        System.out.println("Original list: " + names);

        // Step 2: Use Iterator to remove names starting with vowels
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            char firstChar = Character.toLowerCase(name.charAt(0));
            if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' ||
                    firstChar == 'o' || firstChar == 'u') {
                iterator.remove();  // Safe removal during iteration
            }
        }

        // Step 3: Print the modified list
        System.out.println("List after removing names starting with a vowel: " + names);
    }
}
