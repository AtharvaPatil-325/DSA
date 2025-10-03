
import java.util.*;
public class reverseanArray{

    public static void reverseArray(int []array){
        int temp=0;
        for(int i=0;i<array.length/2;i++){
            temp=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int size= sc.nextInt();
        int array [] =new int[size];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        reverseArray(array);
        for(int value:array){
            System.out.print(value+" ");
        }
    }
}