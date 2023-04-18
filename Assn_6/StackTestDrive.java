package Assn_6;

public class StackTestDrive {
    public static void main(String[] args) {
        System.out.println("Operations on Fixed Stack");
        Fixed_stk fixed = new Fixed_stk();
        fixed.push(1);
        fixed.push(2);
        fixed.push(3);
        fixed.push(4);
        fixed.push(5);
        fixed.displayStkTop();
        if (fixed.top == -1)
            System.out.println("Stack Empty can't remove");
        else
            System.out.println("Pop operation " + fixed.pop());
        fixed.displayStk();

        System.out.println("Operations on Growable Stack");
        Growable_stk growable = new Growable_stk();
        growable.push(1);
        growable.push(2);
        growable.push(3);
        growable.push(4);
        growable.push(5);
        growable.push(6);
        growable.push(7);
        growable.push(8);
        growable.push(9);
        growable.displayStkTop();
        System.out.println("Pop operation " + growable.pop());
        growable.displayStk();
    }
}