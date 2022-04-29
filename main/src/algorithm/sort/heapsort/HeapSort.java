package algorithm.sort.heapsort;

import algorithm.sort.Sort;
import datastructures.heap.MaxHeap;

import static util.ToolUtil.swap;

/**
 * @author Simon
 */
public class HeapSort implements Sort {

    @Override
    public int[] ascendingOrder(int[] arr) {
        MaxHeap heap = new MaxHeap(arr);
        arr = heap.getArr();
        int size = heap.size();
        for (int i = size - 1; i >= 1; i--) {
            swap(arr, 0, i);
            heapifyTopDown(arr, i);
        }
        return arr;
    }

    public void heapifyTopDown(int[] arr, int size) {
        int currentIndex = 0;
        while (size > 1 && currentIndex * 2 + 1 < size) {
            int left = currentIndex * 2 + 1;
            int right = (currentIndex + 1) * 2;
            int compareIndex = right >= size ? left : arr[left] >= arr[right] ? left : right;
            if (arr[currentIndex] >= arr[compareIndex]) break;
            swap(arr, currentIndex, compareIndex);
            currentIndex = compareIndex;
        }
    }

}
