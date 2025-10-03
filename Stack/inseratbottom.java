import java.util.*;
public class inseratbottom{
    public static void main(String[] args) {
      Stack<Integer> st = new Stack<>();
      st.push(5);
      st.push(3);
      st.push(2);
      st.push(6);
      st.push(9);
      System.out.println(st);
      int x = 8;
      int index = 2;

      Stack<Integer> temp = new Stack<>();
      while(st.size()>index){
        temp.push(st.pop());
      }
      st.push(x);

      while(temp.size()>0){
        st.push(temp.pop());
      }
      System.out.println(st);
    }
}