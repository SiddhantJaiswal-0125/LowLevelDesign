public class Main {
    public static void main(String[] args) {
       try{
           EmployeeDAO empTableObj = new EmployeeDAOProxy();
           empTableObj.create("ADMIN", new EmployeeDo());
           System.out.println("Operation Successful");
       }
       catch (Exception e)
       {
           System.out.println(e.getMessage());
       }
    }
}