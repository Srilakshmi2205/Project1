package immutable;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "A";
        student.name = "B";
        System.out.println(student.name);
    }
}
