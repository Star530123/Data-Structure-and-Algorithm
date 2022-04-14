package algorithm.sort.bucketsort;

import algorithm.sort.Sort;

/**
 * @author Simon
 */
public class BucketSort implements Sort {

    @Override
    public int[] ascendingOrder(int[] arr) {
        if (arr == null || arr.length <= 1) return arr;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i: arr) {
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        int[] record = new int[max - min + 1];
        for (int i: arr) {
            record[i - min]++;
        }
        int index = 0;
        for (int i = 0; i < record.length; i++) {
            while (record[i]-- != 0) {
                arr[index++] = i + min;
            }
        }
        return arr;
    }
}
