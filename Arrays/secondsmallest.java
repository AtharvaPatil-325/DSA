import java.util.Scanner;

public class secondsmallest {
    public static int secondSmallest(int array []){
        int Smallest = array[0];
        int secondSmallest=array[1];
        for(int i =0;i<array.length;i++){
            if(Smallest>array[i]){
                secondSmallest=Smallest;
                Smallest=array[i];
            }
            else if(secondSmallest>array[i]&&array[i]!=Smallest){
                secondSmallest=array[i];
            }
        }
        return secondSmallest;
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
        System.out.println("The Second Smallest element in the array : "+secondSmallest(array));
    }
    
}
