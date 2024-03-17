import java.util.function.DoubleToLongFunction;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList=new DoublyLinkedList();
        doublyLinkedList.InsertFront(1);
        doublyLinkedList.InsertFront(2);
        doublyLinkedList.InsertFront(3);
        doublyLinkedList.InsertFront(4);

        doublyLinkedList.printForward();

        doublyLinkedList.printBackward();

        doublyLinkedList.RemoveNodeFront();
        doublyLinkedList.printForward();

        doublyLinkedList.RemoveNodeBack();
        doublyLinkedList.printForward();





    }
}
