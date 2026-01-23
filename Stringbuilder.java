public class Stringbuilder {
    public static void main(String[] args) {
        
        // Creating a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // append() → adds text at the end of the string
        sb.append(" World");
        // Now sb = "Hello World"
        System.out.println(sb);

        // insert() → inserts text at a specific index
        sb.insert(5, ",");
        // Inserts "," at index 5
        // Now sb = "Hello, World"
        System.out.println(sb);

        // delete() → removes characters from start index to end index-1
        sb.delete(5, 6);
        // Deletes character from index 5 to 6 ("," is removed)
        // Now sb = "Hello World"
        System.out.println(sb);

        // setCharAt() → replaces a character at a specific index
        sb.setCharAt(6, 'w');
        // Replaces character at index 6 with 'w'
        // Now sb = "Hello world"
        System.out.println(sb);
          // reverse() → reverses the entire string
        sb.reverse();
        // Now sb = "dlrow olleH"
        System.out.println(sb);
        //StringBuffer is indeed thread-safe because it uses synchronization, meaning that if multiple threads try to access it at the same time, the operations happen one after another, ensuring data consistency. This means that when one thread is performing an operation, others must wait their turn, effectively making it sequential in a multi-threaded context.

       // StringBuilder, on the other hand, is not thread-safe. It doesn’t use synchronization, so if multiple threads access it at the same time, their operations can overlap, potentially causing data inconsistency. This makes it more parallel and faster in single-threaded scenarios.
    }
}
