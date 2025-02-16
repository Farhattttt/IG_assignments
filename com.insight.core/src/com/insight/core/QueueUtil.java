package com.insight.core;


import java.util.LinkedList;
import java.util.Queue;

public class QueueUtil<T> {
    private LinkedList<T> queue;

    
    public QueueUtil() {
        this.queue = new LinkedList<>();
    }

    public void enqueue(T element) {
        queue.addLast(element);
    }

    public T dequeue() throws IllegalStateException {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty. Cannot dequeue.");
        }
        return queue.removeFirst();
    }


    public T peek() {
        if (isEmpty()) {
            return null; 
        }
        return queue.getFirst();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

 
    public int size() {
        return queue.size();
    }

   
    public void clear() {
        queue.clear();
    }
    
  
    public void printQueue() {
        System.out.println(queue);
    }


    public static void main(String[] args) {
    
        QueueUtil<Integer> intQueue = new QueueUtil<>();
        intQueue.enqueue(10);
        intQueue.enqueue(20);
        intQueue.enqueue(30);
        System.out.println("Queue of Integers: " + intQueue.peek()); 
        intQueue.printQueue();
        
        try {
            System.out.println("Dequeued element: " + intQueue.dequeue()); 
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

       
        QueueUtil<Float> floatQueue = new QueueUtil<>();
        floatQueue.enqueue(10.5f);
        floatQueue.enqueue(20.75f);
        floatQueue.enqueue(30.25f);
        System.out.println("Queue of Floats: " + floatQueue.peek()); 
        floatQueue.printQueue();

        try {
            System.out.println("Dequeued element: " + floatQueue.dequeue()); 
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }


        QueueUtil<Object> objectQueue = new QueueUtil<>();
        objectQueue.enqueue("String Element");
        objectQueue.enqueue(100);
        objectQueue.enqueue(3.14);
        System.out.println("Queue of Objects: " + objectQueue.peek());
        objectQueue.printQueue();
    }
}

