package controller;

import java.util.ArrayList;
import java.util.List;

import model.impl.Student;
import model.impl.Teacher;
import view.StudentGroupView;
import view.StudentView;
import view.TeacherView;

public class StudentGroupController {
    
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final StudentView studentView = new StudentView();
    public StudentView getStudentView() {
        return studentView;
    }
    private final TeacherView teacherView = new TeacherView();
    public TeacherView getTeacherView() {
        return teacherView;
    }
    private final StudentGroupView studentGroupView = new StudentGroupView();


    public void createStudentGroup(Integer teacherId, List<Integer> studentIdList){
        Object dataBase;
        Object teachersDB;
        Teacher teacher = (Teacher) dataBase.getUserById(teachersDB);
        List<Student> studentList = new ArrayList<>();
        for (Integer id:studentIdList) {
            studentList.add((Student) dataBase.getUserById(studentsDB));
        }
        studentGroupService.createStudentGroup(teacher,studentList);
    }
    public void printStudentGroup(){
        studentGroupView.sendOnConsole(studentGroupService.getStudentGroup());
    }
    
}
