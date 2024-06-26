package school;

public class School {
    public String schoolName;
    public String section;
    public int noOfBenches;
    public int noOfStudents;

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", section='" + section + '\'' +
                ", noOfBenches=" + noOfBenches +
                ", noOfStudents=" + noOfStudents +
                ", student=" + student +
                '}';
    }

    public Student student;

}
