package asha9236.example;

import java.sql.SQLOutput;
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

            Node<T> last = head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = newNode;
        }

        System.out.println("Patient added successfully");
    }

    public void removePatient(String name) {
        Node<T> last = head.next;

        while (last.next != null) {
            if (last.next.getPatient().getName().equals(name)) {
                last.next = last.next.next; //TODO : verify the logic cux daFuck did I just pull
                break;
            } else {
                last = last.next;
            }
        }
    }

    public boolean contains(String name) {
        Node<T> last = head;

        while (last.next != null) {
            if (last.next.getPatient().getName().equals(name)) {
                //System.out.println("PATIENT FOUND : " + last.next.toString());
                System.out.println("patient found!");
                return true;
            }

            last = last.next;
        }
        return false;
    }

    public Node<T> getNode(String name) {
        Node<T> last = head;

        while (last.next != null) { //breaking out too early : not able to reach last node
            if (last.getPatient().getName().equals(name)) {
                printPatient(last.next);
                return last.next;
            }

            last = last.next;
        }

        return null;
    }

    public void getNode1(String name) {
        Node<T> last = head;

        while (last.next != null) { //breaking out too early : not able to reach last node
            if (last.getPatient().getName().equals(name)) {
                last.next.toString();
                break;
            }
            System.out.println();

            last = last.next;
        }
    }

    public void printPatient (Node<T> node) {
        node.toString();
    }

    public void updateSeverity (String name, String newSeverity) {
        if (contains(name)) {
            getNode(name).getPatient().setSeverity(SEVERITY.valueOf(newSeverity));
        } else {
            System.out.println("[ERROR : PATIENT NOT FOUND]");
        }
    }

    public void markAsICU (String name) {
        if (contains(name)) {
            if (getNode(name).getPatient().isInICU()) {
                System.out.println("[ERROR : PATIENT ALREADY IN ICU]");
            } else {
                getNode(name).getPatient().setInICU(true);
            }
        } else {
            System.out.println("[ERROR : PATIENT NOT FOUND]");
        }
    }

    public void displayPatients () {
        if (head == null) {
            System.out.println("[ERROR : NO PATIENTS]");
        } else {
            System.out.println("______PATIENTS_______________________________________");
            head.getPatient().toString();
            Node<T> last = head;

            while (last.next != null) {
                System.out.println(last.next.getPatient().toString());
                last = last.next;
            }
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

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public Patient getPatient() {
            return patient;
        }

        public void setPatient(Patient patient) {
            this.patient = patient;
        }
    }
}
