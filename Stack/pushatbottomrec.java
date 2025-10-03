import java.util.*;
public class pushatbottomrec {
    public static void pushAtBottomRec(Stack<Integer>st, int value){
        if(st.size()==0){
            st.push(value);
            return;
        }
        int top = st.pop();
        pushAtBottomRec(st,value);
        st.push(top);
        }   
    
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);
        pushAtBottomRec(st,6);
        System.out.println("Stack: "+st);
    }
}
