package org.academiadecodigo.tropaDELETE.food;
// https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html


public class LinkedList<E> {

    Node head;
    int length = 0;

    public class Node {

        E foodName;
        Node next; // food type

        public Node(E foodType) {
            this.foodName = foodType;
            next = null;
        }

        public E getFoodName() {
            return foodName;
        }

        public Node getNext() {
            return next;
        }
    }


    public LinkedList() {
        this.head = new Node(null);
    }

    public LinkedList add(E foodName) {

        Node newNode = new Node(foodName);
        newNode.next = null;

        if (head == null) {
            head = newNode;
        } else {
            Node lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.getNext();
            }
            lastNode.next = newNode;
        }
        length++;
        return this;
    }


    /*public boolean remove(Object foodName) {

        Node previousNode = head;
        Node iterator = head.getNext();

        while (iterator != null) {
            if (iterator.getFoodName().equals(foodName)) {
                previousNode.setNext(iterator.getNext());
                this.length--;
                return true;
            }
            previousNode = iterator;
            iterator = iterator.getNext();

        }

        return false;

    }*/


    public void printList(LinkedList list) {
        Node currentNode = list.head.getNext();

        System.out.print("Foodlist: ");

        while (currentNode != null) {
            System.out.print(currentNode.getFoodName() + " ");
            // Go to next node
            currentNode = currentNode.getNext();
        }
    }

}




