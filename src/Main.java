import java.util.Date;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        List<Employee> Employees = List.of();
        double total=0;
        double tax = 0;
        Date today = new Date(2024,10,26);
        System.out.println(Employees.size());
        for(Employee employee:Employees){
            total= employee.Salary();
            if(employee.getBirthDate().getMonth() == today.getMonth() ) {
                total+=300;
            }
            if(today.getYear() - employee.getStartD().getYear() == 5){
                total += 1000;
            }
            if(today.getYear() - employee.getStartD().getYear() == 10){
                total +=2000;

            }
            tax += total *0.35;
            System.out.println(employee + "," + total   + "," + total*0.65);
        }


    }
}
