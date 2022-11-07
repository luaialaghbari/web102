public class BankAccounter {


    public void deposit(int i) {
    }

    public boolean getBalance() {
        return false;
    }

    public void withraw(int i) {
    }

    public class BankAccounter2{
        private double balance;

        {
            balance=0 ;
        }
        public BankAccounter2(double intiBalance)
        { balance=intiBalance;
        }
        public void deposit(double amount) {balance=balance+=amount;
        }
        public void  withraw(double amount){balance=balance-=amount;
        }
        public double getBalance() { return balance;}


    }

}
