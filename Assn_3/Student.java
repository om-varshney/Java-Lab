public class Student {
    private String prn;
    private String name;
    private String dob;
    private int marks;

    public Student(String prn, String name, String dob, int marks) {
        this.prn = prn;
        this.name = name;
        this.dob = dob;
        this.marks = marks;
    }

    public String getPRN() {
        return prn;
    }

    public String getName() {
        return name;
    }

    public String getDOB() {
        return dob;
    }

    public int getMarks() {
        return marks;
    }

    public void setPRN(String prn) {
        this.prn = prn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDOB(String dob) {
        this.dob = dob;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "PRN: " + prn + "\n" +
                "Name: " + name + "\n" +
                "Date of Birth: " + dob + "\n" +
                "Marks: " + marks;
    }
}


