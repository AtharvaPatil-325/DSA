public class linear{
    public static int[] linearSearch(int [] array , int key){
        int res[]={};
        for(int i=1;i<=array.length;i++){
            int a=0;
            if(array[i]==key){
                res[a]=i;
                a++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int [] array = {2,3,2,6,2};
        System.out.println(linearSearch(array, 2));

    }
}