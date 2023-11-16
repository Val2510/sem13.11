package Controler;

import Data.*;
import Service.DataService;
import Service.StudentClassService;
import View.StudentView;
import View.TeacherView;

import java.util.List;

public class Controler {
    private final DataService service = new DataService();
    private final StudentView studentView = new StudentView();
    private final TeacherView teacherView = new TeacherView();

    private StudentClassService studentClassService;

    public void StudentClassControler() {
        this.studentClassService = new StudentClassService();
    }

    public void createStudent(String firstName, String secondName,
                              String lastName, String dateB){
        service.create(firstName,secondName,lastName,dateB, Type.STUDENT);
    }

    public void getAllStudent(){
        List<User> userList = service.getAllStudent();
        for (User user: userList){
            studentView.printOnConsole((Student) user);
        }
    }
    public void createTeacher(String firstName, String secondName,
                              String lastName, String dateB){
        service.create(firstName,secondName,lastName,dateB, Type.TEACHER);
    }
    public void getAllTeacher(){
        List<User> userList = service.getAllTeacher();
        for (User user: userList){
            TeacherView.printOnConsole((Teacher) user);
        }
    }
    public StudentClass createStudentClass(Teacher teacher, List<Student> students){
        return StudentClassService.createStudentClass(teacher, students);
    }
    public StudentClassService getStudentClassService() {
        return studentClassService;
    }
}
