import java.util.*;
public class perfectcube {
    public static String perfectcube(int num){
    for(int i = 1;i*i*i<=num;i++){
        if(i*i*i==num){
            return "Yes it is a perfect cube";
        }
    }
     return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(perfectcube(num));
    }
}
 
