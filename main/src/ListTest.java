import datastructures.list.List;

import java.util.StringJoiner;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> list = new List<>();
        list.add(1);
        list.add(10);
        list.add(59);
        list.add(32);
        System.out.println(list.getSize());
        printElement(list);
        list.remove(2);
        list.add(465);
        list.remove(2);
        System.out.println(list.getSize());
        printElement(list);
    }

    public static void printElement(List list){
        StringJoiner joiner = new StringJoiner(",");
        for (int i=0;i<list.getSize();i++){
            joiner.add(list.get(i).toString());
        }
        System.out.println(joiner.toString());
    }
}
