public class Account {
    String name;
    String accountnumber;
    double balance;
    Account(String name,String accountnumber,double balance){
        this.name=name;
        this.accountnumber=accountnumber;
        this.balance=balance;
    }
 public String getName(){
        return name;
 }
 public void setName(String name){
        this.name=name;
 }
    public String getAccountnumber(){
        return accountnumber;
    }
    public void setAccountnumber(String accountnumber){
        this.accountnumber=accountnumber;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public void withdraw(double amount){
        balance=balance-amount;
    }
    public void deposit(double amount){
        balance=balance+amount;
    }
    public void accountdetail(){
        System.out.println("Name "+name);
        System.out.println("Account number "+accountnumber);
        System.out.println("Balance "+balance);
    }
}
