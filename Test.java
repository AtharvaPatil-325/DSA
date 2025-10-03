class algebra{
     int sum(int a,int b){
        int add = a+b;
        return add;
    }
}


public class Test{
    public static void main(String[] args) {
        algebra obj = new algebra();
       System.out.println(obj.sum(1,3));
    } 
}