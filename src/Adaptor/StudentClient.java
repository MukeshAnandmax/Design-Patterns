package Adaptor;

import java.util.ArrayList;
import java.util.List;

public class StudentClient {
    public  List<Student> getStudents(){
        List<Student> list = new ArrayList<>();
        SchoolStudent schoolStudent = new SchoolStudent(1,"Sharika","s1@gmail.com");
        CollegeStudent collegeStudent =  new CollegeStudent(12,"mukesh","mu1@gamil.com");


        list.add(schoolStudent);
        list.add(new CollegeStudentAdaptor(collegeStudent));

        return  list;
    }
}
