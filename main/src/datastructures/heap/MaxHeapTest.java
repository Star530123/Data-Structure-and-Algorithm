package datastructures.heap;

import util.PrintUtil;

import java.lang.reflect.Member;

/**
 * @author Simon
 */
public class MaxHeapTest {
    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(null);
        PrintUtil.print(maxHeap.getArr());
        maxHeap.append(5);
        maxHeap.append(4);
        maxHeap.append(48);
        maxHeap.append(8);
        maxHeap.append(812);
        PrintUtil.print(maxHeap.getArr());
    }
}
