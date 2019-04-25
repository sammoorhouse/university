import java.util.ArrayList;
import java.util.List;

public class Course {
    private  String courseName;
    private  Lecturer lecturer;
    private List<Student> students;

    public Course(String courseName, Lecturer lecturer, List<Student> students) {
        this.courseName = courseName;
        this.lecturer = lecturer;
        this.students = students;
    }

    public String getCourseName() {
        return courseName;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<String> getStudentNames(){
        List<String> names = new ArrayList<String>();
        for(Student curr : getStudents()){
            names.add(curr.getName());
        }

        return names;
    }
}
