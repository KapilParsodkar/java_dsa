public class findnuminarray {
    public static void main(String[] args) {
        int [] a={1,2,3,4,5,6};
        System.out.println(searchInArray(a, 6));
    }
    public static int searchInArray(int[] intArray, int valueToSearch) {
       int Value=0;
       for(int i=0;i<intArray.length;i++){
        if(intArray[i]==valueToSearch){
            Value=i;
        }
       }
          return Value;
    }
     
}
