package qltv;

/**
 *
 * @author AS
 */
public class Staff extends Person{
    protected double salary;

    public Staff(double salary, int idnum, String name, String address, String phoneNo) {
        super(idnum, name, address, phoneNo);
        this.salary = salary;
    }

    public void printInfo()
    {
        super.printInfo();
        System.out.println("Salary: " + salary + "\n");         
    }
    
    public double getSalary()
    {
        return salary;
    }
}
