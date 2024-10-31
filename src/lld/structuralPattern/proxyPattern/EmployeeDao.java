package lld.structuralPattern.proxyPattern;

public interface EmployeeDao {

    public void create(String client, EmployeeDo obj1) throws Exception;
    public void delete(String client, EmployeeDo obj1) throws Exception;
    public EmployeeDo get(String client, int empId) throws Exception;

}
