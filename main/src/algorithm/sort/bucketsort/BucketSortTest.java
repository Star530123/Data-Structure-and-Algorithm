package algorithm.sort.bucketsort;

import algorithm.sort.Sort;
import util.PrintUtil;
import util.RandomUtil;

/**
 * @author Simon
 */
public class BucketSortTest {
    public static void main(String[] args) {
        Sort sort = new BucketSort();
        int[] origin = RandomUtil.generateArr(20);
        PrintUtil.print(origin);
        PrintUtil.print(sort.ascendingOrder(origin));
        int[] arr = new int[]{1000000000, -2000000000};
        PrintUtil.print(arr);
        PrintUtil.print(sort.ascendingOrder(arr));
    }
}
