package org.example;

import java.sql.*;




class Node<T> {
    T data; Node<T> next;
    Node(T data) { this.data = data; }
}

class RouteLinkedList<T extends Checkpoint> {
    private Node<T> head;

    public void addCheckpoint(T checkpoint) {
        Node<T> newNode = new Node<>(checkpoint);
        if (head == null) head = newNode;
        else {
            Node<T> temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
    }

    public double computeTotalDistance() {
        double total = 0;
        for (Node<T> t = head; t != null; t = t.next) total += t.data.distanceFromLast;
        return total;
    }

    public double computeTotalPenalty() {
        double total = 0;
        for (Node<T> t = head; t != null; t = t.next) total += t.data.calculatePenalty();
        return total;
    }

    public void printRoute() {
        int i = 1;
        for (Node<T> t = head; t != null; t = t.next) {
            Checkpoint cp = t.data;
            System.out.printf("%d. %sCheckpoint – %s – %s – Penalty: %.1f%n",
                    i++, cp.getType(), cp.locationName, cp.isDelayed() ? "Delayed" : "On Time", cp.calculatePenalty());
        }
    }
}

