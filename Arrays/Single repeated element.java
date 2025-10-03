public class Main{
    public static void main(String []args){
        int [] arr = {2,3,1,3,1,5,5};
        int rev=arr[0];
        for(int i=1;i<arr.length;i++){
            rev = rev^arr[i];
        }
        System.out.println("single repeated element is :"+rev);
    }
}