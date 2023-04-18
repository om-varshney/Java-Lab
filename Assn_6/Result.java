package Assn_6;

/*
This class extends Student and Implements Exam. It is able to register a student and display their marks.
*/
public class Result extends Student implements Exam {
    public Result(String name, int roll_no, int marks_1, int marks_2) {
        super(name, roll_no, marks_1, marks_2);
    }

    @Override
    public double percent_call() {
        return (double) (this.getMarks_1() + this.getMarks_2()) / 2;
    }

    public void display() {
        System.out.println("Result{" +
                "name='" + this.getName() + '\'' +
                ", roll_no=" + this.getRoll_no() +
                "}\n" +
                "Percentage: " + this.percent_call()
        );
    }
}
