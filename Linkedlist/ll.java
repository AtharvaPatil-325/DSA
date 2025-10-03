public class ll{
// recursively 
    public static void printll(Node Head){    
        if(Head==null)
        return;
        System.out.print(Head.value+" ");
        printll(Head.next);

    }
    // In reverse order
    public static void printl(Node Head){
        if(Head==null)
        return;
        printl(Head.next);
        System.out.print(Head.value+" ");
    }
    public static void printLL(Node Head){
        Node temp =Head;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
    }
    public static class Node{
        int value;
        Node next;
        private Node(int value){
            this.value=value;
        }
    }
    public static void main(String[]args){
        Node a = new Node(5);
        Node b = new Node(7);
        Node c = new Node(9);
        Node d = new Node(6);
        Node e = new Node(3);
        
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        
      printLL(a);
      System.out.println(" ");
      printll(a);
      System.out.println();
        printl(a);
    }
}