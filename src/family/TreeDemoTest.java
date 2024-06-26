package family;

public class TreeDemoTest {
    public static void main(String[] args){
        Family test = new Family();// here creating object
        test = new Family();// assign the new object to test ref so the above object is eligible for garbage collection
        test = new Family();//assign the new object to test ref so the above object is eligible for garbage collection
        test = new Family();//assign the new object to test ref so the above object is eligible for garbage collection
        test.name = "A";
        Family ref = test;
        Family ref1 = test;
        ref1.name = "B";
        Family ref2 = test;
        Family a = new Family();
        a.name = "A";
        Family b = new Family();
        a.name= "B";
        a = new Family();
        test = a;
        System.out.println(ref2.name);
        System.out.println(ref.name);

        //aAddress.pinCode="1";
        //address.area="Hyd";
        //aAddress.city="Hyd";
        //aAddress.flatNo="305";
        //aAddress.country="India";
        //a.name="A";
        //a.address=aAddress;
        //Family[] aKids = new Family[2];
        //Family b = new Family();
        //Address baAddress=new Address();
        //baAddress.pinCode="1";
        //baAddress.area="hyd";
        //baAddress.city="hyd";
        //baAddress.flatNo="305";
        //baAddress.country="India";
        //a.name="B";

    }
}
