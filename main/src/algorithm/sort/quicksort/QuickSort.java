package algorithm.sort.quicksort;

import algorithm.sort.Sort;
import sun.security.krb5.internal.APRep;

/**
 * @author Simon
 */
public class QuickSort implements Sort {

    int[] arr;

    @Override
    public int[] ascendingOrder(int[] arr) {
        if (arr == null || arr.length < 2) return arr;
        this.arr = arr;
        sort(0, arr.length - 1);
        return arr;
    }

    private void sort(int l, int r) {
        if (l > r) return;
        int target = arr[l];
        int left = l + 1;
        int right = r;
        while (true) {
            while (left < r && arr[left] < target) left++;
            while (right > l && arr[right] >= target) right--;
            if (left >= right) break;
            swap(left, right);
        }
        if (target > arr[right]) swap(l, right);
        sort(l, right - 1);
        sort(right + 1,  r);
    }

    private void swap(int i, int j) {
        int temp = this.arr[i];
        this.arr[i] = this.arr[j];
        this.arr[j] = temp;
    }
}
