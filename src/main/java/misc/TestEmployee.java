package misc;

public class TestEmployee {

    public static void main(String args[])
    {
        Email email = new outLookEmail();
        Employee emp1 = new Employee(0001,"venoth",email);
        emp1.notifyEmployee();

        email = new WebServiveEmail();
        Employee emp2 = new Employee(0002,"Indu",email);
        emp2.notifyEmployee();

    }
}
