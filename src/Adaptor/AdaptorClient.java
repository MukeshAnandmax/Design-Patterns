package Adaptor;

import java.util.List;

public class AdaptorClient {
    public static void main(String[] args) {
        StudentClient studentClient =  new StudentClient();
        List<Student> students = studentClient.getStudents();
        System.out.println( students);
    }
}
