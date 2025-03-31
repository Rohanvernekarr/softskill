public class doublyll {
    Node head;
    Node tail;
    int length;

    doublyll(){
        head = null;
        tail = null;
        length = 0;
    }

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int d) {
            data = d;
            next = null;
            prev = null;
        }
        
    }
    public boolean isEmpty(){
        return length == 0;
    }

    void addFirst(int data) {
        Node newNode = new Node(data);
        if(isEmpty()){
            head = tail = newNode;
            return;

        }else{
            head.prev = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    void addLast(int data) {
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            
        }else{
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail = newNode;
        length++;
    }

    void addAtPos(int pos , int data ){
        if(pos<0 || pos>length){
            throw new IllegalArgumentException("Invalid position");
        }
        if ( pos ==1){
            addFirst(data);
            return;

        }
    }

    Node deleteFirst(){
        if(isEmpty()){
            throw new RuntimeException("List is empty");
        }
        Node temp = head;
        if(head == tail){
            head = tail = null;
        }else{
            head = head.next;
            head.prev = null;
        }
        length--;
        return temp;
    }

    void displayForward() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        doublyll l = new doublyll();
        Node n1 = l.new Node(10);
        Node n2 = l.new Node(20);
        
        l.head = l.tail = n1;
        n1.next = n2;
        n2.prev = n1;
        l.tail = n2; 

        l.displayForward(); 
    }   

 }