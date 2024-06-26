package election;

public class ConstituencyTest {
    public static void main(String [] args){
       // Constituency constitute = new Constituency();
        State tg = new State();
        tg.stateName="TG";
        Constituency[] constituencies = new Constituency[2];
        tg.constituencies=constituencies;
        Constituency constituency = new Constituency();
        constituency.name="Hyd";
        constituency.noOfVoters=10000;
        constituency.type= "MP";
        constituency.stateName =tg;
        constituencies[0] = constituency;
        Constituency constituency1= new Constituency();
        constituency1.name = "SEC";
        constituency1.noOfVoters=20000;
        constituency1.type="MLA";
        constituencies[1] = constituency1;
        System.out.println(tg.constituencies[1].type);
        //return tg;

    }
}
