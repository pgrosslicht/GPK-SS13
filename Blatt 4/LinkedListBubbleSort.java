//LinkedList als BubbleSort - advanced

import java.util.*;

public class LinkedListBubbleSort {
    private int size = 0;
    private class Node {
        int value;
        Node next;
        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    private Node head = null;
    public void add(int a) {
        this.size++;
        this.head = new Node(a, this.head);
    }
    
    public void printList() {
        Node temp = head;
        for (int i = 0; i < this.size; i++) {
            System.out.print(temp.value + ", ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    
    public void sort() {
        boolean unsortiert=true;
        Node temp1 = head;
        Node temp2 = head;
        int temp3;
        while (unsortiert){
            unsortiert = false;
            for (int i=0; i < this.size-1; i++) {
                temp2 = temp2.next;
                if (temp1.value > temp2.value) {
                    temp3 = temp1.value;
                    temp1.value = temp2.value;
                    temp2.value = temp3;
                    unsortiert = true;
                }
                temp1 = temp1.next;
            }
            temp1 = head;
            temp2 = head;
        }
    }
    public static void main(String[] args) {
        LinkedListBubbleSort test = new LinkedListBubbleSort(); // neue Liste
        test.add(7); //add 2
        test.add(9); //add 3
        test.add(1); //add 4
        test.add(-5); //add 6
        test.add(5); //add 5
        test.add(6); //add 6
        test.add(24); //add 6
        test.add(-1); //add 6
        test.printList();
        test.sort();
        test.printList();
    }
}
