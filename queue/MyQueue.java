class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}


public class MyQueue {
    Node front;
    Node rear;
    int size;


    void insert(int d){
        Node n = new Node(d);
        if(front == null){
            front = n;
            rear = n;
        }else{
            rear.next = n;   
            rear =rear.next;
        }
        size++;
    }

    int delete(){
        if(front == null){
            System.out.println("Queue is empty");
        }
        else{
           
            front = front.next;
            size--;
            
        }
        int temp = front.data;
        return temp;


    }

    void display(){
        Node temp = front;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

    
    public static void main(String[] args) {
        MyQueue m = new MyQueue();
        m.insert(10);
        m.insert(20);
        m.insert(30);
        m.insert(40);
        m.display();
      
        m.delete();
       
        m.display();

    }
}
