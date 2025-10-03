import java.util.Scanner;

public class printalternate {

    public static void printAlternate(int array[]){
        for(int i= 0;i<array.length;i+=2){
            System.out.println(array[i]);

        }
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
        printAlternate(array);
    }
    
}
