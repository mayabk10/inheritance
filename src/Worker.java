import java.util.Date;

public class  Worker extends Employee{
    protected double BaseSalary;
    protected double WorkingHours;

    public Worker(String id, String lastName, String firstName, String address, Date birthDate, String empId, String department, Date startD, double baseSalary, double workingHours) {
        super(id, lastName, firstName, address, birthDate, empId, department, startD);
        BaseSalary = baseSalary;
        WorkingHours = workingHours;
    }

    @Override
    double Salary (){
        return this.BaseSalary*this.WorkingHours;
    }

    @Override
    public String toString() {
        return "Worker{" +
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
