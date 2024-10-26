import java.util.Date;

public abstract class Employee extends Person{
    protected String EmpId;
    protected String Department;
    protected Date StartD;
    abstract  double Salary();

    public Employee(String id, String lastName, String firstName, String address, Date birthDate, String empId, String department, Date startD) {
        super(id, lastName, firstName, address, birthDate);
        EmpId = empId;
        Department = department;
        StartD = startD;
    }

    public Date getStartD() {
        return StartD;
    }
}