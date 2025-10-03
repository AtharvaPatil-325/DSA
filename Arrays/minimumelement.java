import java.util.Scanner;
public class minimumelement {
    public static int minElement(int array[]){
        int min=array[0];
        for(int i=0;i<array.length;i++){
            if(min>array[i]){
                min=array[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int array[]= new int[size];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }

        System.out.println("Minimum Element in the array : "+minElement(array));

        
    }
}
