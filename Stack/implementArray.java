public class implementArray{
    public static class Stack{
        private int[] arr = new int[5];
        private int idx = 0;

        void push(int x){
            if(isFull()){
                System.out.println("is full");
                return ;
            }
            arr[idx]=x;
            idx++;
        }
        
        int pop(){
            if(idx==0){
                System.out.println("Stack is empty");
                return -1;
            }
            int top =arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }
         int peek(){
            if(idx==0){
                System.out.println("Stack is empty");
                return -1;
            }
            int top = arr[idx-1];
            return top;
         }
         void display(){
            for(int i=0;i<idx-1;i++){
                System.out.print(arr[i]+" ");
            }
         }
         int size(){
            return idx;
         }
         boolean isEmpty(){
            if(idx==0){
                return true;
            }
            else return false;
         }
         boolean isFull(){
            if(idx==arr.length){
                return true;
            }
            else return false;
         }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        st.push(3);
        st.push(5);
        st.push(8);
        st.pop();
        st.display();
        st.peek();
        System.out.println(st.size());  
        System.out.println(st.peek());  

    }
}