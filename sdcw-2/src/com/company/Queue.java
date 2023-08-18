package com.company;

import java.util.Scanner;


public class Queue extends Passenger {

    private int queSize = 12;
    private int front, rear;
    private Passenger items[] = new Passenger[queSize];

    public Queue() {
        front = -1;
        rear = -1;
    }

    public void setFront(int front) {
        this.front = front;
    }

    public void setRear(int rear) {
        this.rear = rear;
    }

    public int getRear() {
        return rear;
    }

    public void setItems(Passenger[] items) {
        this.items = items;
    }

    // Checking if the queue is full
    public boolean isFull() {
        if (front == 0 && rear == queSize - 1){
            return true;
        }
        if (front == rear +1) {
            return true;
        }
        return false;
    }

    // Checking if the queue is empty
     public boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }

    // Adding an element to queue
    public void addQue(Passenger passenger) {

        if (isFull()) {
            System.out.println("The Queue is Full...");
        } else {

            if (front == -1)
                front = 0;
            rear = (rear + 1) % queSize;
            items[rear] = passenger;
            System.out.println("All cabins are full. Passenger " + passenger.getFirst_name() + " added to the waiting list");
        }
    }

    // Removing an element in queue
    public Passenger deQueue() {
        Passenger element;

        element = items [front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } /* Q has only one element, so we reset the queue after deleting it. */
        else {
            front = (front + 1) % queSize;
        }
        return (element);

    }

}
