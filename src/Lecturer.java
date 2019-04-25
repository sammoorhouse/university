import java.util.Objects;

public class Lecturer {
    private String name;
    private int lecturerId;
    private int schoolId;
    private String emailAddress;

    public Lecturer(String name, int lecturerId, int schoolId, String emailAddress) {
        this.name = name;
        this.lecturerId = lecturerId;
        this.schoolId = schoolId;
        this.emailAddress = emailAddress;

    }

    public String getName() {

        return name;
    }

    public int getLecturerId() {
        return lecturerId;
    }

    public int getSchoolId() {
        return schoolId;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lecturer lecturer = (Lecturer) o;
        return lecturerId == lecturer.lecturerId &&
                schoolId == lecturer.schoolId &&
                Objects.equals(name, lecturer.name) &&
                Objects.equals(emailAddress, lecturer.emailAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lecturerId, schoolId, emailAddress);
    }
}
