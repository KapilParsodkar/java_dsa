import java.util.ArrayList;
import java.util.Iterator;



public class Traversing {
         public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2,4);
      
         for(int i=0;i<numbers.size();i++){
            System.out.println(numbers.get(i));
         }

         for(Integer a:numbers){
            System.out.println(a);
         }

         Iterator<Integer> a=numbers.iterator();
         while(a.hasNext()){
            System.out.println(a.next());
         }

        
}
}