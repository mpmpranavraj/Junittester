package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestException {
    @Test
    public void sorting() {
        SortingArray array = new SortingArray();
        int[] unsorted = {2, 1, 4};
        int[] sortedArray = array.sortingArray(unsorted);

        // Example assertion to check if the array is sorted
        int[] expected = {1, 2, 4};
        assertArrayEquals(expected, sortedArray);

        for (int elem : sortedArray) {
            System.out.println(elem);
        }
    }
}
