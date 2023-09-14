import java.util.Arrays;

public class insertiontwod{
    
    int arr[][]=null;

    public insertiontwod(int rows,int cols){
        this.arr=new int[rows][cols];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=Integer.MIN_VALUE;
            }
        }
    }
 
//inserting
       public void insert2d(int row,int col,int value){
        try{
          if(arr[row][col]==Integer.MIN_VALUE){
            arr[row][col]=value;
            System.out.println("Successfully value stored");
          }else{
            System.out.println("cell is alrady occupied");
          }
        }catch (Exception e){
            System.out.println("the value is invalid");
        }
       }
    

    //accessing

    public void accesscell(int row,int col){
        System.out.println("\n Accessing row "+row +" and column "+col);
        try{
             System.out.println("cell value is "+arr[row][col]);
        }catch(ArrayIndexOutOfBoundsException e){
              System.out.println("invalid index for access");
        }
    }

    //traversing
    public void traversing(){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }

    //searching
    public void searching(int valuetobesearched){
               for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
              if(arr[row][col]==valuetobesearched){
                  System.out.println("value was found at row "+row+" and col "+col);
                  return;
              }
                
              
            }
          
        }
        System.out.println("value was not found");
    }

    //delete
    public void deleteValue( int row,int col){
        try{
                System.out.println("value has been succesffully deleted "+arr[row][col]);
          arr[row][col]=Integer.MIN_VALUE;  
      
        }
        catch (ArrayIndexOutOfBoundsException e){
          System.out.println("value provided not in array");
        }
    }

    public static void main(String[] args) {
        insertiontwod a=new insertiontwod(3, 3);
        a.insert2d(0, 0, 10);
        a.insert2d(0, 0, 10);
            a.insert2d(0, 1, 20);
       System.out.println(Arrays.deepToString(a.arr));
       a.accesscell(0, 0);
       a.traversing();
       a.searching(10);
            a.searching(20);
       a.searching(56);
       a.deleteValue(0, 0);

    }
}