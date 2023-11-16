package Data;

import java.util.List;

public class StudentClass {
    private Teacher teacher;
    private List<Student> student;

    public StudentClass(Teacher teacher, List<Student> student) {
        this.teacher = teacher;
        this.student = student;
    }
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return student;
    }

    public void setStudents(List<Student> students) {
        this.student = students;
    }
}
