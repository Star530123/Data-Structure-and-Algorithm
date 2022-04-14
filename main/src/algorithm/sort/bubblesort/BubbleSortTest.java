package algorithm.sort.bubblesort;

import algorithm.sort.Sort;
import util.PrintUtil;
import util.RandomUtil;

/**
 * @author Simon
 */
public class BubbleSortTest {
    public static void main(String[] args) {
        int[] arr = RandomUtil.generateArr(10);
        Sort sort = new BubbleSort();
        PrintUtil.print(arr);
        PrintUtil.print(sort.ascendingOrder(arr));
    }
}
