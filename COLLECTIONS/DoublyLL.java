//create node class
class Node{
    int data;
    Node prev;
    Node next;

    //constructor
    Node(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
class DoublyLinkedList{
    Node head;

void insertAtBeginning(int data){
    Node newNode = new Node(data);
    if(head != null){
        head.prev = newNode;;
        newNode.next = head;
    }
    head = newNode;
}

void insertAtEnd(int data){
    Node newNode = new Node(data);
    if(head == null){
        head = newNode;
        return;
    }

    Node temp = head;

    while(temp.next != null){
        temp = temp.next;
    }

    temp.next = newNode;
    newNode.prev = temp;
}

void delete(int key){
    Node temp = head;

    while(temp != null){
        if(temp.data == key){
            if(temp.prev == null){
                head = temp.next;
                if(head != null){
                    head.prev = null;
                }
            }else{
                temp.prev.next = temp.next;
                if(temp.next != null){
                    temp.next.prev = temp.prev;
                }
            }
        }
    }
}

void display(){
    Node temp = head;
    while(temp != null){
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
    System.out.println("null");
}
}

public class DoublyLL {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtBeginning(1);
        dll.insertAtBeginning(2);
        dll.insertAtBeginning(3);
        dll.insertAtEnd(0);
        dll.insertAtEnd(-1);
        dll.insertAtEnd(-2);

        System.out.println("Doubly Linked List:");
        dll.display();
        System.out.println("Deleting 2:");
        dll.delete(2);

        System.out.println("Updated Doubly Linked List:");
        dll.display();

    }
    
}
