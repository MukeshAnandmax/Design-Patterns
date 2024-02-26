package Adaptor;

import java.util.List;

public class AdaptorClient {

    //https://www.youtube.com/watch?v=eR22JuwTa54
    public static void main(String[] args) {
        StudentClient studentClient =  new StudentClient();
        List<Student> students = studentClient.getStudents();
        System.out.println( students);
    }
}
