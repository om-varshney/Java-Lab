package Assn_6;

import java.util.Objects;

public class Student {
    private String name;
    private int roll_no;
    private int marks_1;
    private int marks_2;

    public Student(String name, int roll_no, int marks_1, int marks_2) {
        this.name = name;
        this.roll_no = roll_no;
        this.marks_1 = marks_1;
        this.marks_2 = marks_2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public int getMarks_1() {
        return marks_1;
    }

    public void setMarks_1(int marks_1) {
        this.marks_1 = marks_1;
    }

    public int getMarks_2() {
        return marks_2;
    }

    public void setMarks_2(int marks_2) {
        this.marks_2 = marks_2;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll_no=" + roll_no +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return roll_no == student.roll_no;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll_no);
    }
}
