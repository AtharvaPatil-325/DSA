import java.util.*;
public class displaystackrec {
 public static void displayRec(Stack<Integer> st){
    if(st.size()==0)
    return;
    int top = st.pop();
    System.out.print(top+"");
    displayRec(st);
    st.push(top);
 }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);
        displayRec(st);
    }
}
