import java.util.ArrayList;

public class StudentArray {

        Student stu;
        ArrayList<Student> students = new ArrayList<>();
        public void addStudent(Student x)
        {
            students.add(x);
        }

        @Override
        public String toString() {
            return "students= " + students;
        }
    }

