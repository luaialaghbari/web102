public class addBank {

    public addBank(int i) {

    }

    public void deposit(int i) {

    }

    public void withraw(int i) {


    }

    public void addlnteresr(double v) {

    }

    public boolean getBalance() {
        return false;
    }

    public class AddBANK {
        private double balance;

        {
            balance=0 ;
        }
        public AddBANK(double intiBalance)
        { balance=intiBalance;
        }
        public void deposit(double amount) {balance=balance+=amount;
        }
        public void  withraw(double amount){balance=balance-=amount;
        }
        public double getBalance() { return balance;}
        public void addlnteresr(double Rate)
        {
            balance += (balance/Rate);
        }




    }
}
