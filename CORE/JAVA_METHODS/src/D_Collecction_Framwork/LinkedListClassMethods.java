package D_Collecction_Framwork;

import java.util.*;
import java.util.function.Consumer;

public class LinkedListClassMethods {
    public static void main(String[] args) {
        System.out.println("=== LINKEDLIST ALL METHODS WITH EXAMPLES ===\n");
        
        LinkedList<String> list = new LinkedList<>();
        
        //======================================================================
        // PUBLIC METHODS WITH EXAMPLES
        //======================================================================
        System.out.println("\nAdd Methods ========");
        // public boolean add(E e) - appends the specified element to the end of this list
        list.add("Apple");
        list.add("Banana");
        System.out.println("add(E): " + list);
        
        // public void addFirst(E e) - inserts the specified element at the beginning
        list.addFirst("First");
        System.out.println("addFirst(E): " + list);
        
        // public void addLast(E e) - appends the specified element to the end
        list.addLast("Last");
        System.out.println("addLast(E): " + list);
        
        // public boolean addAll(Collection<? extends E> c) - appends all elements
        boolean addedAll = list.addAll(Arrays.asList("Cherry", "Date"));
        System.out.println("addAll(Collection): " + addedAll + ", List: " + list);
        
        // public boolean addAll(int index, Collection<? extends E> c) - inserts all at position
        boolean addedAllIndex = list.addAll(2, Arrays.asList("Mango", "Orange"));
        System.out.println("addAll(index, Collection): " + addedAllIndex + ", List: " + list);
        
        // public void add(int index, E element) - inserts element at position
        list.add(3, "Grapes");
        System.out.println("add(index, E): " + list);
        
        // public boolean contains(Object o) - returns true if contains element
        boolean contains = list.contains("Banana");
        System.out.println("contains('Banana'): " + contains);
        
        // public int size() - returns number of elements
        int size = list.size();
        System.out.println("size(): " + size);
        
        System.out.println("\nACCESSING ELEMENTS ========");
        // public E get(int index) - returns element at specified position
        String element = list.get(2);
        System.out.println("get(2): " + element);
        
        // public E getFirst() - returns first element
        String first = list.getFirst();
        System.out.println("getFirst(): " + first);
        
        // public E getLast() - returns last element
        String last = list.getLast();
        System.out.println("getLast(): " + last);
        
        // public E set(int index, E element) - replaces element at position
        String oldElement = list.set(1, "Blueberry");
        System.out.println("set(1, 'Blueberry'): Replaced '" + oldElement + "', Now: " + list);
        
        // public int indexOf(Object o) - returns index of first occurrence
        int firstIndex = list.indexOf("Cherry");
        System.out.println("indexOf('Cherry'): " + firstIndex);
        
        // public int lastIndexOf(Object o) - returns index of last occurrence
        list.add("Cherry"); // Add duplicate
        int lastIndex = list.lastIndexOf("Cherry");
        System.out.println("lastIndexOf('Cherry'): " + lastIndex);
        
        // public E peek() - retrieves but does not remove head
        String peeked = list.peek();
        System.out.println("peek(): " + peeked);
        
        // public E element() - retrieves but does not remove head
        String headElement = list.element();
        System.out.println("element(): " + headElement);
        
        // public E peekFirst() - retrieves but does not remove first element
        String peekFirst = list.peekFirst();
        System.out.println("peekFirst(): " + peekFirst);
        
        // public E peekLast() - retrieves but does not remove last element
        String peekLast = list.peekLast();
        System.out.println("peekLast(): " + peekLast);
        
        // public boolean offer(E e) - adds element as tail
        boolean offered = list.offer("Offered");
        System.out.println("offer(E): " + offered + ", List: " + list);
        
        // public boolean offerFirst(E e) - inserts element at front
        boolean offeredFirst = list.offerFirst("OfferFirst");
        System.out.println("offerFirst(E): " + offeredFirst + ", List: " + list);
        
        // public boolean offerLast(E e) - inserts element at end
        boolean offeredLast = list.offerLast("OfferLast");
        System.out.println("offerLast(E): " + offeredLast + ", List: " + list);
        
        // public void push(E e) - pushes element onto stack (adds to front)
        list.push("Pushed");
        System.out.println("push(E): " + list);
        
        // public E pop() - pops element from stack (removes from front)
        String popped = list.pop();
        System.out.println("pop(): " + popped + ", List: " + list);
        
        // public E poll() - retrieves and removes head
        String polled = list.poll();
        System.out.println("poll(): " + polled + ", List: " + list);
        
        // public E pollFirst() - retrieves and removes first element
        String polledFirst = list.pollFirst();
        System.out.println("pollFirst(): " + polledFirst + ", List: " + list);
        
        // public E pollLast() - retrieves and removes last element
        String polledLast = list.pollLast();
        System.out.println("pollLast(): " + polledLast + ", List: " + list);
        
        System.out.println("\nREMOVING ELEMENTS =========== ");
        
        // public E remove() - retrieves and removes head
        String removedHead = list.remove();
        System.out.println("remove(): " + removedHead + ", List: " + list);
        
        // public E remove(int index) - removes element at position
        String removedIndex = list.remove(2);
        System.out.println("remove(2): " + removedIndex + ", List: " + list);
        
        // public boolean remove(Object o) - removes first occurrence
        boolean removedObj = list.remove("Blueberry");
        System.out.println("remove('Blueberry'): " + removedObj + ", List: " + list);
        
        // public E removeFirst() - removes and returns first element
        String removedFirst = list.removeFirst();
        System.out.println("removeFirst(): " + removedFirst + ", List: " + list);
        
        // public E removeLast() - removes and returns last element
        String removedLast = list.removeLast();
        System.out.println("removeLast(): " + removedLast + ", List: " + list);
        
        // public boolean removeFirstOccurrence(Object o) - removes first occurrence
        boolean removedFirstOccurrence = list.removeFirstOccurrence("Cherry");
        System.out.println("removeFirstOccurrence('Cherry'): " + removedFirstOccurrence + ", List: " + list);
        
        // public boolean removeLastOccurrence(Object o) - removes last occurrence
        list.add("Date"); // Add duplicate
        boolean removedLastOccurrence = list.removeLastOccurrence("Date");
        System.out.println("removeLastOccurrence('Date'): " + removedLastOccurrence + ", List: " + list);
        
        // public void clear() - removes all elements
        list.clear();
        System.out.println("clear(): " + list);
        
        // Re-populate for remaining examples
        list.addAll(Arrays.asList("Apple", "Banana", "Cherry", "Date"));
        
        // public Object[] toArray() - returns array containing all elements
        Object[] array = list.toArray();
        System.out.println("toArray(): " + Arrays.toString(array));
        
        // public <T> T[] toArray(T[] a) - returns array of specified type
        String[] stringArray = list.toArray(new String[0]);
        System.out.println("toArray(T[]): " + Arrays.toString(stringArray));
        
        // public Object clone() - returns shallow copy
        @SuppressWarnings("unchecked")
        LinkedList<String> cloned = (LinkedList<String>) list.clone();
        System.out.println("clone(): " + cloned);
        
        // public ListIterator<E> listIterator(int index) - returns list iterator
        ListIterator<String> listIterator = list.listIterator(1);
        System.out.print("listIterator(1): ");
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();
        
        // public Iterator<E> descendingIterator() - returns reverse iterator
        Iterator<String> descendingIterator = list.descendingIterator();
        System.out.print("descendingIterator(): ");
        while (descendingIterator.hasNext()) {
            System.out.print(descendingIterator.next() + " ");
        }
        System.out.println();
        
        // public Spliterator<E> spliterator() - creates spliterator
        Spliterator<String> spliterator = list.spliterator();
        System.out.println("spliterator(): " + spliterator.estimateSize() + " elements");
        
       
       
        System.out.println("\n=== ALL LINKEDLIST METHODS DEMONSTRATED ===");
    }
}