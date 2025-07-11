package SetOperation;

import java.util.*;

public class SetCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read Set A
        System.out.println("Enter elements of Set A (space-separated integers):");
        Set<Integer> setA = new HashSet<>();
        for (int n : readSet(scanner)) {
            setA.add(n);
        }

        // Read Set B
        System.out.println("Enter elements of Set B (space-separated integers):");
        Set<Integer> setB = new HashSet<>();
        for (int n : readSet(scanner)) {
            setB.add(n);
        }

        // Union
        Set<Integer> union = new HashSet<>(setA);
        union.addAll(setB);

        // Intersection
        Set<Integer> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);

        // Difference (A - B)
        Set<Integer> difference = new HashSet<>(setA);
        difference.removeAll(setB);

        // Print results
        System.out.println("Set A: " + setA);
        System.out.println("Set B: " + setB);
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
        System.out.println("Difference (A - B): " + difference);
    }

    // Helper method to read a line of integers into a set
    private static List<Integer> readSet(Scanner scanner) {
        String[] tokens = scanner.nextLine().split(" ");
        List<Integer> list = new ArrayList<>();
        for (String token : tokens) {
            if (!token.isEmpty()) {
                list.add(Integer.parseInt(token));
            }
        }
        return list;
    }
}

