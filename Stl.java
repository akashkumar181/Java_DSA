import java.util.*;
public class Stl {
    public static void main(String[] args) {
        //it is standard template library
        //STL is a collection of pre built classes and function that make it easy to mangange data using comman data structure
        //like vector or map ete...
        //it saves time and efforts by proving ready to use efficent algorithm and container
        //---Containers:-it is data structure used to store objects and data 
        //vector,Dequeue,List ,Array,Vector (Sqeunce container)
        //Stack,queue,Priority Queue(Container Adaptors)
        //Set ,Multiset,Map (Associative Conatainer)
        //Unorder set,UnorderMap ,Underorder multiSet and Unordered multiunorderdmap
        //A vector represents dyanmic size array that automatically grows beyond current capacity
        //vector in java are thread safe and arraylist is not but both has same functionality
         Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<>();

        // input
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            v.add(sc.nextInt());     // add(element)
        }

        // add(index, element)
        v.add(0, 50);   // insert 50 at index 0

        // set(index, element)
        if (v.size() > 4) {
            v.set(4, 95);   // replace element at index 4
        }

        // get(index)
        System.out.println("Element at index 2: " + v.get(2));

        // remove(index)
        v.remove(1);   // removes element at index 1

        // remove(object)
        v.remove(Integer.valueOf(95)); // removes element 95 if present

        // size()
        System.out.println("Size of Vector: " + v.size());

        // isEmpty()
        System.out.println("Is Vector empty? " + v.isEmpty());

        // contains()
        System.out.println("Contains 50? " + v.contains(50));

        // indexOf()
        System.out.println("Index of 50: " + v.indexOf(50));

        // lastIndexOf()
        v.add(50);
        System.out.println("Last index of 50: " + v.lastIndexOf(50));

        // iterator()
        System.out.println("Using Iterator:");
        Iterator<Integer> it = v.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // toArray()
        Object[] arr = v.toArray();
        System.out.println("Using toArray:");
        for (Object o : arr) {
            System.out.print(o + " ");
        }
        System.out.println();

        // display using get()
        System.out.println("Elements using get():");
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }

        // clear()
        // v.clear();
        // System.out.println("After clear(): " + v);

    }
}
