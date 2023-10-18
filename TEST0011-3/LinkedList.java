public class LinkedList<T> {

    private class Node {
        T data;
        Node next;
        public Node(T data) {
            this.data = data;
        }
    }
    private Node head;
    private Node tail;
    public boolean add(Node node) {     //加结点
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        return true;
    }

    public void removeLast() {      //删除尾结点
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            tail = null;
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public void remove(T value) {    //根据结点数据删除结点
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data.equals(value)) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    public int find(T value) {   //根据结点值找结点
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data.equals(value)) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }
}