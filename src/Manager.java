import java.util.Date;

public class Manager extends Employee{
    protected double MonthlySalary;

    public Manager(String id, String lastName, String firstName, String address, Date birthDate, String empId, String department, Date startD, double monthlySalary) {
        super(id, lastName, firstName, address, birthDate, empId, department, startD);
        MonthlySalary = monthlySalary;
    }

    @Override
    double Salary(){
        return this.MonthlySalary;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "EmpId='" + EmpId + '\'' +
                ", Department='" + Department + '\'' +
                ", StartD=" + StartD +
                ", Id='" + Id + '\'' +
                ", LastName='" + LastName + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", Address='" + Address + '\'' +
                ", BirthDate=" + BirthDate +
                '}';
    }
}