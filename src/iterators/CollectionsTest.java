package iterators;

import java.util.Iterator;

public class CollectionsTest {
    public static void main(String[] args) {
        OurGenericList<Integer> list = new OurGenericList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        for (Object i : list) {
            System.out.print(i+" ");
        }
    }
}
