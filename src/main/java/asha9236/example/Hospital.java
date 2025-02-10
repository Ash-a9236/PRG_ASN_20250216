package asha9236.example;

import java.util.Iterator;

public class Hospital<T> implements Iterator<T> {
    private Node<T> head;

    public Hospital(Node<T> head) {
        this.head = head;
    }

    public void addPatient(Patient patient) {
        Node<T> newNode = new Node<>(patient);

        if (head == null) {
            this.head = newNode;
        } else {

            Node<T> last = head.next;
            while (last.next != null) {
                last = last.next;
            }

            last.next = newNode;
        }
    }

    //ITERATOR CLASSES//////////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public T next() {
        return null;
    }


//NODE CLASS////////////////////////////////////////////////////////////////////////////////////////////////////////////
    static class Node<T> {
        private Node<T> next;
        private Patient patient;


        public Node (Patient patient) {
            this.next = null;
            this.patient = patient;
        }
    }
}
