import datastructures.list.LinkedList;

import java.util.StringJoiner;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        printLinkedList(list);
        System.out.println(list.size());
        list.remove(1);
        list.remove(3);
        System.out.println(list.size());
        list.remove(0);
        printLinkedList(list);
    }

    public static void printLinkedList(LinkedList list) {
        StringJoiner joiner = new StringJoiner(",");
        for (int i = 0; i < list.size(); i++) {
            joiner.add(list.get(i).toString());
        }
        System.out.println(joiner);
    }
}
