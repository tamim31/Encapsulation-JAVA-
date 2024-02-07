
package example8;

public class Employee {
    private int s;
   public Employee(int s)
    {
        this.s=s;
    }
    public int getSalary()
    {
        return s;
    }
    public void work()
    {
        System.out.println("example8.Employee.work()");
    }
}
