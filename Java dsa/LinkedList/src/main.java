public class main {
    public static void main(String[] args) {
        Node ten=new Node(10);
        Node twenty=new Node(20);
        Node thirty=new Node(30);
        Node forty=new Node(40);
        Node fifty=new Node(50);

        Node head=ten;
        ten.setNext(twenty);
        twenty.setNext(thirty);
        thirty.setNext(forty);
        forty.setNext(fifty);
        fifty.setNext(null);
        head=insertatfront(head,5);
        PrintLinkedList(head);
       head= deleteatfront(head);
        PrintLinkedList(head);
        head=append(head,70);
        PrintLinkedList(head);
        head=insert(head,30,89);
        PrintLinkedList(head);
        head=deleteatLast(head);
        PrintLinkedList(head);
        head=remove(head,89);
        PrintLinkedList(head);
        head=reverse(head);
        PrintLinkedList(head);
    }

    public static Node insertatfront(Node head,int data){
        Node newnode=new Node(data);
        newnode.setNext(null);
        if(head==null){
            head.setNext(newnode);
        }
        else{
            newnode.setNext(head);
            head=newnode;
        }
        return head;
    }

    public static Node deleteatfront(Node head){

        if(head!=null) {
           head=head.getNext();


        }
        return head;


    }

    public static Node append(Node head,int data){
        Node newnode=new Node(data);
        if (head==null){
            return newnode;
        }
        Node curr=head;
        while(curr.getNext()!=null){
             curr=curr.getNext();
        }

        curr.setNext(newnode);
        return head;
    }

    public static Node insert(Node head,int target,int data){
        Node newnode=new Node(data);
        Node curr=head;

        while(curr!=null && curr.getData()!=target){
            curr=curr.getNext();
        }
        if(curr!=null){
            newnode.setNext(curr.getNext());
            curr.setNext(newnode);

        }
        return head;

    }

    public static Node deleteatLast(Node head){
        Node curr=head;
        while(curr.getNext().getNext()!=null){
            curr=curr.getNext();
        }
        curr.setNext(null);
        return head;
    }

    public static Node remove(Node head,int target){

        Node curr=head;

        while(curr!=null && curr.getNext().getData()!=target){
            curr=curr.getNext();
        }
       if (curr.getNext().getData()==target){
           curr.setNext(curr.getNext().getNext());

       }
        return head;

    }
    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {
            next = curr.getNext(); // Store the next node
            curr.setNext(prev); // Reverse the current node's pointer
            prev = curr; // Move the previous node to the current node
            curr = next; // Move to the next node
        }

        return prev; // Prev will be the new head
    }

    public static void PrintLinkedList(Node head){
        System.out.println("printing elements");
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.getData());
            curr=curr.getNext();
        }
    }

}
