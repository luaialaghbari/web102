public class bankaccount {

    public bankaccount(double  balance, double apr) {
    }

    protected boolean getBalance() {
        return getBalance();
    }

    public String getInterest_rate() {
        return getInterest_rate();

    }

    public String getNumber_withdrawals() {
        return null;
    }

    public String getNumber_deposit() {
        return null;
    }

    public  abstract   class BankAccount {

        private  double balance;
        private double number_deposit;
        private double number_withdrawals;
        private double interest_rate;
        protected  double servicce_charges;
        public double getBalance(){
            return balance;
        }
        public void setBalance(double balance){
            this.balance = balance;
        }
        public double getNumber_deposit(){
            return number_deposit;
        }

        public double getNumber_withdrawals() {
            return number_withdrawals;

        }
        public double getInterest_rate(){
            return  interest_rate;
        }

        public BankAccount(double balance , double apr){
            this.balance = balance;
            this.interest_rate=apr;
        }
        private  void depoist(double amount){
            this.balance += amount;
            this.number_deposit++;
        }
        void withdraw(double amount){
            this.balance -= amount;
            this.number_withdrawals++;
        }

        public  void  calcInterest(){
            double monthlyInterest = (interest_rate /12 );
            monthlyInterest = balance * monthlyInterest;
            this.balance += monthlyInterest;
        }
        public  void monthlyprocess(){
            this.balance -= servicce_charges;
            calcInterest();

            this.number_deposit = 0;
            this .number_withdrawals = 0;
            this.servicce_charges = 0;
        }


        protected void deposit(double amount) {
        }
    }
}
