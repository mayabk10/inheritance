import java.util.Date;

public class SalesMan extends Employee{
    protected double TotalSales;

    public SalesMan(String id, String lastName, String firstName, String address, Date birthDate, String empId, String department, Date startD, double totalSales) {
        super(id, lastName, firstName, address, birthDate, empId, department, startD);
        TotalSales = totalSales;
    }

    @Override
    double Salary(){
      return this.TotalSales * 0.15;
    }

    @Override
    public String toString() {
        return "SalesMan{" +
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