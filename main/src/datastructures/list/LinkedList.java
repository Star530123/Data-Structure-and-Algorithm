package datastructures.list;

public class LinkedList<T> {
    int size = 0;
    Node head = null;

    public T get(int index) {
        if (index >= this.size) {
            System.out.println("Out of list bound.");
            return null;
        }
        Node curNode = head;
        int curIndex = 0;
        while (curIndex != index) {
            curIndex++;
            curNode = curNode.next;
        }
        return curNode.value;
    }

    public void add(T value) {
        if (size++ == 0) {
            head = new Node(value);
            return;
        }
        Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = new Node(value);
    }

    public void remove(int index) {
        if (this.size == 0) {
            System.out.println("This Linkedlist is empty.");
            return;
        }
        if (index >= this.size) {
            System.out.println("Out of list bound.");
            return;
        }
        this.size--;
        if (index == 0) {
            head = head.next;
            return;
        }
        int curIndex = 0;
        Node curNode = head;
        while (curIndex != index - 1) {
            curIndex++;
            curNode = curNode.next;
        }
        curNode.next = curNode.next.next;
    }

    public int size() {
        return this.size;
    }

    private class Node {
        T value;
        Node next = null;

        public Node(T value) {
            this.value = value;
        }
    }
}
