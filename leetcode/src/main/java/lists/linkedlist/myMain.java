package lists.linkedlist;

public class myMain {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);
//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();
//        myLinkedList.printList();

        myLinkedList.append(5);
        myLinkedList.append(7);
//        myLinkedList.append(9);
        myLinkedList.printList();
        myLinkedList.removeLast();

        myLinkedList.printList();
        myLinkedList.prepend(1);
        myLinkedList.prepend(2);
        myLinkedList.removeFirst();

        myLinkedList.printList();

    }
}
