class Node{
    int data;
    Node next;
    public Object prev;
    Node(int data){
        this.data = data;
        next = null;

    }
}

public class MyCircularll {

    Node head;
    Node rear;
    int size;

    void insert(int d){
        Node n = new Node(d);
        if(head == null){
            head = n;
            rear =n;
            rear.next = head;
        }else{
            rear.next = n;
            rear = rear.next;
            rear.next = head;
        }
        size++;
    }
        
    
    void delete(){
        if(head == null){
            System.out.println("Queue is empty");
        }
        else{
            head = head.next;
            rear.next = head;
            size--;
        }
    }
    void display(){
        Node temp = head;
        while(temp != rear){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(rear.data);
    }

    public static void main(String[] args) {
        MyCircularll m = new MyCircularll();
        m.insert(10);
        m.insert(20);
        m.insert(30);
        m.insert(40);
        m.display();
        System.out.println("After deleting");
        m.delete();
        m.display();

    }
    
}
