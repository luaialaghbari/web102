public class BankAccountAndSaving {





        public static void main(String[] args) {

            bankaccount savingsAccount= new bankaccount(1000,2.1);
            System.out.println("Balance : $ " + savingsAccount.getBalance() + "\n Interest :  $ " + savingsAccount .getInterest_rate()
                    +"\n # Deposit : " + savingsAccount.getNumber_deposit() + "\n Withdrawals:" + savingsAccount.getNumber_withdrawals()  );


        }

}
