public class EmployeeDAOProxy implements  EmployeeDAO{

    EmployeeDAOImpl employeeDAO;
    EmployeeDAOProxy()
    {
        employeeDAO = new EmployeeDAOImpl();
    }
    @Override
    public void create(String client, EmployeeDo obj) throws Exception {
        if(client.equalsIgnoreCase("ADMIN"))
        {
            employeeDAO.create(client, obj);
            return;
        }
        throw  new Exception("Access Denied");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {

        if(client.equalsIgnoreCase("ADMIN"))
        {
            employeeDAO.delete(client, employeeId);
        return;
        }
        throw new Exception("Access Denied");

    }

    @Override
    public EmployeeDo get(String client, int employeeId) throws Exception {
        if(client.equalsIgnoreCase("ADMIN") || client.equalsIgnoreCase("USER"))
        {
            return employeeDAO.get(client, employeeId);
        }
        throw  new Exception("Access Denied");
    }
}
