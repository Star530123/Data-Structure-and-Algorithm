package algorithm.sort.bucketsort;

import algorithm.sort.Sort;
import algorithm.sort.SortTest;
import util.PrintUtil;
import util.RandomUtil;

/**
 * @author Simon
 */
public class BucketSortTest extends SortTest {
    public static void main(String[] args) {
        Sort sort = new BucketSort();
        ascendingOrder(sort, RandomUtil.generateArr(20));
        ascendingOrder(sort, RandomUtil.generateArr(30));
        ascendingOrder(sort, new int[]{123,4,-486,23});
    }

}
