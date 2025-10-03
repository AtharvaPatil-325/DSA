import java.util.Scanner;

public class countevenodd {
    public static int[] countEvenOdd(int array[]){
        int even = 0;
        int odd =0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        return new int [] {even,odd};
    }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int []array= new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        int []value =countEvenOdd(array);
        System.out.println("Even count:"+value[0]);
        System.out.println("Odd count:"+value[1]);
    }
    
}
