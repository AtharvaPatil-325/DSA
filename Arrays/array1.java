import java.util.Scanner;
public class array1{
    public static int LargestElement(int[]array){
        int largest = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] > largest){
                largest = array[i];
            }
        }
        return largest; 
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
        int largest = LargestElement(array);
        
        
    }
}