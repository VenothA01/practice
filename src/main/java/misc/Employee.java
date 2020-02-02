package misc;

public class Employee {

    int     empId ;
    String  empName ;
    double  salary ;
    int     grade ;
    static String  company = "Trimble";
    Email email ;


    public double getSalary() {
        return salary;
    }


    public void notifyEmployee()
    {
        email.sendEmail();
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Employee(int empId, String empName,Email email)
    {
        this.empId      = empId ;
        this.empName    = empName ;
        this.email      = email ;

    }



}
