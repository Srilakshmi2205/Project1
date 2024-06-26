package immutable;

public class Payment {
    private double amount;
    private String fromAccount;
    private String toAccount;
    private String phNo;
    public Payment(double amount,String fromAccount,String toAccount,String phNo){
        this.amount=amount;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.phNo = phNo;
    }
    public double getAmount(){
        return this.amount;
    }
    public String getFromAccount(){
        return this.fromAccount;
    }
    public String getToAccount(){
        return this.toAccount;

    }
    public String getPhNo(){
        return this.phNo;
    }
}
