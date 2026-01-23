
public class Stringbufferr {
    public static void main(String[] args) {
          // Creating a StringBuffer object
        StringBuffer sbb = new StringBuffer("Hello");

        // append() → adds text at the end of the current string
        sbb.append(" World");
        System.out.println(sbb); // Output: Hello World

        // insert() → inserts text at a specified index
        sbb.insert(5, ",");
        System.out.println(sbb); // Output: Hello, World

        // delete() → removes characters from start index to end index-1
        sbb.delete(5, 6);
        System.out.println(sbb); // Output: Hello World

        // reverse() → reverses the entire string
        sbb.reverse();
        System.out.println(sbb); // Output: dlroW olleH

        // length() → returns the length of the current string
        System.out.println("Length: " + sbb.length()); // Output: 11
    }
}
