public class Insertion {

 int arr[]=null;
 public Insertion(int size){
    arr=new int[size];
    for(int i=0;i<arr.length;i++){
        arr[i]=Integer.MIN_VALUE;
    }
 }

public void insert(int location,int valuetobeinserted){
try{
    if(arr[location]==Integer.MIN_VALUE){
        arr[location]=valuetobeinserted;
        System.out.println("value inserted successfully");
    }else{
        System.out.println("cell is alrady occupied");
    }
}catch(ArrayIndexOutOfBoundsException e){
     System.out.println("invalid index");
}
}

//traversal

public void traversal(){
    try{
          for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
          }
    }catch (Exception e){
        System.out.println("no array");
    }
    
 
}

//search element in array
public void searchinarray(int valuetosearch){
    for(int i=0;i<arr.length;i++){
        if(arr[i]==valuetosearch){
            System.out.println("value is found at index of "+i);
            return;
        }
    }
    System.out.println(valuetosearch +" is not found");
}

//delete value from array

public void deleteValue( int valuetoDeleteindex){
    try{
      arr[valuetoDeleteindex]=Integer.MIN_VALUE;  
      System.out.println("value has been succesffully deleted");
    }
    catch (ArrayIndexOutOfBoundsException e){
      System.out.println("value provided not in array");
    }
}



    public static void main(String[] args) {

        Insertion sde=new Insertion(10);

        sde.insert(0, 0);
        sde.insert(1, 10);
        sde.insert(2, 20);
        sde.insert(2, 30);
        sde.insert(23, 40);

        int firstelement=sde.arr[0];
        System.out.println(firstelement);

             int secondelement=sde.arr[1];
        System.out.println(secondelement);
        sde.traversal();
        sde.searchinarray(10);
        sde.searchinarray(78);
        sde.deleteValue(2);
        System.out.println(sde.arr[2]);
        }
}
