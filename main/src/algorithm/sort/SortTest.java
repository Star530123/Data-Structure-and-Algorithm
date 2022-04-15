package algorithm.sort;

import util.PrintUtil;

import java.util.Arrays;

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
        checkAnswer(arr);
    }

    protected static void checkAnswer(int[] arr) {
        int[] answer = new int[arr.length];
        System.arraycopy(arr, 0, answer, 0, arr.length);
        Arrays.sort(answer);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != answer[i]) {
                System.out.println("Don't sort correctly");
                break;
            }
        }
    }

}
