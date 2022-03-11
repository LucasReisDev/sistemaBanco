package     com.company;

public class BankAccount {

    public int numberAccount;
    protected String typeAccount;
    private String ownerAccount;
    private float balance;
    private boolean status;

    public void StatusAccount()
    {
        System.out.println("------------------------------");
        System.out.println("Account:" + this.getNumberAccount());
        System.out.println("Owner:"+ this.getOwnerAccount());
        System.out.println("Type of account:" + this.getTypeAccount());
        System.out.println("Balance account is :"+this.getBalance());
        System.out.println("Status of account is :"+this.getStatus());
    }

    public void openAccount(String t){
        this.setTypeAccount(t);
        this.setStatus(true);
        if (t == "CC"){
            this.setBalance(50);
        System.out.println("Account Personal created succesfull");
        }
        else if (t == "CP") {
        this.setBalance(150); }
        System.out.println("Account poupance create with sucess"); }

    public void closeAccount(){
        if (this.getBalance() >0){
            System.out.println("Account have money, not possible close");
        }
        else if (this.getBalance() < 0){
            System.out.println("Account have debit");
            }
        else{
            this.setStatus(false);
            System.out.println("Account closed");
            }
    }

    public void depositMoney(float v){
        if (this.getStatus()){
        this.setBalance(this.getBalance() + v);
        System.out.println("Deposit made with sucess"+ this.getOwnerAccount());
        } else {
         System.out.println("Not possible deposit in Account closed");
        }
    }

    public void withdraw(float v){
        if (this.getStatus()){
            if (this.getBalance() >= v){
                this.setBalance(this.getBalance()-v);
                System.out.println("Whitdraw process sucessfull in account of " + this.getOwnerAccount());
        } else {
                System.out.println("dont have money");
        }
        } else {
                System.out.println("closed account impossible");

        }
    }
    public void payMensality(){
        int v = 0;
        if (this.getTypeAccount()=="CC"){
            v=12;
        }else if (this.getTypeAccount()=="CP"){
            v = 20;
        }
        if(this.getStatus()){
                this.setBalance(this.getBalance()- v);
            System.out.println("mensality pay sucess " + getOwnerAccount());
            } else
        {
            System.out.println("impossible pay account closed");
        }
    }

    public BankAccount() {
        this.balance=0;
        this.status=false;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public String getTypeAccount() {
        return typeAccount;
    }

    public void setTypeAccount(String typeAccount) {
        this.typeAccount = typeAccount;
    }

    public String getOwnerAccount() {
        return ownerAccount;
    }

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


}
