package JavaTutorial.Java_Class_Live;

public class Main {
    public static void main(String[] args) {
        float[] marks = new float[5];
        marks[0] = 90;
        marks[1] = 95;
        marks[2] = 40;
        marks[3] = 99;
        marks[4] = 100;
        Student s = new Student("om", "21-25", "AI ML", marks);
        System.out.print(s.calculatePercentage());
        // add other print statements
    }
}
