package SingleLinkedList;

public class Main {
    public static void main(String[]args){

        SingleLinkedList<Integer> list= new SingleLinkedList<Integer>();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.removeFirst();
        list.display();

    }

}
