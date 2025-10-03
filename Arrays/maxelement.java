
import java.util.*;
public class maxelement{

    public static int max(int array[]){
        int max =array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        int array []= new int[size];
        System.out.println("Enter the elements of array");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        int value = max(array);
        System.out.println("Max Element : "+value);
    }
}