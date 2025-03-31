
public class mystack{
    node top;
    int size;

    mystack(){
        top = null;
        size = 0;
    }

    static class node{
        int data;
        node next;

        node(int val){
            data = val;
            
        }
    }
    boolean isEmpty(){
        return size == 0;
    }
    void push(int val){
         node newnode = new node(val);
        // newnode.next = top;
        // top = newnode;
        // size++;
        if(isEmpty()){
            top = newnode;

        }else{
            newnode.next = top;
            top = newnode;
        }
        size++;

    }
    void pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else{
            top = top.next;
            size--;
        }
    }
    void peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else{
            System.out.println("Top element is: "+top.data);
        }
    }

    public static void main(String[] args) {
        mystack stack = new mystack();
        stack.push(10);
        System.out.println(stack.isEmpty());
        stack.push(10);
        stack.push(30);
        stack.push(50);
        stack.push(20);
        
        stack.pop();
        
            }
        
            
}

//min value in stack