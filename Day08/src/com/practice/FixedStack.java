package com.practice;

public class FixedStack implements Stack {

    private Employee[] stack;
    private int top;

    public FixedStack() {

        stack = new Employee[STACK_SIZE];
        top = -1;
    }

    @Override
    public void push(Employee e) {
        if (top == STACK_SIZE - 1) {
            System.out.println("Stack is Full !!!");
            return;
        }

        top++;
        stack[top] = e;
    }

	@Override
	public Employee pop() {
		if (top == -1) {
			System.out.println("Stack is empty!!");
			return null;
		}
		Employee e = stack[top];
		stack[top] = null;
		top--;
		return e;
	}
    
}