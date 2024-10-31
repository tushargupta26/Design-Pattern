package lld.structuralPattern.proxyPattern;

public class EmployeeDaoImpl implements EmployeeDao{

    @Override
    public void create(String client, EmployeeDo obj1) throws Exception {
        System.out.println("Create new row in emp table");
    }

    @Override
    public void delete(String client, EmployeeDo obj1) throws Exception {
        System.out.println("Deleted row in emp table");
    }

    @Override
    public EmployeeDo get(String client, int empId) throws Exception {
        System.out.println("fetching data from emp table");
        return new EmployeeDo();
    }
}
