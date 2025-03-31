class ListNode {
    int data;
    ListNode next;

    ListNode(int d) {
        data = d;
        next = null;
    }
}

class LinkedList {
    ListNode head; 
    void insert(int d) {
        ListNode newNode = new ListNode(d);
        
         if (head == null) {
            head = newNode;
            return;
        }
         ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
                temp.next = newNode;
    }

    void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null"); 
    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.display(); 
        
    }
}
