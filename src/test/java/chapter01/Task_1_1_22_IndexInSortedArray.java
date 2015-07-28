package chapter01;

import org.junit.Test;

public class Task_1_1_22_IndexInSortedArray {

    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1, 0);
    }

    // Index of key in array[], if present, is not smaller than low and not larger than high.
    public static int rank(int key, int[] array, int low, int high, int depth) {
        System.out.printf("Search depth [%s]. Ranks interval [%s]:[%s]\n", depth, low, high);


        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (key < array[mid]) {
            depth++;

            return rank(key, array, low, mid - 1, depth);
        } else if (key > array[mid]){
            depth++;
            return rank(key, array, mid + 1, high, depth);
        }
        else
            return mid;
    }

    @Test
    public void test(){
        // sorted array
        int size = 1000000;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }

        int toCheck = 566454;
        int rank = rank(toCheck, array);
        System.out.printf("Element to check [%s] position in array is [%s]", toCheck, rank);
    }

}
