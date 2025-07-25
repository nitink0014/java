public class Linkedlist {

    public static void display(Node head) {
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.data +" ");
            temp = temp.next;

        }


    }


    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
       Node a = new Node(5);
       Node b = new Node(9);
       Node c = new Node(7);
       Node d = new Node(2);

       a.next = b; //a->b
       b.next = c; // a->b->c
       c.next = d; // a-> b-> c -> d
//        System.out.println(a.data);
//        System.out.println(a.next.data);
//        Node temp = a;
//        while(temp!= null){
//            System.out.print(temp.data+" ");
//            temp= temp.next;
        display(a);
        }

    }

