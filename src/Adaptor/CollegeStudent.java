package Adaptor;

public class CollegeStudent {
    private int id;
    private String name;
    private String email;

    public CollegeStudent(int id, String name, String email) {

        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "CollegeStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

