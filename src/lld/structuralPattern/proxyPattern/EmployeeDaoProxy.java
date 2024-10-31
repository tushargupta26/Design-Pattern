package lld.structuralPattern.proxyPattern;

public class EmployeeDaoProxy implements EmployeeDao{

    EmployeeDao employeeDaoObj;

    EmployeeDaoProxy() {
        employeeDaoObj = new EmployeeDaoImpl();
    }
    @Override
    public void create(String client, EmployeeDo obj1) throws Exception {
        if(client.equals("ADMIN")){
            employeeDaoObj.create(client, obj1);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public void delete(String client, EmployeeDo obj1) throws Exception {
        if(client.equals("ADMIN")){
            employeeDaoObj.delete(client, obj1);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public EmployeeDo get(String client, int empId) throws Exception {
        if(client.equals("ADMIN") || client.equals("USER")){
//            employeeDaoObj.create(client, obj1);
            return employeeDaoObj.get(client, empId);
        }
        throw new Exception("Access Denied");
    }
}
