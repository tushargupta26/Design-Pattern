package lld.structuralPattern.proxyPattern;

public class ProxyDesignPattern {
    public static void main(String[] args) {
        try {
            EmployeeDao empTableObj = new EmployeeDaoProxy();
            empTableObj.create("USER", new EmployeeDo());
            System.out.println("Operation Successful");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
