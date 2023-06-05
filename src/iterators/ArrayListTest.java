package iterators;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<>();
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        arrList.add(4);
        arrList.add(5);
        System.out.println(arrList);
        System.out.println("Element that got replaced: " + arrList.set(1, 100));
        System.out.println(arrList);

        List<Integer> arrList1 = new ArrayList<>(arrList);
        arrList1.add(6);
        arrList1.add(6);
        arrList1.add(6);
        arrList1.add(6);
        System.out.println(arrList1);
        System.out.println(arrList);

        List<Integer> arrList2 = new ArrayList<>();
        arrList2.add(0);
        arrList2.add(0);
        arrList2.addAll(arrList);
        arrList2.addAll(arrList1.subList(4, 6));
//        sublist creates a shallow copy. It doesn't create a copy. If we change in derived list, org changes too.
        System.out.println(arrList2);

        System.out.println(arrList.indexOf(5));
        System.out.println(arrList2.lastIndexOf(0));

//        Converting arraylist to array
        Integer[] intArr2 = arrList2.toArray(new Integer[0]);
        for (int item : intArr2) {
            System.out.print(item+", ");
        }
    }
}
