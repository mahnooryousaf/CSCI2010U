public class SortedDoublyLinkedList implements LinkedList{


    private static class Node{
        private Warrior warrior;
        private Node prev;
        private Node next;


        public Node(Warrior w,Node p,Node n){
            warrior = w;
            prev = p;
            next = n;
        }

    }


    private Node head;
    private Node tail;
    private int size = 0;
    public int assignmentCount = 0;

   //Constructor for the SortedDoublyLinkedList class

    public SortedDoublyLinkedList() {
        head = new Node(null,null,null);
        tail = new Node(null,head,null);
        head.next = tail;
        assignmentCount += 3;
    }

    // adds the warrior to the doubly linked list in a sorted order based on speed\
    public void insert(Warrior warrior) {
        if(size == 0){
            add(warrior,head,head.next);
            assignmentCount += 1;
        }else if(warrior.getSpeed() > head.next.warrior.getSpeed()){
            add(warrior,head,head.next);
        }else{
            Node tmp = head.next;
            assignmentCount += 1;
            while(tmp.next != null && warrior.getSpeed() <= tmp.warrior.getSpeed()){
                tmp = tmp.next;
                assignmentCount += 3;
            }
            if(tmp.next == null){
                assignmentCount += 1;
                add(warrior,tail.prev,tail);
            }else{
                add(warrior,tmp.prev,tmp);
            }
        }
    }


    // adds the warrior to the list and gets the next and prev node to point appropriate nodes

    private void add(Warrior w,Node p,Node n){
        Node tmp = new Node(w,p,n);
        p.next = tmp;
        n.prev = tmp;
        assignmentCount += 3;
        size++;
    }


    // prints out doubly linked list

    public String toString(){

        int counter = 0;
        if(size != 0){
            String print = "";
            Node temp = head.next;
            while(counter < size){
                print += temp.warrior.toString() + " ";
                temp = temp.next;
                counter++;
            }
            return print;
        }
        else
            return "No Warriors currently in the list";

    }
}