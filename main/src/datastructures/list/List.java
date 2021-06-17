package datastructures.list;

import java.util.Arrays;

public class List<T> {
    private int size = 0;
    private Object[] arr = new Object[20];
    private double loadFactor = 0.75;

    public List() {
    }

    public int getSize() {
        return size;
    }

    public T get(int index) {
        return (T) arr[index];
    }

    public void add(T element) {
        if (size == arr.length * loadFactor) {
            int newLength = (int) (size / loadFactor);
            Object[] newArr = new Object[newLength];
            System.arraycopy(arr, 0, newArr, 0, size);
            arr = newArr;
        }
        arr[size++] = element;
    }

    public void remove(int index) {
        int newLength = (int) (size / loadFactor);
        Object[] newArr = new Object[newLength];
        for (int i = 0,j = 0; i < size; i++) {
            if (i == index) {
                continue;
            }
            newArr[j++] = arr[i];
        }
        arr = newArr;
        size--;
    }

}
