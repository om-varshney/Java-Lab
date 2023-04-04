package JavaTutorial.Java_Class_Live;

public class Student implements StudentInterface {
    private String name;
    private String batch;
    private String branch;
    private float[] marks;

    Student(String name, String batch, String branch, float[] marks) {
        this.name = name;
        this.batch = batch;
        this.branch = branch;
        this.marks = marks;
    }

    public float calculatePercentage() {
        float sum = 0;
        for (float i : this.marks) {
            sum += i;
        }
        return sum / 5;
    }
}
