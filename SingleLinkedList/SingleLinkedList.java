package SingleLinkedList;

import javax.swing.plaf.PanelUI;
import java.util.Date;
import java.util.PrimitiveIterator;



public class SingleLinkedList <E>{
    private Node<E> head=null;
    private Node<E> tail=null;
    private int size=0;

    public int Size() {
        return size;
    }

    public boolean isEmpty(){
        return Size()==0;
    }

    public void addFirst(E data){
        Node<E> newNode = new Node(data,head);
        head = newNode;
        if (isEmpty())
            tail=head;
        size++;
    }
    public E getFirst(){
        return head.getData();
    }
    public E removeFirst(){
        if(isEmpty()) return null;
        E delete = head.getData();
        head=head.getNext();
        size--;
        if(isEmpty()) tail=head;
        return delete;

    }
    public void display(){
        Node<E> temp=head;
        while(temp!=null){
            System.out.println(temp.getData()+"------------");
            temp=temp.getNext();

        }
        System.out.println("null \n");
    }
//    public void addLast(E data){
//        Node<E>
//
//    }
//
//}

    class Node<E> {
        private E data;
        private Node<E> next;

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }}