public class DoublyLinkedList {
    Node head;
    Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }
    public void InsertFront(int data){
        Node node=new Node(data);
        if (this.head==null){
            head=node;
            tail=node;
        }else{
            node.next=head;
            head.prev=node;
            head=node;
        }
    }
    public void InsertBack(int data){
        Node node2=new Node(data);
        if (head==null){
            head=node2;
            tail=node2;

        }else {
            node2.prev=tail;
            tail.next=node2;
            tail=node2;
        }
    }

    public void printForward(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public void printBackward(){
        Node temp=tail;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
        System.out.println();
    }

    public void RemoveNodeFront(){
        Node temp=head;
        head=head.next;
        head.prev=null;
        System.out.println("Deleted Node "+temp.data);
    }
    public void RemoveNodeBack(){
        Node temp=tail;
        tail=tail.prev;
        tail.next=null;
        System.out.println("Deleted Node "+temp.data);
    }
}
