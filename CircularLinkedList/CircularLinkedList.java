package CircularLinkedList;

//import SingleLinkedList.Node;

public class CircularLinkedList <E> {
    private Node<E> tail;
    private int size;

    public CircularLinkedList() {
        tail=null;
        size=0;

    }
    public int Size() {
        return size;
    }

    public boolean isEmpty(){
        return Size()==0;
    }

    public void addFirst(E data){
        if(isEmpty()){
            Node<E> newNode = new Node(data, null);
            tail=newNode;
            newNode.setNext(tail);

        }

        else {
            Node<E> newNode = new Node(data, null);
            tail.setNext(newNode);
        }
        size++;

    }
    public void addLast(E data){
        addFirst(data);
        tail=tail.getNext();
    }

    public E getFirst(){
        if(isEmpty()) return null;
        return tail.getNext().getData();
    }
    public E getLast(){
        if(isEmpty()) return null;
        return tail.getData();
    }

    public E removeFirst(){
        if(isEmpty()) return null;

        if(tail==tail.getNext())
            tail=null;

        else{
            tail.setNext(tail.getNext().getNext());
        }
        size--;
        return null;
    }
public E removeLast(){
        if(isEmpty()) return null;

    if(tail==tail.getNext())
        tail=null;

    else{
        Node<E> temp= tail.getNext();
    while(temp.getNext()!=tail){
        temp=temp.getNext();

    }
    temp.setNext(tail.getNext());
    tail=temp;

    }
    size--;
    return null;

}


    /////////////////////////////////

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
    }
}
