import java.util.Arrays;
import java.util.List;

public class Program {

    public static void main(String[] args){
        List<Student> students = Arrays.asList(
                new Student("Sam", 0, "sam@uni.edu"),
                new Student("James", 1, "james@uni.edu"),
                new Student("Sarah", 2, "sarah@uni.edu"),
                new Student("Jen", 3, "jen@uni.edu")
        );

        Lecturer l = new Lecturer("James bond", 0, 1, "jamesbond@uni.edu");

        Course c = new Course("Java for beginners", l, students);
    }
}
