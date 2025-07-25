public class NodeRemove {

    public static void removeNth(node head, int n){
        node slow = head;
        node fast = head;
        for (int i =1; i<= n; i++){
            fast = fast.next;

        }
        if(fast==null){
            head = head.next;
            return;
        }
        while (fast.next!=null){
            slow=slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;



    }

    public static node nthNode(node head,int n){
        node slow = head;
        node fast = head;
        for(int i =1 ; i<=n;i++){
            fast= fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static void display(node head){
        node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

public static class node{
    int data;
    node next;
    node(int data){
        this.data= data;
    }

}
    public static void main(String[] args) {
    node a= new node(5);
    node b = new node(6);
    node c = new node(7);
    node d = new node(9);
    node e = new node(10);
    a.next =b;
    b.next= c;
    c.next = d;
    d.next = e;

    display(a);
//    node q =nthNode(a,2);
//        System.out.println(q.data);
       removeNth(a,3);
display(a);
    }
}
