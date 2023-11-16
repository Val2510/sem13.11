package Service;

import Data.Student;
import Data.StudentClass;
import Data.Teacher;

import java.util.List;


public class StudentClassService {
    public static StudentClass createStudentClass(Teacher teacher, List<Student> students){
        return new StudentClass(teacher, students);
    }
}
