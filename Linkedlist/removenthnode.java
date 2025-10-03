public class removenthnode {
    
    public static void deleteNode(Node head,int n ){
        Node Slow = head;
        Node Fast = head;
        for(int i=1;i<=n;i++){
            Fast=Fast.next;
        }
        if(Fast==null){
            head=head.next;
            return;
        }
        while(Fast.next!=null){
            Fast=Fast.next;
            Slow = Slow.next;
        }
        Slow.next=Slow.next.next;
    }
    public static void display(Node Head){
        Node temp=Head;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
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
     display(a);
     deleteNode(a,3);
     System.out.println();
     display(a);      
    }
    
}
 

