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

    public static void PrintLinkedList(Node head){
        System.out.println("printing elements");
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.getData());
            curr=curr.getNext();
        }
    }

}
