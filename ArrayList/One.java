import java.util.ArrayList;

public class One {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> names = new ArrayList<>();

        // Add elements to the ArrayList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Access elements by index
        System.out.println("First name: " + names.get(0));

        // Remove an element
        names.remove(1); // Removes "Bob"

        // Iterate over the ArrayList
        System.out.println("Remaining names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
