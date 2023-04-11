package Assn_5;

/* 
This is the normal employee class which implements all abstract methods from the EmployeeBase.
It acts as parent to BonusEmployee.
*/

public class NormalEmployee extends EmployeeBase{
    public NormalEmployee(
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
    
    public double basicWage() {
        return (this.grossWage / this.TWD) * (this.TWD - this.LOP) * 0.45;
    }

    public double HRA() {
        return this.basicWage() * 0.4;
    }

    public double coveyanceAllowance() {
        return (1600 / this.TWD) * (this.TWD - this.LOP);
    }

    public double medicalAllowance() {
        return (1250 / this.TWD) * (this.TWD - this.LOP);
    }

    public double otherAllowance() {
        return ((this.grossWage / this.TWD) * (this.TWD - this.LOP)) - (this.basicWage() + this.HRA()
                + this.coveyanceAllowance() + this.medicalAllowance());
    }

    public double EPF() {
        if (this.basicWage() > 15000) {
            return 15000 * 0.12;
        } else {
            return this.basicWage() * 0.15;
        }
    }

    public double totalEarnings() {
        return this.basicWage() + this.HRA() + this.coveyanceAllowance() + this.medicalAllowance()
                + this.otherAllowance();
    }

    public double ESI() {
        if (this.basicWage() < 21000) {
            return this.totalEarnings() * 0.0075;
        } else {
            return 0.0;
        }
    }

    public double totalDeductions() {
        return this.EPF() + this.ESI() + this.professionalTax() + this.loanRecovery();
    }

    public double netSalary() {
        return this.totalEarnings() - this.totalDeductions() + this.bonus();
    }

    public String salaryReport() {
        return (
            "\t\tSIT, Pune\n" +
            "\t\tLavale\n" +
            "\t\tPay Slip for April, 2023\n" +
            "Name:                \t" + this.name + "\n" +
            "Employee ID:         \t" + this.EID + "\n" +
            "Designation:         \t" + this.designation + "\n" +
            "Department:          \t" + this.department + "\n" +
            "DOJ:                 \t" + this.DOJ + "\n" +
            "Gross Wage:          \t" + this.grossWage + "\n" +
            "Total Working Days:  \t" + this.TWD + "\n" +
            "LOP Days:            \t" + this.LOP + "\n" +
            "Paid Days:           \t" + (this.TWD - this.LOP) + "\n" + 
            "\tEarnings\t\t\tDeductions\n" +
            "Basic Wage:          \t" + this.basicWage() + "\t" + "EPF:             \t" + this.EPF() + "\n" +
            "HRA:                 \t" + this.HRA() + "\t" + "ESI:             \t" + this.ESI() + "\n" +
            "Conveyance Allowance:\t" + this.coveyanceAllowance() + "\t" + "Professional Tax:\t" + this.professionalTax() + "\n" +
            "Medical Allowance:   \t" + this.medicalAllowance() + "\t" + "Loan Recovery:   \t" + this.loanRecovery() + "\n" +
            "Other Allowances:    \t" + this.otherAllowance() + "\t" +
            "Total Earnings:      \t" + this.totalEarnings() + "\t" + "Total Deductions:\t" + this.totalDeductions() + "\n" +
            "Net Salary:          \t" + this.netSalary() + "\n"
        );
    }
}
