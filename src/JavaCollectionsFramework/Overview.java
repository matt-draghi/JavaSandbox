package JavaCollectionsFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class Overview {
    /*
    The Java Collections Framework is a hierarchy of interface types and classes for collecting objects - each interface
    type is implemented by one or more classes

    Collection <<interface>> (Groups together elements and allows them to be retrieved later )
        -List <<interface>> (A collection that remembers the order of its elements)
            -ArrayList
            -Stack (Remembers the order of its elements, but it does not allow you to insert elements in every position - you can add and remove elements only at the top)
            -LinkedList
        -Queue <<interface>> (You add items to one end (the tail) and remove them from the other end (the head) - first in first out structure)
            -LinkedList
            -PriorityQueue
        -Set <<interface>> (An unordered collection of unique elements - because a set does not track the order of the elements, it can arrange them in a way that speeds up the operations of finding, adding, and removing elements)
            -HashSet
            -TreeSet

    Map <<interface>> (Manages associations between keys and values - every key in the map has an associated value; stores the keys, values, and the associations between them)
        -HashMap
        -TreeMap
     */
    public static void main() {
        Collection<String> coll = new ArrayList<String>(); //The ArrayList class implements the Collection interface

        coll = new TreeSet<String>(); //The TreeSet class also implements the Collection interface

        int n = coll.size(); //Gets the size of the collection (currently at 0)

        coll.add("Harry");
        coll.add("Sally"); //Adds elements to the collection

        String s = coll.toString(); //Returns a string with all the elements in the collection. s is now "[Harry, Sally]"

        System.out.println(coll); //Invokes the toString method and prints [Harry, Sally]

        coll.remove("Harry"); //Removes an element from the collection, returning false if the element is not present
        boolean b = coll.remove("Tom"); //b is false

        b = coll.contains("Sally"); //Checks whether this collection contains a given element. b is not true

        for(String w : coll){ //You can use the "for each" loop with any collection.
            System.out.println(w);  //This loop prints the element on separate lines
        }

        Iterator<String> iter = coll.iterator(); //You can use an iterator for visiting the elements in the collection
        System.out.println(iter);
    }

}
