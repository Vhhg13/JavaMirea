package ru.mirea.lab23;

public class LinkedQueue extends AbstractQueue {
    class ListNode {
        Object data;
        ListNode next;

        ListNode(Object o, ListNode nxt) {
            data = o;
            next = nxt;
        }
    }

    ListNode first = null, last = null;
    @Override
    public Object dequeue() {
        if(first==null) return null;
        try {
            return first.data;
        } finally {
            first = first.next;
            --size;
        }
    }

    @Override
    public void enqueue(Object o) {
        if (last == null)
            first = last = new ListNode(o, null);
        else {
            last.next = new ListNode(o, null);
            last = last.next;
        }
        ++size;
    }

    @Override
    public Object element() {
        if (first == null) return null;
        return first.data;
    }

    @Override
    public void clear() {
        last = first = null;
        size = 0;
    }
}
