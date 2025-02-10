package asha9236.example;

import java.util.Iterator;

public class Hospital<T> implements Iterator<T> {
    private Node head;


    public Hospital(Node head) {
        this.head = head;
    }

    public Hospital() {
        this.head = null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public T next() {
        return null;
    }

    public Hospital<T> insert(Hospital<T> list, Patient patient) {
        Node newNode = new Node(patient);

        if (list.head == null) {
            list.head = newNode;
        } else {
            Node last = list.head;

            while (last.next != null) {
                last = last.next;
            }

            last.next = newNode;
        }
        return list;
    }

    static class Node {
        private Node next;
        private Patient patient;


        public Node (Patient patient) {
            this.next = null;
            this.patient = patient;
        }
    }
}
