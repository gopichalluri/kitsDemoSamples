package generic;
import java.util.ArrayList;
import java.util.List;

public class ThrowAndThrowsExample {
public static void main(String[] args) {
List<Integer> numbers = new ArrayList<>();
numbers.add(10);
numbers.add(20);
numbers.add(0); // Adding a zero to demonstrate division by zero.

try {
// Check for null list
validateList(numbers);

// Access an element (this might throw IndexOutOfBoundsException)
int element = getElement(numbers, 5);
System.out.println("Accessed element: " + element);

// Process each number in the list
for (Integer number : numbers) {
System.out.println("Processing number: " + number);
int result = divide(100, number); // This might throw ArithmeticException
System.out.println("Result of division: " + result);
}
} catch (NullPointerException e) {
System.err.println("Error: The list is null. " + e.getMessage());
} catch (IndexOutOfBoundsException e) {
System.err.println("Error: Invalid index access. " + e.getMessage());
} catch (ArithmeticException e) {
System.err.println("Error: Division by zero. " + e.getMessage());
} finally {
System.out.println("Finished processing the list.");
}
}

// Method to validate if the list is null
public static void validateList(List<Integer> numbers) throws NullPointerException {
if (numbers == null) {
throw new NullPointerException("The list is null.");
}
}

// Method to get an element from the list
public static int getElement(List<Integer> numbers, int index) throws IndexOutOfBoundsException {
if (index >= numbers.size() || index < 0) {
throw new IndexOutOfBoundsException("Index " + index + " is out of bounds.");
}
return numbers.get(index);
}

// Method to divide two numbers
public static int divide(int a, int b) throws ArithmeticException {
if (b == 0) {
throw new ArithmeticException("Cannot divide by zero.");
}
return a / b;
}
}
