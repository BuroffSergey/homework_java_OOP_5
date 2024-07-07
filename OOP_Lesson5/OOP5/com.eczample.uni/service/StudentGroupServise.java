package service;

import java.util.ArrayList;
import java.util.List;

import model.impl.Student;
import model.impl.Teacher;

public class StudentGroupServise {
    
    public StudentGroup CreateStudentGroup( Teacher teacher, List<Student> students, Integer num) {
        ArrayList<Student> listStudents = new ArrayList<>();
        for (Student student : students) {
            listStudents.add(student);
        }
        
        return new StudentGroup(teacher, num, listStudents);
        
    }
}
