package school;

public class SchoolTest {
    public static void main(String[] args){
        Address A1 = new Address();
        Student stu = new Student();
        School scl = new School();
        A1.flatNo="504";
        A1.street="Dmart";
        A1.state="Telangana";
        A1.city="Hyd";
        stu.address=A1;
        stu.studentName="Sri";
        stu.age=22;
        stu.gender="Female";
        stu.mobile="900022134";
        scl.student=stu;
        scl.schoolName="ModelScl";
        scl.noOfStudents=400;
        scl.section="A";
        scl.noOfBenches=80;
        System.out.println(stu);




    }
}
