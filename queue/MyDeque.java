class NodeD{
    int data;
    NodeD next;
    NodeD prev;
    NodeD(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
 
 class MyDeque{
    NodeD head;
    NodeD rear;
    int size;

    void insertFront(int d){
        NodeD n = new NodeD(d);
        if(head == null){
            head = n;
            rear = n;
        }else{
            n.next = head;
            head.prev = n;
            head = n;
        }
        size++;
    }
    void insertRear(int d){
        NodeD n = new NodeD(d);
        if(head == null){
            head = n;
            rear = n;
        }else{
            rear.next = n;
            n.prev = rear;
            rear = n;
        }
        size++;
    }
    void deleteFront(){
        if(head == null){
            
            System.out.println("Deque is empty");
        }else{
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    void deleteRear(){
        if(head == null){
            System.out.println("Deque is empty");
        }else{
            rear = rear.prev;
            rear.next = null;
            size--;
        }
    }
   
    void displayforward(){
        NodeD temp= head;
        while(temp!= null){
            System.out.print(temp.data+ " ");
            temp= temp.next;
        }
        System.out.println("");
    }
    void displayBackward(){
        NodeD temp = rear;
        while(temp!= null){
            System.out.print(temp.data+ " ");
            temp = temp.prev;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        MyDeque d = new MyDeque();
        d.insertFront(10);
        d.insertFront(20);
        d.insertRear(30);
        d.insertRear(40);
        d.insertFront(60);
        System.out.println("Display front");
        d.displayforward();
        System.out.println("Display backward");
        d.displayBackward();
        System.out.println("After deleting front");
        d.deleteFront();
        d.displayforward();
        System.out.println("After deleting rear");
        d.deleteRear();
        d.displayforward();
        
    }
}
    

