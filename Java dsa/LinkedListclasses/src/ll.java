import java.util.LinkedList;
import java.util.Iterator;

public class ll {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        Iterator <Integer> it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(list.contains(20));
        Iterator <Integer> dit=list.descendingIterator();
        while(dit.hasNext()){
            System.out.println(dit.next());
        }
        

    }
}
