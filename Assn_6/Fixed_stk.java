package Assn_6;

import Assn_6.pkg_Stack.Interface_STK;

/*
Represents a fixed stack of limit 5
*/
public class Fixed_stk implements Interface_STK {
    int[] stack = new int[MAX];
    int top = 0;

    @Override
    public void push(int a) {
        if (top == MAX)
            System.out.println("Can't insert stack full condition");
        else
            stack[top++] = a;
    }

    @Override
    public int pop() {
        if (top == -1)
            return -1;
        else {
            top--;
            return stack[top];
        }
    }

    @Override
    public void displayStkTop() {
        System.out.println("Stack top " + stack[top - 1]);
    }

    @Override
    public void displayStk() {
        System.out.println("Stack elements");
        for (int i = 0; i < top; i++)
            System.out.print(stack[i] + " ");
        System.out.println("\n");
    }
}
