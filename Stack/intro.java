import java.util.*;
public class intro {
    public static void main(String[] args) {
        //syntax:
        Stack<Integer> st = new Stack<>();
        st.push(1); 
        st.push(20); 
        st.push(39);
        st.push(99);
        st.push(2);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st);
        System.out.println("Size is : "+st.size());
    }
}
