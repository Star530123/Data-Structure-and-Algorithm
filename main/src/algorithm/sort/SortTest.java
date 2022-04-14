package algorithm.sort;

import util.PrintUtil;

/**
 * @author Simon
 */
public abstract class SortTest {
    protected static void ascendingOrder(Sort sort, int[] arr) {
        System.out.println(sort.getClass().getSimpleName());
        System.out.print("Origin : ");
        PrintUtil.print(arr);
        System.out.print("Finish : ");
        PrintUtil.print(sort.ascendingOrder(arr));
    }

}
