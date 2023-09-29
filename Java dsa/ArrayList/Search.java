import java.util.ArrayList;
import java.util.Arrays;

public class Search {
          public static void main(String[] args) {
        ArrayList<String> numbers=new ArrayList<String>(Arrays.asList("a","b","c","d"));
               for(String l:numbers){
                if(l.equals("d")){
                    System.out.println("element is found");
                    break;
                }
               }
                  int index=numbers.indexOf("d");
                  System.out.println("the element is found at :"+index);
          }     
}
