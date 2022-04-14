package algorithm.sort.bubblesort;

import algorithm.sort.Sort;
import algorithm.sort.SortTest;
import util.PrintUtil;
import util.RandomUtil;

/**
 * @author Simon
 */
public class BubbleSortTest extends SortTest {
    public static void main(String[] args) {
        Sort sort = new BubbleSort();
        ascendingOrder(sort, RandomUtil.generateArr(10));
        ascendingOrder(sort, RandomUtil.generateArr(20));
    }
}
