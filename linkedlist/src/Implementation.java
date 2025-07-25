public class Implementation {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public static class linkedList{
        Node Head = null;
        Node Tail = null;

void delete(int idx){
    Node temp = Head;
    for (int i =1; i<= idx-1;i++){
        temp=temp.next;
    }
    temp.next=temp.next.next;
    Tail=temp;
}
        void insertAtHead(int val){
            Node temp = new Node(val);
            if(Head==null){
                Head= Tail= temp;
            }
            else {
                temp.next=Head;
                Head=temp;

            }

        }

      void  insertAtEnd(int val){
          Node temp= new Node(val);
          if(Head==null){
              Head = temp;
          }
          else {
             Tail.next=temp;
          }
          Tail = temp;
      }

        void insertAt(int idx, int val){
            Node t = new Node(val);
            Node temp=Head;
            if(idx==0){
                insertAtHead(val);
                return;
            } else if (idx==size()) {
                insertAtHead(val);
                return;

            }
            else if (idx<0){
                System.out.println("Wrong Index");
                return;
            }
            for (int i =1; i<=idx-1;i++){
                temp=temp.next;
            }
          t.next =  temp.next;
            temp.next=t;
        }

      void display(){
          Node temp = Head;
          while(temp!=null){
              System.out.print(temp.data +" ");
              temp= temp.next;
          }

      }
      int size() {
          Node temp = Head;
          int count = 0;
          while (temp != null) {
              count++;
              temp = temp.next;
          }
          return count;
      }

    }

    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.insertAtEnd(5);
        ll.insertAtEnd(8);
        ll.display();
        System.out.println();
        System.out.println( "size of The Linkedlist is "+ll.size());
        ll.insertAtHead(24);
//        ll.display();
        ll.insertAt(1,15);
        ll.display();
        System.out.println();
        ll.delete(1)
        ;
        ll.display();
    }

}
