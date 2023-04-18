package Assn_6;

import Assn_6.pkg_Stack.Interface_STK;

import java.util.Vector;

/*
Growable stack implemented through java vectors.
*/
public class Growable_stk implements Interface_STK {
    Vector<Integer> stack = new Vector<>();

    @Override
    public void push(int a) {
        this.stack.add(a);
    }

    @Override
    public int pop() {
        return this.stack.remove(stack.size() - 1);
    }

    @Override
    public void displayStkTop() {
        System.out.println("Stack top " + this.stack.get(this.stack.size() - 1));
    }

    @Override
    public void displayStk() {
        System.out.println("Stack elements");
        for (Integer integer : this.stack) System.out.print(integer + " ");
        System.out.println("\n");
    }
}
