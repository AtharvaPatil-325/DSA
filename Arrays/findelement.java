import java.util.Scanner;
public class findelement {

    public static int element(int array [],int number){
        int index=0;
        for(int i =0;i<array.length;i++){
            if(number==array[i])
            index= i;
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        int [] array=new int[size];
        System.out.println("Enter the elements in array:");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Index at which number is present "+element(array,40));
        
    }
    
}
