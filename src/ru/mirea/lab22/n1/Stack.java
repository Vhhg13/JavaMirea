package ru.mirea.lab22.n1;

public class Stack<T> {
    class ListNode{
        T data;
        ListNode next;
        ListNode(T data, ListNode next){
            this.data=data;
            this.next=next;
        }
    }
    ListNode first=null;
    void push(T data){
        first=new ListNode(data, first);
    }
    T pop() throws Exception{
        if(first==null) throw new Exception("Stack underflow");
        T tmp=first.data;
        first=first.next;
        return tmp;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<10;++i)
            stack.push(i);
        try{
            while(true)
                System.out.println(stack.pop());
        }catch(Exception e){
            System.out.println("Stack ended");
        }
    }
    public void print(){
        ListNode node=first;
        while(node!=null){
            System.out.println(node.data);
            node=node.next;
        }
    }
}
