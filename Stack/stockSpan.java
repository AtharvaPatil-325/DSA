import java.util.*;
public class stockSpan {
    public static void main(String[] args) {
        int [] array = {100, 80, 60, 70, 60, 75, 85};
        int n = array.length;
        int [] span = new int[n];
        Stack<Integer> st = new Stack<>();
        span[0]=1;
        st.push(0);
        for(int i=1;i<n;i++){
            while(!st.isEmpty()&&array[st.peek()]<=array[i]){
                st.pop();
            }
            if(st.isEmpty()){
                span[i]=i+1;
            }
            else{
                span[i]=i-st.peek();
            }
            st.push(i);
        }
          for (int i = 0; i < n; i++) {
            System.out.println(array[i] + " -> " + span[i]);
    }
}
}
