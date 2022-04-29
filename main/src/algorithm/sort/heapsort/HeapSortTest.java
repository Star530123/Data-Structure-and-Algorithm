package algorithm.sort.heapsort;

import algorithm.sort.Sort;
import algorithm.sort.SortTest;
import algorithm.sort.quicksort.QuickSort;
import datastructures.heap.MaxHeap;
import util.RandomUtil;

/**
 * @author Simon
 */
public class HeapSortTest extends SortTest {
    public static void main(String[] args) {
        Sort sort = new HeapSort();
        ascendingOrder(sort, RandomUtil.generateArr(10));
        ascendingOrder(sort, RandomUtil.generateArr(20));
        ascendingOrder(sort, RandomUtil.generateArr(2));
        ascendingOrder(sort, new int[]{2,2,5,4,9,7,8,1,3,12,4,5,6});
    }
}
