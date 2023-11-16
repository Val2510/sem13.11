import Controler.Controler;
import Data.Student;
import Data.StudentClass;
import Data.Teacher;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controler controler = new Controler();
        controler.createStudent("1", "1", "1", "1");
        controler.createStudent("2", "2", "2", "2");
        controler.getAllStudent();
        controler.createStudent("3", "3", "3", "3");
        controler.createStudent("4", "4", "4", "4");
        controler.getAllStudent();
        controler.createTeacher("555", "666", "777", "888");
        Teacher teacher = new Teacher("555", "666", "777", "888", 1);
        List<Student> students = List.of(new Student("22", "33", "15", "888", 9), new Student("44", "55", "66", "77", 5), new Student("88", "22", "33", "66", 7));
        StudentClass studentClass = controler.createStudentClass(teacher, students);
        System.out.println(studentClass.getTeacher().toString());
        for (Student student : studentClass.getStudents()) {
            System.out.println(student.toString());
        }
    }
}
