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
        List<String> names = new ArrayList<>();

        for(Student curr : getStudents()){
            names.add(curr.getName());
        }

        return names;
    }

    public List<Double> getAverageGrades() {
        List<Double> scores = new ArrayList<>();

        for(Student curr : getStudents()){
            scores.add(curr.getAverageScore());
        }

        return scores;
    }

    //returns students with average scores greater than 60
    public List<Student> getHighPerformers(){
        List<Student> students = new ArrayList<>();

        for(Student curr : getStudents()){

            if(curr.getAverageScore() > 60) {
                students.add(curr);
            }
        }

        return students;
    }

    //returns the student with the highest average score
    public Student getBestStudent(){
        Student bestStudent = null;

        if(students.size() > 0){
            bestStudent = students.get(0);
        }

        for (Student curr : students){
            if(curr.getAverageScore() > bestStudent.getAverageScore()) {
                bestStudent = curr;
            }
        }

        return bestStudent;
    }

    //returns "Sam, James, Sarah, Jen"
    public String getNameString(){
        String nameString = "";

        for(Student curr : students){
            // add the name of the current student to the string :o)
        }

        return nameString;
    }

    //returns a list of all students' test scores
    public List<Double> getAllTestScores(){

    }
}
