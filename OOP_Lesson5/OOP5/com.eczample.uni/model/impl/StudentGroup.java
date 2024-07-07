package model.impl;

import java.util.List;

public class StudentGroup {

    private Teacher teacher;
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    private Integer numberGroupId;
    public Integer getNumberGroupId() {
        return numberGroupId;
    }

    public void setNumberGroupId(Integer numberGroupId) {
        this.numberGroupId = numberGroupId;
    }

    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public StudentGroup(Teacher teacher, Integer numberGroup, List<Student> students) {
        this.teacher = teacher;
        this.numberGroupId = numberGroup;
        this.students = students;
    }
    
}