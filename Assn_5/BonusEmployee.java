package Assn_5;

public class BonusEmployee extends NormalEmployee {
    public BonusEmployee(
        String name, 
        int EID, 
        String designation, 
        String department,
        String DOJ,
        double grossWage,
        int leavesTaken
    ) {
        super(
                name,
                EID,
                designation,
                department,
                DOJ,
                grossWage,
                leavesTaken);
    }

    public double bonus() {
        return this.basicWage() * 0.69;
    }
}
