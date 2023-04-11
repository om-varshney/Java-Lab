package Assn_5;

/* 
This is the abstract class which represents all the properties of the employee. It acts as the parent
class to NormalEmployee and BonusEmployee.
*/

public abstract class EmployeeBase {
    public String name;
    public int EID;
    public String designation;
    public String department;
    public String DOJ;
    public double grossWage;
    public int TWD = 30;
    public int LOP = 1;
    public int leavesTaken;

    public EmployeeBase(
        String name, 
        int EID, 
        String designation, 
        String department,
        String DOJ,
        double grossWage,
        int leavesTaken
    ) {
        this.name = name;
        this.EID = EID;
        this.designation = designation;
        this.department = department;
        this.DOJ = DOJ;
        this.grossWage = grossWage;
        this.leavesTaken = leavesTaken;
    }
    
    public abstract double basicWage();

    public abstract double EPF();

    public abstract double HRA();

    public abstract double ESI();

    public abstract double coveyanceAllowance();

    public abstract double medicalAllowance();

    public abstract double otherAllowance();

    public abstract double totalEarnings();

    public abstract double totalDeductions();

    public double professionalTax() {
        return 0.0;
    }

    public double loanRecovery() {
        return 0.0;
    }

    public double bonus() {
        return 0;
    }

}
