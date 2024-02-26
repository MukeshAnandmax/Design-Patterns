package Adaptor;

public class CollegeStudentAdaptor implements  Student{

    private int id;
    private String name;
    private String email;

    public  CollegeStudentAdaptor( CollegeStudent collegeStudent){
        this.id = collegeStudent.getId();
        this.email =collegeStudent.getEmail();
        this.name = collegeStudent.getName();
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getEmail() {
        return this.email;
    }


    @Override
    public String toString() {
        return "CollegeStudentAdaptor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
