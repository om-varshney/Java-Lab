package Assn_6.pkg_Stack;

/*
Blue-print for the implementation of fixed and growable stack
*/
public interface Interface_STK {
    int MAX = 5;

    void push(int a);

    int pop();

    void displayStkTop();

    void displayStk();

}