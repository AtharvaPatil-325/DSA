import java.util.*;
public class perfectsq {
    public static String perfectsq(int num){
    for(int i = 1;i*i<=num;i++){
        if(i*i==num){
            return "Yes it is a perfect sq.";
        }
    }
     return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(perfectsq(num));
    }
}
