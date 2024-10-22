
package algoritmafinal;

import java.util.Stack;

public class MyLinkedList {

    public MyLinkedList() {
        head = tail = null;
    }

    private Node head, tail;

    class Node {
        Node (){
            this.item = null;
            this.next = null;
            this.prev = null;
        }
        Node(String item){
            this.item = item;
            this.next = null;
            this.prev = null;
        }

        String item;
        Node next;
        Node prev;
    }

    public void addToStart(String value){
        Node newNode = new Node(value);
        if ( head == null){
            head = newNode;
            tail = newNode;
        }else
        {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    public String getElement(int i){
        Node pointer = head;
        int count = 1;
        while(count != i){
            pointer = pointer.next;
            count ++;
        }
        return pointer.item;
    }

    public Node removeHead(){

        Node removedHead = head;
        if (head == tail){
            head = null;
            tail = null;
        }else{
            Node newHead = head.next;
            newHead.prev = null;
            head = newHead;
        }
        return removedHead;
    }

    public Node removeLast(){

        Node removedTail = tail;
        if (head == tail){
            head = null;
            tail = null;
        }else{
            Node newTail = tail.prev;
            newTail.next = null;
            tail = newTail;
        }
        return removedTail;
    }
    public Node remove(int i){
        Node pointer = head;
        if(i == 1){
            removeHead(); // 1. pozisyondaki elemanı siler
        } {
            int count = 1;
            while(count != i){
                pointer = pointer.next;
                count ++;
            }
            if (pointer.next == null){
                removeLast(); // son pozisyondaki silme
            }
            else if(count == i) { // orta pozisyondaki silme
                 {
                    Node temp1 = pointer.prev;
                    Node temp2 = pointer.next;
                    temp1.next = temp2;
                    temp2.prev = temp1;
                    pointer.next = null;
                    pointer.prev = null;
                }
            }

        }
        return pointer;
    }
    public void printOut(){
        Node current = head;
        while(current != null){
            System.out.println(current.item);
            current = current.next;
        }
    }
    public static void main(String[] args) {
        MyLinkedList liste = new MyLinkedList();
        liste.addToStart("Tarkan1");
        liste.addToStart("Tarkan2");
        liste.addToStart("Tarkan3");
        liste.addToStart("Tarkan4");
        liste.addToStart("Tarkan5");
        liste.remove(3);
        liste.printOut();
        Stack stack =  new Stack();
        Node pointer = liste.head;
        while (pointer != null){
            stack.add(pointer.item);
            pointer = pointer.next;
        }
        while(!stack.empty()){
            System.out.println(stack.pop());
        }





    }
}
