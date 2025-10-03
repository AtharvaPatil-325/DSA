import java.util.Scanner;
public class sumofArray {
    public static int sum(int array[]){
        int sum = 0;
        for(int i =0;i<array.length;i++){
            sum = sum+array[i];

        }
        return sum;
    }
    public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the size of the array:");
     int size =sc.nextInt();
     int array[]=new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
       sum(array);
       System.out.println("The sum of the array:"+sum(array));
    }
}

