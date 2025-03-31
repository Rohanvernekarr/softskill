class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data = data;
        next = null;
        prev = null;
    }
}

public class MyDoublyll {

    Node head;
    Node rear;
    int size;

    void insert(int d){
        Node n = new Node(d);
        if(head == null){
            head = n;
            rear =n;
        }else{
            rear.next = n;
            n.prev = rear;
            rear = rear.next;
        }
        size++;
    }
        
    
    void delete(){
        if(head == null){
            System.out.println("Queue is empty");
        }
        else{
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        MyDoublyll m = new MyDoublyll();
        m.insert(10);
        m.insert(20);
        m.insert(30);
        m.insert(40);
        m.display();
        System.out.println("After deletion");
        m.delete();
        m.display();
    }
}