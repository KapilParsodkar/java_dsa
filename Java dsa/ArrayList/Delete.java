import java.util.ArrayList;

public class Delete {
          public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2,4);
        System.out.println(numbers);

        numbers.remove(2);
        System.out.println(numbers);
}
}