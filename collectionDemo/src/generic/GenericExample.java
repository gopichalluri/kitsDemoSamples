package generic;
import java.util.ArrayList;
import java.util.List;

public class GenericExample {
public static void main(String[] args) {
// Create a list of integers
List<Integer> numbers = new ArrayList<>();
numbers.add(10);
numbers.add(20);
numbers.add(0); // Adding a zero to demonstrate division by zero.

// Create a generic processor
GenericProcessor<Integer> processor = new GenericProcessor<>();

try {
// Validate the list
processor.validateList(numbers);

// Access an element (demonstrates IndexOutOfBoundsException)
int element = processor.getElement(numbers, 5);
System.out.println("Accessed element: " + element);

// Process each number in the list
for (Integer number : numbers) {
System.out.println("Processing number: " + number);
int result = processor.divide(100, number); // Demonstrates ArithmeticException
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
}

// Generic class for processing lists
class GenericProcessor<T> {

// Method to validate if the list is null
public void validateList(List<T> list) throws NullPointerException {
if (list == null) {
throw new NullPointerException("The list is null.");
}
}

// Method to get an element from the list
public T getElement(List<T> list, int index) throws IndexOutOfBoundsException {
if (index >= list.size() || index < 0) {
throw new IndexOutOfBoundsException("Index " + index + " is out of bounds.");
}
return list.get(index);
}

// Method to divide two numbers (requires Integer type for division)
public int divide(int a, T b) throws ArithmeticException {
if (!(b instanceof Integer)) {
throw new IllegalArgumentException("Unsupported type for division.");
}
int divisor = (Integer) b;
if (divisor == 0) {
throw new ArithmeticException("Cannot divide by zero.");
}
return a / divisor;
}
}

