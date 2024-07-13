public class Intersectionoftwolinkedlists {
public static void main(String[] args) {
    Node ten=new Node(10);
        Node twenty=new Node(20);
        Node thirty=new Node(30);
        Node forty=new Node(40);
        Node fifty=new Node(50);
        Node head=ten;

Node six=new Node(6);

Node seven=new Node(7);

Node eight=new Node(8);

Node head2=six;

ten.setNext(twenty);
twenty.setNext(thirty);
thirty.setNext(forty);
forty.setNext(fifty);
fifty.setNext(null);

six.setNext(seven);
seven.setNext(eight);
eight.setNext(null);


System.out.println(Intersection(head, head2));
}    

public static Node Intersection(Node head,Node head2){
int m=getlength(head);
int n=getlength(head2);
Node fp=null;
Node sp=null;
if(m<=n){
    fp=head;
sp=head2;
for(int i=0;i<n-m;i++){
    sp.getNext();
}
}
else{
    fp=head;
    sp=head2;
for(int i=0;i<m-n;i++){
    fp.getNext();
}
}
while (fp!=null) {
if(fp==sp){
return fp;
}
fp.getNext();
sp.getNext();
}
return null;
}


public static int getlength(Node head){
    Node curr=head;
    int length=0;
while(curr!=null){
    curr=curr.getNext();
    length++;
}
return length;
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
