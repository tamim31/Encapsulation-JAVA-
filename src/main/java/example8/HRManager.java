
package example8;

public class HRManager extends Employee {

    /**
     *
     * @param s
     */
    public HRManager(int s)
    {
        super(s);
    }

    @Override
    public void work()
    {
        System.out.println("example8.HRManager.work()");
    }
    public void addEmployee()
    {
        System.out.println("example8.HRManager.addEmployee()");
    }
}
