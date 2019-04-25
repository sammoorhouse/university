import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Student {
    private String name;
    private int studentId;
    private String emailAddress;
    private Map<String, Double> scores = new HashMap<String, Double>();

    public Student(String name, int studentId, String emailAddress) {
        this.name = name;
        this.studentId = studentId;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void Scored(String test, Double score){
        this.scores.put(test, score);
    }

    public double getAverageScore(){
        double averageScore = 0.0;
        int count = 0;

        for(double score : scores.values()){
            count++;
            averageScore += score;
        }

        return averageScore / count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId &&
                Objects.equals(name, student.name) &&
                Objects.equals(emailAddress, student.emailAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentId, emailAddress);
    }
}
