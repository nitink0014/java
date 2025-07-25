public class Implementation2 {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }

    }
    public static class  Linkedlist{
        Node head =null;
        Node tail = null;

        void delete(int idx){
            Node temp =head;
            if (idx == 0) {
                head = head.next;
                if (head == null) tail = null; // list is now empty
                return;
            }

            for(int i =0; i<idx-1; i++){
                temp = temp.next;
            }
            temp.next=temp.next.next;

        }


        void insertatHead(int data){
            Node temp = new Node(data);
            if(head==null){
                head = tail =temp;
            }else{
                temp.next = head;
                head = temp;
            }

        }
        void insertatEnd(int data){
            Node temp = new Node(data);
            if(head==null){
                head = temp;

            }else{
                tail.next=temp;

            }
            tail = temp;
        }
        void insertIndex(int data,int idx){
            Node temp = new Node(data);
            Node t = head;
            if(idx==0){
                insertatHead(data);
                return;
            } else if (idx==size()) {
                insertatEnd(data);
                return;

            }else if(idx<0){
                System.out.println("wrong Index");
            }
            for(int i =0; i<idx-1;i++){
                t = t.next;
            }
            temp.next = t.next;
            t.next=temp;

        }


        void display(){
            Node temp =head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }

int size(){
            Node temp = head;
            int count =0;
            while(temp!=null){
                count++;
                temp= temp.next;
    }
            return count;
}


    }



    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.insertatHead(4);
        ll.display();
        ll.insertatEnd(10);
        ll.display();
        ll.insertIndex(12 , 1);
        ll.display();
    ll.delete(2);
    ll.display();
        ll.delete(1);
        ll.display();
    }
}
