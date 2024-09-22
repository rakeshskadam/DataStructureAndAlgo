package com.rakkadam.dsa.datastructures.list.linked;

/*
 * @author rakkadam
 * @createdAt 22/09/24
 *
 */
public class DoublyLinkedListTester {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> intDList = new DoublyLinkedList<>();
        intDList.add(1);
        intDList.add(2);
        intDList.add(3);
        intDList.print();
        intDList.printReverse();
        System.out.println(intDList.size());
        DoublyLinkedList<Integer> intDList1 = new DoublyLinkedList<>();
        intDList1.add(1);
        intDList1.print();
    }
}
