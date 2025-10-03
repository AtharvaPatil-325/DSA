import java.util.*;
public class generateprimeno {
    public static void main(String[]args){
        System.out.println("Enter the no. to print prime numbers uptill there:");
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
        for(int i=2;i<=num;i++){
        boolean isPrime = true;
        for(int j=2;j<i;j++){
            if(i%j==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.print(i+" ");
        }
       }
       
    }
}
