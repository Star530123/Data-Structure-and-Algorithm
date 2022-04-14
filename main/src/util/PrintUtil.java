package util;

import java.util.StringJoiner;

/**
 * @author Simon
 */
public class PrintUtil {
    public static void print(int[] arr) {
        StringJoiner sj = new StringJoiner(",");
        for (int i: arr) {
            sj.add(String.valueOf(i));
        }
        System.out.println(sj);
    }
}
