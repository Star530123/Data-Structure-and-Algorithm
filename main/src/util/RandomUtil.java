package util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Simon
 */
public class RandomUtil {
    public static int[] generateArr(Integer n) {
        if (n == null || n <= 0) n = (int) (Math.random() * 21);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int[] arr = new int[n];
        for (int i = 1; i <= n; i++) {
            int index = (int) (Math.random() * list.size());
            arr[list.get(index)] = i;
            list.remove(index);
        }
        return arr;
    }
}
