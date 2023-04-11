package Assn_5;

/* 
Testing code for the Employee Class
*/

public class EmployeeTestDrive {
    public static void main(String[] args) {
        NormalEmployee ne = new NormalEmployee("yashasvi", -69, "janitor", "cleanliness", "15-02-2004", 21000, 0);
        System.out.print(ne.salaryReport());
        BonusEmployee be = new BonusEmployee("om", 21, "CEO", "AI ML", "03-05-2003", 210000, 20);
        System.out.print(be.salaryReport());
    }
}
