package com.cbfacademy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Iterator;

public class CollectionsAssignment {

    /**
     * This method removes all values from the provided list that are smaller
     * than the indicated integer. The remaining elements retain their original
     * ordering.
     *
     * @param list     - the list of integers
     * @param minValue the minimum value to retain
     */
    public static void removeSmallInts(List<Integer> list, int minValue) {
        /*
         * Your solution must traverse the list from last to first element
         * removing any values less than minValue.
         * Solution: Use an iterator to traverse the list from last to first element.
         * For each element encountered, we’ll check if it’s less than the minValue.
         * If so, we’ll remove it from the list.
         */
        Iterator<Integer> iterator = list.iterator();// An iterator over a collection
        while (iterator.hasNext())/* hasNext() method Returns true if the iteration has more elements. */ {
            Integer value = iterator.next();/* next() method Returns the next element in the iteration */
            if (value < minValue) {
                iterator.remove(); // Remove() method removes the element
            }
        }
    }

    /**
     * This method returns true if the provided collection contains any
     * duplicate elements.
     *
     * @param integers - a collection of integers
     * @return true if integers contains duplicates, false otherwise
     */
    public static boolean containsDuplicates(Collection<Integer> integers) {
        // Your solution must not use any loops
        // Solution-Utilizing a set: A set is a collection that contains no duplicate
        // elements., we will be utilizing a Set to keep track of unique elements
        // encountered so
        // far, if the collection already conatins an element we know its duplicate.
        Set<Integer> uniqueElements = new HashSet<>();
        for (Integer num : integers) {
            if (!uniqueElements.add(num)) {// the " ! "inverts the value of uniqueElements thus if element is not unique
                                           // will add elememt to set
                return true; // Duplicate found
            }
        }
        return false; // No duplicates

    }

    /**
     * This method returns an ArrayList containing all elements that appear in
     * either of the two collection arguments. There will be no duplicate values
     * in the resulting ArrayList. The values in the returned ArrayList must be
     * in sorted order.
     * <p>
     * For example, if the two arguments contain {2, 1, 2, 3} and {3, 4, 4, 5},
     * the returned ArrayList will contain {1, 2, 3, 4, 5}. The original
     * collections will not be modified.
     *
     * @param ints1 - the first collection
     * @param ints2 - the second collection
     * @return A sorted ArrayList containing the integers that appear in either
     *         collection.
     */
    public static ArrayList<Integer> inEither(Collection<Integer> ints1, Collection<Integer> ints2) {
        // This must be done with no loops.
        return new ArrayList<Integer>();
    }

    /**
     * This method returns an ArrayList containing all elements that appear in
     * both of the two collection arguments. There will be no duplicate values
     * in the resulting ArrayList. The values in the returned ArrayList must be
     * in sorted order. For example, if the two arguments contain {2, 1, 2, 3} and
     * {3, 4, 4, 5}, the returned ArrayList will contain {3}. The original
     * collections will not be modified.
     *
     * @param ints1 - the first collection
     * @param ints2 - the second collection
     * @return An ArrayList containing the integers that appear in both
     *         collections.
     */
    public static ArrayList<Integer> inBoth(Collection<Integer> ints1, Collection<Integer> ints2) {
        // This must be done with no loops.
        return new ArrayList<>();
    }

    /**
     * This method returns the String that appears most frequently in the
     * provided list. For example, if the input list contains the elements
     * {"Bob", "Alice", "Bob"}, this method will return "Bob". If there are
     * ties, any of the most frequently occurring elements may be returned.
     * If the list is empty, return the empty string "".
     *
     * @param list - a list of Strings
     * @return the most frequently occurring String
     */
    public static String mostFrequent(List<String> list) {
        // You should solve this problem in two stages: First iterate through
        // the list to count occurrences of each String. Then iterate through
        // your counts to find the largest. You'll need a collection that allows
        // you to store a mapping from Strings to counts.
        // No nested loops or non-enhanced for-loops are allowed.
        return "";
    }

    public static String getName() {
        return "Collections Assignment";
    }
}
