import java.util.*;

public class nextGreaterElement {
    public static void main(String[] args) {
        int[] array = {1, 5,3,2,1,6,3,4};
        Stack<Integer> st = new Stack<>();
        int n = array.length;
        int[] res = new int[n];

        res[n-1] = -1;       // last element has no next greater
        st.push(array[n-1]); // push last element

        for (int i = n - 2; i >= 0; i--) {
            // pop smaller or equal elements
            while (!st.isEmpty() && st.peek() <= array[i]) {
                st.pop();
            }

            // assign result
            if (st.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }

            // push current element
            st.push(array[i]);
        }

        // print results
        for (int i = 0; i < n; i++) {
            System.out.println(array[i] + " -> " + res[i]);
        }
    }
}
