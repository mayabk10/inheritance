import java.util.Date;

public class Person {
    protected  String Id;
    protected  String LastName;
    protected  String FirstName;
    protected  String Address;
    protected Date BirthDate;

    public Person(String id, String lastName, String firstName, String address, Date birthDate) {
        Id = id;
        LastName = lastName;
        FirstName = firstName;
        Address = address;
        BirthDate = birthDate;
    }

    public Date getBirthDate() {
        return BirthDate;
    }
}










