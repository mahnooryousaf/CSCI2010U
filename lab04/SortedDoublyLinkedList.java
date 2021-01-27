public class SortedDoublyLinkedList implements LinkedList{

    int count = 0;

    class Node{
        Node next;
        Node prev;
        Warrior warrior;
    }

    private Node header;
    private Node trailer;

    public SortedDoublyLinkedList(){
        header = null;
        trailer = null;
    }

    public void insert(Warrior warrior){
        Node w = new Node();
        count++;
        w.warrior = warrior;
        count++;
        w.next = null;
        count++;
        w.prev = null;
        count++;

        if(header == null){
            header = w;
            count++;
            trailer = w;
            count++;
            return;
        }

        Node newNode = new Node();
        count++;
        if(header.warrior.getSpeed() < warrior.getSpeed()){
            newNode = header;
            count++;
            header = w;
            count++;
            w.next = newNode;
            count++;
        }

        Node current = header;
        count++;
        while((current.next != null) && (warrior.getSpeed() < header.warrior.getSpeed())){
            current = current.next;
            count++;
        }

        if(current.next == null){
            current.next = w;
            count++;
        }
        

    }

    public String toString(){
        System.out.print("[ ");
        Node current = header;
        if(current != null){
            System.out.print(current.warrior.toString() + " ");
        }
        while ((current != null) && (current.next != null)){
            current = current.next;
            System.out.print(current.warrior.toString() + " ");
        }
        return "]";

    }

    public int assignmentCount(){
        return count;
    }
}