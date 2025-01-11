package generic;
import java.util.ArrayList;
import java.util.List;

public class ExceptionHandlingExample {
public static void main(String[] args) {
List<Integer> numbers = null;

try {
// Initialize the list
numbers = new ArrayList<>();
numbers.add(10);
numbers.add(20);
numbers.add(0); // Adding a zero to demonstrate division by zero.

// Access an element that doesn't exist
System.out.println("Accessing element at index 5: " + numbers.get(5));

// Process each number in the list
for (Integer number : numbers) {
System.out.println("Processing number: " + number);

// Simulate division
int result = 100 / number;
System.out.println("Result of division: " + result);
}

} catch (IndexOutOfBoundsException e) {
System.err.println("Error: Attempted to access an invalid index. " + e.getMessage());
} catch (ArithmeticException e) {
System.err.println("Error: Division by zero occurred. " + e.getMessage());
} catch (NullPointerException e) {
System.err.println("Error: The list is null. " + e.getMessage());
} finally {
System.out.println("Finished processing the list.");
}
}
}
