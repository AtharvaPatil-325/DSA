import java.util.*;
public class stringpalinndrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur String");
        String str = sc.next();
        str = str.toUpperCase();
        int len = str.length();
        String rev = "";

        String org_str = str;
        for(int i=len-1;i>=0;i--){
            rev = rev+str.charAt(i);
        }
        if(org_str.equals(rev)){
            System.out.println("Palindrom String");
        }
        else{
            System.out.println("not");
        }
    }
}
