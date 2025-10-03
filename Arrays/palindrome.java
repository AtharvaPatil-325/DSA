import java.util.*;
public class palindrome {

    public static void palindrome(int []array){
        int temp =0;
        for(int i =0;i<array.length/2;i++){
            temp = array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        int []array = new int[size];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        int value = palindrome(array);
        
        for(int value:array){
            System.out.println(value+"");
        }
    }
}
