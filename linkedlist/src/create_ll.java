import java.util.Scanner;

public class create_ll {

    static class Node{

        int val;
        Node next;

        Node(int val){
            this.val = val;
        }
    }

    static Node kthRemove(Node head,int k){
        if(head==null || k<=0 ){
            return head;
        }
        if(k==1){
            return head.next;
        }
        Node temp = head;
        for(int i =1; temp!=null && i<k-1;i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;
        return head;
    }

     static Node createll(int[] elements){

        if (elements.length==0) return null;
        Node head = new Node(elements[0]);
        Node temp = head;
        for(int i=1; i<elements.length;i++){
            temp.next = new Node(elements[i]);
            temp = temp.next;

        }
        return head;
    }

     static void printlist(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }

    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Size of Ll");
        int n = input.nextInt();
        int[] elements = new int[n];
        System.out.println("Enter the Elements :");
        for(int i =0 ; i<elements.length; i++){
            elements[i] = input.nextInt();
        }
      Node head =  createll(elements);
        int k =3;
      head =kthRemove(head,k);
        printlist(head);

    }
}
