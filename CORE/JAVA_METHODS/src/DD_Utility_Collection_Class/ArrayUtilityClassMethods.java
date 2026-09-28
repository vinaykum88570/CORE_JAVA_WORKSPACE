package DD_Utility_Collection_Class;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;

public class ArrayUtilityClassMethods {
    public static void main(String[] args) {
        System.out.println("=== ARRAYS CLASS ALL METHODS DEMONSTRATION ===\n");
        
        // Sample arrays for demonstration
        int[] intArray = {5, 2, 8, 1, 9, 3};
        String[] stringArray = {"Banana", "Apple", "Cherry", "Date"};
        double[] doubleArray = {3.5, 1.2, 4.8, 2.1};
        int[] arrayToFill = new int[5];
        int[] arrayForCopy = new int[8];
        
        //======================================================================
        // 1. SORTING METHODS
        //======================================================================
        System.out.println("1. SORTING METHODS:");
        
        // sort(int[] a) - sorts the specified array into ascending numerical order
        int[] sortedInts = intArray.clone();
        Arrays.sort(sortedInts);
        System.out.println("   sort(int[]) - Original: " + Arrays.toString(intArray) + 
                          ", Sorted: " + Arrays.toString(sortedInts));
        
        // sort(int[] a, int fromIndex, int toIndex) - sorts the specified range
        int[] partialSort = intArray.clone();
        Arrays.sort(partialSort, 1, 4);
        System.out.println("   sort(int[], from, to) - Partial sort: " + Arrays.toString(partialSort));
        
        // sort(Object[] a) - sorts the specified array of objects into ascending order
        String[] sortedStrings = stringArray.clone();
        Arrays.sort(sortedStrings);
        System.out.println("   sort(Object[]) - Sorted strings: " + Arrays.toString(sortedStrings));
        
        // sort(Object[] a, int fromIndex, int toIndex) - sorts the specified range
        String[] partialStringSort = stringArray.clone();
        Arrays.sort(partialStringSort, 0, 2);
        System.out.println("   sort(Object[], from, to) - Partial string sort: " + Arrays.toString(partialStringSort));
        
        // sort(T[] a, Comparator<? super T> c) - sorts with specified comparator
        String[] reverseSorted = stringArray.clone();
        Arrays.sort(reverseSorted, Comparator.reverseOrder());
        System.out.println("   sort(T[], Comparator) - Reverse sorted: " + Arrays.toString(reverseSorted));
        
        // sort(T[] a, int fromIndex, int toIndex, Comparator<? super T> c) - sorts range with comparator
        String[] customSort = stringArray.clone();
        Arrays.sort(customSort, 1, 4, String.CASE_INSENSITIVE_ORDER);
        System.out.println("   sort(T[], from, to, Comparator) - Custom sort: " + Arrays.toString(customSort));
        
        //======================================================================
        // 2. SEARCHING METHODS
        //======================================================================
        System.out.println("\n2. SEARCHING METHODS:");
        
        // binarySearch(int[] a, int key) - searches for key using binary search
        int index = Arrays.binarySearch(sortedInts, 8);
        System.out.println("   binarySearch(int[], key) - Index of 8: " + index);
        
        // binarySearch(int[] a, int fromIndex, int toIndex, int key) - searches range
        int rangeIndex = Arrays.binarySearch(sortedInts, 1, 4, 3);
        System.out.println("   binarySearch(int[], from, to, key) - Index in range: " + rangeIndex);
        
        // binarySearch(Object[] a, Object key) - searches for object key
        int stringIndex = Arrays.binarySearch(sortedStrings, "Cherry");
        System.out.println("   binarySearch(Object[], key) - Index of 'Cherry': " + stringIndex);
        
        // binarySearch(T[] a, T key, Comparator<? super T> c) - searches with comparator
        int customSearch = Arrays.binarySearch(reverseSorted, "Apple", Comparator.reverseOrder());
        System.out.println("   binarySearch(T[], key, Comparator) - Custom search: " + customSearch);
        
        //======================================================================
        // 3. COMPARISON METHODS
        //======================================================================
        System.out.println("\n3. COMPARISON METHODS:");
        
        // equals(int[] a, int[] a2) - returns true if two arrays are equal
        int[] copyInts = intArray.clone();
        boolean intsEqual = Arrays.equals(intArray, copyInts);
        System.out.println("   equals(int[], int[]) - Arrays equal? " + intsEqual);
        
        // equals(Object[] a, Object[] a2) - returns true if object arrays are equal
        boolean stringsEqual = Arrays.equals(stringArray, stringArray.clone());
        System.out.println("   equals(Object[], Object[]) - String arrays equal? " + stringsEqual);
        
        // deepEquals(Object[] a1, Object[] a2) - returns true if arrays are deeply equal
        Object[] deepArray1 = {new int[]{1, 2}, new String[]{"A", "B"}};
        Object[] deepArray2 = {new int[]{1, 2}, new String[]{"A", "B"}};
        boolean deepEqual = Arrays.deepEquals(deepArray1, deepArray2);
        System.out.println("   deepEquals(Object[], Object[]) - Deep equal? " + deepEqual);
        
        //======================================================================
        // 4. FILLING METHODS
        //======================================================================
        System.out.println("\n4. FILLING METHODS:");
        
        // fill(int[] a, int val) - assigns specified value to each element
        Arrays.fill(arrayToFill, 7);
        System.out.println("   fill(int[], val) - Filled with 7: " + Arrays.toString(arrayToFill));
        
        // fill(int[] a, int fromIndex, int toIndex, int val) - fills specified range
        int[] rangeFill = new int[6];
        Arrays.fill(rangeFill, 1, 4, 9);
        System.out.println("   fill(int[], from, to, val) - Range filled: " + Arrays.toString(rangeFill));
        
        // fill(Object[] a, Object val) - fills object array with specified value
        String[] filledStrings = new String[3];
        Arrays.fill(filledStrings, "Hello");
        System.out.println("   fill(Object[], val) - Filled strings: " + Arrays.toString(filledStrings));
        
        //======================================================================
        // 5. COPYING METHODS
        //======================================================================
        System.out.println("\n5. COPYING METHODS:");
        
        // copyOf(int[] original, int newLength) - copies array with specified length
        int[] copied = Arrays.copyOf(intArray, 4);
        System.out.println("   copyOf(int[], length) - Copied first 4: " + Arrays.toString(copied));
        
        // copyOfRange(int[] original, int from, int to) - copies specified range
        int[] rangeCopy = Arrays.copyOfRange(intArray, 1, 5);
        System.out.println("   copyOfRange(int[], from, to) - Range copy: " + Arrays.toString(rangeCopy));
        
        // copyOf(T[] original, int newLength) - copies object array
        String[] stringCopy = Arrays.copyOf(stringArray, 3);
        System.out.println("   copyOf(T[], length) - String copy: " + Arrays.toString(stringCopy));
        
        // copyOfRange(T[] original, int from, int to) - copies object array range
        String[] stringRangeCopy = Arrays.copyOfRange(stringArray, 1, 4);
        System.out.println("   copyOfRange(T[], from, to) - String range copy: " + Arrays.toString(stringRangeCopy));
        
        //======================================================================
        // 6. STRING REPRESENTATION METHODS
        //======================================================================
        System.out.println("\n6. STRING REPRESENTATION METHODS:");
        
        // toString(int[] a) - returns string representation of array
        String intString = Arrays.toString(intArray);
        System.out.println("   toString(int[]) - String: " + intString);
        
        // deepToString(Object[] a) - returns deep string representation
        Object[] nestedArray = {new int[]{1, 2}, new String[]{"A", "B"}};
        String deepString = Arrays.deepToString(nestedArray);
        System.out.println("   deepToString(Object[]) - Deep string: " + deepString);
        
        //======================================================================
        // 7. HASH CODE METHODS
        //======================================================================
        System.out.println("\n7. HASH CODE METHODS:");
        
        // hashCode(int[] a) - returns hash code based on array contents
        int intHash = Arrays.hashCode(intArray);
        System.out.println("   hashCode(int[]) - Hash code: " + intHash);
        
        // deepHashCode(Object[] a) - returns hash code based on deep contents
        int deepHash = Arrays.deepHashCode(nestedArray);
        System.out.println("   deepHashCode(Object[]) - Deep hash code: " + deepHash);
        
        //======================================================================
        // 8. STREAM METHODS (Java 8+)
        //======================================================================
        System.out.println("\n8. STREAM METHODS:");
        
        // stream(int[] array) - returns sequential stream of array
        System.out.println("   stream(int[]) - Stream count: " + Arrays.stream(intArray).count());
        
        // stream(int[] array, int startInclusive, int endExclusive) - returns range stream
        System.out.println("   stream(int[], from, to) - Range stream sum: " + 
                          Arrays.stream(intArray, 1, 4).sum());
        
        // stream(T[] array) - returns object stream
        System.out.println("   stream(T[]) - String stream: " + 
                          Arrays.stream(stringArray).findFirst().orElse("Empty"));
        
        // stream(T[] array, int startInclusive, int endExclusive) - returns object range stream
        System.out.println("   stream(T[], from, to) - String range stream count: " + 
                          Arrays.stream(stringArray, 0, 2).count());
        
        //======================================================================
        // 9. SET ALL METHODS (Java 8+)
        //======================================================================
        System.out.println("\n9. SET ALL METHODS:");
        
        // setAll(int[] array, IntUnaryOperator generator) - sets all elements using generator
        int[] generatedArray = new int[5];
        Arrays.setAll(generatedArray, i -> i * 2);
        System.out.println("   setAll(int[], generator) - Generated: " + Arrays.toString(generatedArray));
        
        // setAll(long[] array, IntToLongFunction generator) - for long arrays
        long[] longArray = new long[4];
        Arrays.setAll(longArray, i -> i * 10L);
        System.out.println("   setAll(long[], generator) - Long array: " + Arrays.toString(longArray));
        
        // setAll(double[] array, IntToDoubleFunction generator) - for double arrays
        double[] doubleGenerated = new double[3];
        Arrays.setAll(doubleGenerated, i -> i * 1.5);
        System.out.println("   setAll(double[], generator) - Double array: " + Arrays.toString(doubleGenerated));
        
        // setAll(T[] array, IntFunction<? extends T> generator) - for object arrays
        String[] stringGenerated = new String[3];
        Arrays.setAll(stringGenerated, i -> "Item-" + (i + 1));
        System.out.println("   setAll(T[], generator) - String array: " + Arrays.toString(stringGenerated));
        
        //======================================================================
        // 10. PARALLEL METHODS (Java 8+)
        //======================================================================
        System.out.println("\n10. PARALLEL METHODS:");
        
        // parallelSort(int[] a) - sorts array in parallel
        int[] parallelSorted = intArray.clone();
        Arrays.parallelSort(parallelSorted);
        System.out.println("   parallelSort(int[]) - Parallel sorted: " + Arrays.toString(parallelSorted));
        
        // parallelSort(int[] a, int fromIndex, int toIndex) - sorts range in parallel
        int[] parallelRangeSort = intArray.clone();
        Arrays.parallelSort(parallelRangeSort, 1, 5);
        System.out.println("   parallelSort(int[], from, to) - Parallel range sort: " + 
                          Arrays.toString(parallelRangeSort));
        
        // parallelSort(T[] a, Comparator<? super T> cmp) - parallel sort with comparator
        String[] parallelStringSort = stringArray.clone();
        Arrays.parallelSort(parallelStringSort, Comparator.reverseOrder());
        System.out.println("   parallelSort(T[], Comparator) - Parallel string sort: " + 
                          Arrays.toString(parallelStringSort));
        
        // parallelPrefix(int[] array, IntBinaryOperator op) - parallel prefix computation
        int[] prefixArray = {1, 2, 3, 4, 5};
        Arrays.parallelPrefix(prefixArray, (a, b) -> a + b);
        System.out.println("   parallelPrefix(int[], op) - Prefix sum: " + Arrays.toString(prefixArray));
        
        // parallelSetAll(int[] array, IntUnaryOperator generator) - parallel setAll
        int[] parallelGenerated = new int[5];
        Arrays.parallelSetAll(parallelGenerated, i -> i * 3);
        System.out.println("   parallelSetAll(int[], generator) - Parallel generated: " + 
                          Arrays.toString(parallelGenerated));
        
        //======================================================================
        // 11. MISCELLANEOUS METHODS
        //======================================================================
        System.out.println("\n11. MISCELLANEOUS METHODS:");
        
        // spliterator(int[] array) - returns spliterator for array
        Spliterator.OfInt spliterator = Arrays.spliterator(intArray);
        System.out.println("   spliterator(int[]) - Spliterator characteristics: " + 
                          spliterator.characteristics());
        
        // spliterator(int[] array, int startInclusive, int endExclusive) - range spliterator
        Spliterator.OfInt rangeSpliterator = Arrays.spliterator(intArray, 1, 4);
        System.out.println("   spliterator(int[], from, to) - Range spliterator estimate size: " + 
                          rangeSpliterator.estimateSize());
        
        // spliterator(T[] array) - object array spliterator
        Spliterator<String> stringSpliterator = Arrays.spliterator(stringArray);
        System.out.println("   spliterator(T[]) - String spliterator: " + 
                          stringSpliterator.estimateSize() + " elements");
        
    System.out.println("\n=== ALL ARRAYS CLASS METHODS DEMONSTRATED SUCCESSFULLY ===");
    }
}