package com.insightglobal.day5;

import java.time.LocalDate;
import java.util.EmptyStackException;

public class Stack {
    private static final int MAX_SIZE = 10;
    private Contact[] stackArray;
    private int top;

    public Stack() {
        stackArray = new Contact[MAX_SIZE];
        top = -1;
    }

    public void push(Contact contact) throws StackOverflowException {
        if (top == MAX_SIZE - 1) {
            throw new StackOverflowException("Stack is full, can't push more elements.");
        }
        stackArray[++top] = contact;
    }

    public Contact pop() throws StackUnderflowException {
        if (top == -1) {
            throw new StackUnderflowException("Stack is empty, can't pop elements.");
        }
        return stackArray[top--];
    }
}