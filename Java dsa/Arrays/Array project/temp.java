
import java.util.Scanner;
public class temp {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("how many days temprature");
        int numdays=scan.nextInt();
        int [] temps=new int[numdays];
        int sum=0;
        for(int i=0;i<numdays;i++){
            System.out.println("Day " +(i+1)+"'s high temp : ");
       temps[i]=scan.nextInt();
            sum+=temps[i];
        }
     float avg=sum/numdays;

     int above=0;
     for(int i=0;i<temps.length;i++){
        if(temps[i]>avg){
            above++;
        }
     }
        System.out.println();
        System.out.println("Average temp is " +avg);
        System.out.println( above+" days above average");
    }
}
