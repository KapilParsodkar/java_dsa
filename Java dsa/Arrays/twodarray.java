import java.util.Arrays;

public class twodarray {
    public static void main(String[] args) {
        int[][] twod=new int[2][2];
        twod[0][0]=1;
           twod[0][1]=2;
              twod[1][0]=4;
                 twod[1][1]=3;
                   
        System.out.println(Arrays.deepToString(twod));
        String [][] q={{"a","b"},{"c","n"}};

                           
        System.out.println(Arrays.deepToString(q));
    }
}
