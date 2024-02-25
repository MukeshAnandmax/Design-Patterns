package Builder;

public class BuilderClient {

    public static void main(String[] args) {
        Employee employee = new Employee.EmployeeBuilder(1, "Sumit", 33).homeTown("patna").hasBike(false).hasCar(true).build();
        System.out.println(employee.toString());
    }
}
