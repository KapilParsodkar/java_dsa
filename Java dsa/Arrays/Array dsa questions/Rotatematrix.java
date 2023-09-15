import java.util.Arrays;

public class Rotatematrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(Arrays.deepToString(rotateMatrix(matrix)));
    }

    public static int[][] rotateMatrix(int[][] matrix) {
        if(matrix.length==0||matrix.length!=matrix[0].length) {
            System.out.println("not possible");
            
        };
    
            int temp=matrix[0][0];
           matrix[0][0]=matrix[2][0];
             matrix[2][0]=matrix[2][2];
            matrix[2][2]=matrix[0][2];
           matrix[0][2]=temp;

           int temp2=matrix[0][1];
           matrix[0][1]=matrix[1][0];
           matrix[1][0]=matrix[2][1];
           matrix[2][1]=matrix[1][2];
           matrix[1][2]=temp2;


        return matrix;
        
    }
}
