
import java.util.*;

public class Main {
    public static int distinctElements(int[]array,int n){
        HashSet<Integer> map = new HashSet<Integer>();
        for(int i =0 ; i<n;i++){
            map.add(array[i]);
        }
        return map.size();
}
public static void main(String[]args){
    int [] array = {2,3,5,2,3,5};
    int n = array.length;
    System.out.println(distinctElements(array,n));
}
}