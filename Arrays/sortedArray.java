import java.util.Scanner;


public class sortedArray {
    public static boolean sorted(int array[]){
        boolean isSorted = true;
        for(int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1]){
                isSorted = false;
            }
        }
        return isSorted;
    }
    
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the size of array :");
         int size = sc.nextInt();
         int array[] = new int[size];
         System.out.println("Enter the elements of array");
         for(int i=0;i<size;i++){
             array[i]=sc.nextInt();
         }
         
         boolean check= sorted(array);
        System.out.println("The array is "+(check ? "": "not")+"sorted");
    }
    }
   
