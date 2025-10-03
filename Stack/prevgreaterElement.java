import java.util.*;
public class prevgreaterElement {
    public static void main(String[] args) {
        int []array  = {100,80,60,70,60,75,85};
        Stack<Integer> st = new Stack<>();
        int n = array.length;
        int []res = new int[n];
        res[0]=-1;
        st.push(array[0]);
        for(int i = 1;i<n;i++){
            while(!st.isEmpty()&& st.peek()<=array[i]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i]=-1;
            }
            else{
                res[i]=st.peek();
            }
            st.push(array[i]);
        }
        for(int i=0;i<=n;i++){
            System.out.println(array[i]+"->"+res[i]);
        }
    }
}
