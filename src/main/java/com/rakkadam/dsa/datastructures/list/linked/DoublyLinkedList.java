package com.rakkadam.dsa.datastructures.list.linked;

/*
 * @author rakkadam
 * @createdAt 22/09/24
 *
 */
public class DoublyLinkedList<T> {

    private class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;

        Node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        Node(T data, Node<T> next, Node<T> prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

        protected void setNext(Node<T> next) {
            this.next = next;
        }

        protected void setPrev(Node<T> prev) {
            this.prev = prev;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    public DoublyLinkedList() {
        head = null;
    }

    public Node<T> add(T data) {
        Node<T> newNode = new Node<>(data);
        if(head == null) {
            head = newNode;
        } else {
            Node<T> tempHead = head;
            while(tempHead.next != null) {
                tempHead = tempHead.next;
            }
            tempHead.next = newNode;
            newNode.prev = tempHead;
        }
        tail = newNode;
        size++;
        return newNode;
    }

    public int size() {
        return size;
    }


    public void print() {
        System.out.println(this.toString());
    }

    public void printReverse() {
        if (tail == null) {
            System.out.println("[null]");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node tempHead = tail;
        while(tempHead.prev != null) {
            sb.append(tempHead.data);
            sb.append(", ");
            tempHead = tempHead.prev;
        }
        sb.append(tempHead.data);
        sb.append("] ");
        System.out.println(  sb.toString());
    }

    @Override
    public String toString() {
        //StringBuilder
        if (head == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node tempHead = head;
        while(tempHead.next != null) {
            sb.append(tempHead.data);
            sb.append(", ");
            tempHead = tempHead.next;
        }
        sb.append(tempHead.data);
        sb.append("] ");
        return  sb.toString();
    }
}
