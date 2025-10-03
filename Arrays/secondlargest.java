import java.util.Scanner;

public class secondlargest {
    public static int secondLargest(int[]array){
        int largest =array[0];
        int secondLargest= array[1];
        for(int i=2;i<array.length;i++){
            if(array[i]>largest){
                secondLargest= largest;
                largest =array[i];
            }
            else if(array[i]<largest && array[i]>secondLargest){
                secondLargest=array[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int[] array= new int[size];
        System.out.println("Enter the elements of array");
        for(int i =0;i<size;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("The Second largest element in the array : "+secondLargest(array));
    }
    
}
