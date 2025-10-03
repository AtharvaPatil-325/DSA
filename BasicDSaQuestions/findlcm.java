import java.util.*;
public class findlcm {
    public static int findlcm(int a , int b){
        return ((a*b)/findgcd(a, b));
    }
    public static int findgcd(int a , int b){
      while(a!=b){
        if(a>b){
            a=a-b;
        }
        if(b>a){
            b= b-a;
        }
      }
      return a;
    }
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println(findlcm(a, b));
 }   
}
