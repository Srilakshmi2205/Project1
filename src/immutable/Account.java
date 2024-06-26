package immutable;

public class Account {
    private String accountNo;
    private String phNo;
    public Account(String accountNo,String phNo){
        this.accountNo = accountNo;
        this.phNo = phNo;

    }
    public String getAccountNo(){
        return accountNo;
    }
    public String getPhNo(){
        return phNo;
    }
}
