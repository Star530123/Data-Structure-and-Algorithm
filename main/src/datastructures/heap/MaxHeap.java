package datastructures.heap;

import static util.ToolUtil.swap;

/**
 * @author Simon
 */
public class MaxHeap {
    private int size;
    private int[] arr;

    public MaxHeap(int[] arr) {
        this.arr = arr == null ? new int[0] : arr;
        this.size = 0;
        for (int i = 0; i < this.arr.length; i++) {
            heapifyBottomUp(i);
            this.size++;
        }
    }

    public void append(int val) {
        if (arr.length == 0) {
            arr = new int[]{val};
            size++;
            return;
        }
        if (size == arr.length) {
            int[] newArr = new int[arr.length * 2];
            System.arraycopy(arr, 0, newArr, 0, arr.length);
            arr = newArr;
        }
        arr[size] = val;
        heapifyBottomUp(size++);
    }

    public void heapifyBottomUp(int currentIndex) {
        int parentIndex = (currentIndex - 1) / 2;
        while (currentIndex > 0 && arr[parentIndex] < arr[currentIndex]) {
            swap(arr, currentIndex, parentIndex);
            currentIndex = parentIndex;
            parentIndex = (currentIndex - 1) / 2;
        }
    }

    public int[] getArr() {
        return arr;
    }

    public int size() {
        return size;
    }
}
