package com.practice;

public class GrowableStack implements Stack {

    private Employee[] stack;
    private int top;

    public GrowableStack() {
        stack = new Employee[STACK_SIZE];
        top = -1;
    }

    @Override
    public void push(Employee e) {

        if (top == stack.length - 1) {

            Employee[] temp =
                    new Employee[stack.length * 2];

            for (int i = 0; i < stack.length; i++) {
                temp[i] = stack[i];
            }

            stack = temp;
        }

        top++;
        stack[top] = e;
    }

    @Override
    public Employee pop() {

        if (top == -1) {
            System.out.println("Stack is Empty !!!");
            return null;
        }

        Employee e = stack[top];
        stack[top] = null;
        top--;

        return e;
    }
}