package JavaCollectionsFramework;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedLists {
    public static void main() {
        /*
        When using arrays, removing/adding elements in the middle requires all elements that follow to be moved which can take up a lot of processing time

        A linked list structure avoids this - it consists of a number of nodes, each of which has a reference to the next node
        A node is an object that stores an element and references to the neighboring nodes in the sequence

        When you insert/remove a node in a linked list, only the neighboring node references need to be updated

        Linked Lists allow speedy insertion and removal, but element access can be slow
        - Adding and removing elements at a given location in a linked list is efficient
        - Visiting the elements of a linked list in sequential order is efficient, but random access is not

        ****You use linked lists when you are concerned about the efficiency of inserting or removing elements and you rarely need element access in random order******

        If you mostly visit all elements in a sequence (ex. display or print the elements), the inefficiency of random access is not a problem
         */


        LinkedList<String> list = new LinkedList<>(); //An empty list

        list.addLast("Harry"); //Adds an element to the end of the list. Same as add()
        list.addFirst("Sally"); //Adds an element to the beginning of the list. The list is now [Sally, Harry]

        list.getFirst(); //Gets the element stored at the beginning of the list; here "Sally"
        list.getLast(); //Gets the element stored at the end of the list; here "Harry"

        String removed = list.removeFirst(); //Removes the first element of the list and returns it. removed is "Sally" and list is [Harry]. Use removeLast to remove the last element

        ListIterator <String> iter = list.listIterator(); //Provides an iterator for visiting all list elements


        /*
        An iterator encapsulates a position anywhere inside the linked list. Conceptually, think of the iterator as pointing between two elements, just as the cursor in a word processor points between two characters

        You use a list iterator to access elements inside a linked list - you obtain a list iterator with the listIterator method of the LinkedList class
         */

        LinkedList<String> employeeNames = new LinkedList<>();
        ListIterator<String> iterator = employeeNames.listIterator(); //Note that the iterator class is also a generic type - a ListIterator<String> iterates through a list of strings; a ListIterator<Book> visits the elements in a LinkedList<Book>

        iterator.next(); //Initially the iterator points before the first element - you can move the iterator with the next method;

        if(iterator.hasNext()){ //The next method throws a NoSuchElementException if you are already past the end of the list. You should always call the iterator's hasNext method before calling next
            iterator.next();//The next method returns the element that the iterator is passing
        }

        //You traverse all elements in a linked list of strings with the following loop:
        while(iterator.hasNext()){
            String name = iterator.next();
            //Then you can do something with that name
        }

        //As a shorthand, if your loop simply visits all elements of the linked list, you can use the "for each" loop:
        for(String name : employeeNames) {
            //Do something with name
        }

        String s = iter.next(); //Assume that iter points to the beginning of the list [Sally] before calling next. After the call, s is "Sally" and the iterator points to the end

        iter.previous();
        iter.set("Juliet"); //The set method updates the last element returned by next or previous. The list is now [Juliet]

        iter.hasNext(); //Returns false because the iterator is at the end of the collection

        if(iter.hasPrevious()){ //hasPrevious returns true because the iterator is not at the beginning of the list. previous and hasPrevious are ListIterator methods
            s = iter.previous();
        }

        iter.add("Diana"); //Adds an element before the iterator position (ListIterator only). The list is now [Diana, Juliet]

        iter.next();
        iter.remove(); //Remove removes the last element returned by next or previous. The list is now [Diana]
    }

}
