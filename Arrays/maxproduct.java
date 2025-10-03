import java.util.Scanner;
public class maxproduct {
    public static int[] maxProduct(int array[]){
        int max1=array[0];
        int max2=array[1];
        for(int i =0;i<array.length;i++){
            if(max1<array[i]){
                max2=max1;
                max1=array[i];
            }
            else if(max2<array[i]&& array[i]!=max1){
                max2=array[i];
            }
        }
        return new int[]{max1,max2};
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
        int [] product=maxProduct(array);
        System.out.println("maximum product of two distinct numbers : "+product[0]*product[1]);
}
}
