import java.util.*;
public class binary {

    public static int binarySearch(int []array , int key){
        int low=0;
        int high=array.length-1;
        int mid=0;
        while(low<=high){
            mid=(low+high)/2;
            if(key==array[mid]){
                return mid;
            }
            else if(key<array[mid]){
                high=mid-1;
                low=low;
            }
            else {
                low = mid+1;
                high =high;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6};
        Arrays.sort(array);
        System.out.println(binarySearch(array, 6));
        
    }
}
