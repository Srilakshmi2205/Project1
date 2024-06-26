package election;

public class ElectionService {
    public State getstate(){
        State tg = new State();
        tg.stateName="TG";
        Constituency[] constituencies = new Constituency[2];
        Constituency constituency = new Constituency();
        tg.constituencies=constituencies;
        constituency.name="Hyd";
        constituency.noOfVoters=10000;
        constituency.type= "MP";
        constituency.stateName =tg;
        constituencies[0]=constituency;
        return tg;
    }
}
