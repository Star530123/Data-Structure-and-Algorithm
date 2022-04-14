package algorithm.sort.bubblesort;

import algorithm.sort.Sort;

/**
 * @author Simon
 */
public class BubbleSort implements Sort {

    @Override
    public int[] ascendingOrder(int[] arr) {
        if (arr == null || arr.length < 2) return arr;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
