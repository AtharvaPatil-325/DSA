public class insertatend {

    public static class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }
    }
    public static class linkedlist{
        Node Head = null;
        Node Tail = null;
        int size=0;

        void insertAtEnd(int value){
             Node Temp = new Node(value);
              if(Head==null){
                Head = Temp;
            }
            else{
                Tail.next=Temp;
            }
            Tail = Temp;
            size++;
        }

        void insertAt(int index,int value){
            Node t = new Node(value);
            Node Temp=Head;
             if(index==size){
            insertAtEnd(value);
           }
           else if(index==0){
            insertAtBegining(value);
            return;
           }
           else if(index<0||index>size){
            System.out.println("Wrong index");
            return;
           }
            for(int i=0;i<=index-1;i++){
                Temp=Temp.next;
            }
            t.next=Temp.next;
            Temp.next=t;
            size++;
        }
        int getValue(int index){
            Node temp = Head;
            for(int i=0;i<=index;i++){
                temp=temp.next;
            }
            return temp.value;
            
        }

        void display(){
            Node Temp = Head;
            while(Temp!=null){
                System.out.print(Temp.value+" ");
                Temp=Temp.next;
            }
        }
        
        
        void insertAtBegining(int value){
            Node temp = new Node(value);
            if(Head==null){
                Head=temp;
                 Tail=temp;
            }
            else{
                 temp.next=Head;
                 Head=temp;
            }
            size++;
            
        }
        
        }
        
    
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(5);
        ll.insertAtEnd(8);
        ll.insertAtEnd(5);
        ll.display();
        System.out.println();
       
      System.out.println( "SIze is "+ ll.size);
      ll.insertAtBegining(4);
      ll.display();
      
      ll.insertAt(1,3);
      System.out.println();
       ll.display();

       ll.insertAt(0,90);
       System.out.println();
      ll.display();
      System.out.println();
      System.out.println(ll.Head.value);
      int a = ll.getValue(2);
        System.out.println(a);
        
    }
}
