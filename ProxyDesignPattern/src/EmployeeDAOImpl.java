public class EmployeeDAOImpl implements EmployeeDAO{

    @Override
    public void create(String client, EmployeeDo obj) throws Exception {
        //Create a new ROW
        System.out.println("Created new Row in Employee Table");

    }

    @Override
    public void delete(String client, int employeeId) throws Exception {

        // Delete a Row
        System.out.println("Deleted row with Employee ID : "+employeeId);

    }

    @Override
    public EmployeeDo get(String client, int employeeId) throws Exception {
       //Fetch Row
        System.out.println("Fetching Data from the DB");
        return new EmployeeDo();
    }
}
