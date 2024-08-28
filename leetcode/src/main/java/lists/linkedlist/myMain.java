package lists.linkedlist;

public class myMain {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
//        myLinkedList.append(2);
//        myLinkedList.prepend(3);
//        myLinkedList.removeLast();
//        System.out.println("Remove Last:");
//        myLinkedList.printList();
//        myLinkedList.removeFirst();
//        System.out.println("Remove First");
//        myLinkedList.printList();
//        myLinkedList.append(4);
//        myLinkedList.append(5);
//        myLinkedList.append(6);
//        System.out.println("Index 2 : " + myLinkedList.get(2).value);
//        myLinkedList.set(2,7);
//        System.out.println("Index 2 : " + myLinkedList.get(2).value);
//        myLinkedList.append(2);
//        myLinkedList.insert(0,8);
//        myLinkedList.printList();
//        myLinkedList.remove(0);
//        myLinkedList.printList();
//        myLinkedList.append(3);
//        myLinkedList.append(4);
//        myLinkedList.append(5);
//        myLinkedList.printList();
//        myLinkedList.reverse();
//        myLinkedList.printList();
//        myLinkedList.reverse();
//        myLinkedList.printList();
//        myLinkedList.append(8);  myLinkedList.append(5);  myLinkedList.append(10); myLinkedList.append(2);myLinkedList.append(1);
//        myLinkedList.printList();
//        myLinkedList.partitionList(5);
//       myLinkedList.printList();
        myLinkedList.append(2);  myLinkedList.append(3);  myLinkedList.append(4); myLinkedList.append(5);
        myLinkedList.reverseBetween(1,3);
        myLinkedList.printList();
    }
}
