package Builder;
public class Employee {

    private int empId;
    private  String name;
    private int age;
    private boolean married; //Optional field
    private boolean hasBike; //Optional field
    private boolean hasCar; //Optional field
    private String homeTown; //Optional field


    //Constructor that take builder object to create base class
    public Employee(EmployeeBuilder eBuild){
        this.empId = eBuild.empId;
        this.name = eBuild.name;
        this.age =eBuild.age;
        this.hasCar =eBuild.hasCar;
        this.hasBike = eBuild.hasBike;
        this.homeTown = eBuild.homeTown;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", married=" + married +
                ", hasBike=" + hasBike +
                ", hasCar=" + hasCar +
                ", homeTown='" + homeTown + '\'' +
                '}';
    }
    //Static inner builder class
    /********************************************************************************************************************/
    public static class EmployeeBuilder {
        private int empId;
        private  String name;
        private int age;
        private boolean married; //Optional field
        private boolean hasBike; //Optional field
        private boolean hasCar; //Optional field
        private String homeTown; //Optional field

        public EmployeeBuilder(int empId, String name, int age) {
            this.empId = empId;
            this.name = name;
            this.age = age;
        }

        public  EmployeeBuilder hasBike(boolean hasBike){
            this.hasBike=hasBike;
            return  this;
        }

        public  EmployeeBuilder hasCar(boolean hasCar){
            this.hasCar=hasCar;
            return  this;
        }
        public  EmployeeBuilder married(boolean married){
            this.married=married;
            return  this;
        }

        public  EmployeeBuilder homeTown(String homeTown){
            this.homeTown=homeTown;
            return  this;
        }

        public  Employee build( ){
            return  new Employee(this);
        }
    }
    /********************************************************************************************************************/




}
