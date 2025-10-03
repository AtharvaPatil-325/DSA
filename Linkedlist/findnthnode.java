public class findnthnode {

    public static Node nthElement(Node head,int n ){
        Node Slow = head;
        Node Fast = head;
        for(int i=1;i<=n;i++){
            Fast=Fast.next;
        }
        while(Fast!=null){
            Fast=Fast.next;
            Slow = Slow.next;
        }
        return Slow;
        
    }
    public static class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }
    }
    public static void main(String[]args){
        Node a = new Node(5);
        Node b = new Node(8);
        Node c = new Node(7);
        Node d = new Node(4);
        Node e = new Node(1);
        
        a.next=b;        
        b.next=c;        
        c.next=d;        
        d.next=e;
        Node q = nthElement(a, 4); 
        System.out.println(q.value);     
    }
}
