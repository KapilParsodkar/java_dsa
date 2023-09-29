import java.util.ArrayList;


public class Insertion {
      public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2,4);
        System.out.println(numbers);
           System.out.println(numbers.get(3));
        ArrayList <String> stringList=new ArrayList<String>();
        stringList.add("A");
        stringList.add("b");
        stringList.add(1,"c");
        System.out.println(stringList);
           System.out.println(stringList.get(1));
    } 
}
