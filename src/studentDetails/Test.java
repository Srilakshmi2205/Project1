package studentDetails;

public class Test {
    public static void main(String[] args){
        Address A1 = new Address();
        Student S1 = new Student();
        A1.flatNO="401";
        A1.street="KPHB";
        A1.city="HYD";
        A1.pincode="500090";
        S1.name="SRI";
        S1.gender="F";
        S1.mobile="910088867";
        S1.address=A1;
        System.out.println(S1);

    }
}
