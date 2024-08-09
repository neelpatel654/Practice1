import java.util.LinkedList;

public class LL {

    Node head;
private int size;
LL(){
    this.size = 0;
}
class Node{
    String data;
    Node next;

    Node(String data){
        this.data = data;
        this.next = null;
        size++;
    }
}

public void addFirst(String data){
    Node newNode = new Node(data);
    if(head==null){
        head = newNode;
        return;
    }
    newNode.next = head;
    head = newNode;
}

public void addLast(String data){
    Node newNode = new Node(data);
    if(head == null){
        head = newNode;
        return;
    }
    Node currNode = head;
    while (currNode.next!=null){
        currNode = currNode.next;
    }
    currNode.next = newNode;
}
public void printList(){
    if(head==null){
        System.out.println("list is empty");
    }
    Node currNode = head;
    while(currNode!=null){
        System.out.print(currNode.data +" -> ");
        currNode = currNode.next;
    }
    System.out.println("NULL");
}
public void deleteFirst(){
    if(head==null){
        System.out.println("the list is empty");
        return;
    }
    size--;
    head = head.next;
}
public void deleteLast(){
    if (head==null){
        System.out.println("the list is empty");
        return;
    }
    size--;
    if(head.next==null){
        head = null;
        return;
    }
    Node secondLast = head;
    Node Last = head.next;
    while (Last.next!=null){
        Last = Last.next;
        secondLast = secondLast.next;
    }
    secondLast.next = null;
}
public int getSize(){
    return size;
}

public void reverseIterate(){
    if(head==null || head.next==null){
        return;
    }
    Node preveNode = head;
    Node currNode = head.next;
    while(currNode!=null){
        Node nextNode = currNode.next;
        currNode.next = preveNode;

        //update
        preveNode = currNode;
        currNode = nextNode;
    }
    head.next = null;
    head = preveNode;
}
    public Node reverseRecursive(Node head){
    if(head==null || head.next==null){
        return head;
    }
     Node newHead = reverseRecursive(head.next);
     head.next.next = head;
     head.next = null;
     return newHead;
    }
    public static void main(String[] args) {
         LL list = new LL();
        list.addFirst("patel");
        list.addFirst("neel");
        list.printList();
        list.addLast("cse");
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());
        list.addFirst("neel");
        list.addLast("cse");
        list.printList();
//        list.reverseIterate();
        list.head = list.reverseRecursive(list.head);
        list.printList();
    }
}


//LinkedList<String> list = new LinkedList<String>();
//        list.addFirst("patel");
//        list.addFirst("neel");
//        System.out.println(list);
//        list.addLast("cse");
//        System.out.println(list);
//        list.removeFirst();
//        System.out.println(list);
//        list.remove();
//        System.out.println(list);
//        list.removeLast();
//        System.out.println(list);
//        list.addFirst("patel");
//        list.addFirst("neel");
//        System.out.println(list);
//        System.out.println(list.size());
//