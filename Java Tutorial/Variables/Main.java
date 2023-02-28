public class Main {
    public static void main(String[] args) {
        // Can't declare variable multiple times.
        int AGE = 19;
        // int AGE = 20; ERR!
        // AGE = 20; VALID.
        System.out.println("I am " + AGE + " years old.");
        ClassVariable cv = new ClassVariable();
        cv.printAge();
    }
}

class ClassVariable {
    static int AGE = 27;

    public void printAge() {
        System.out.println("I am " + AGE + " years old.");
    }
}