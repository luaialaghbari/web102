public class Testbankaccounter {



        public static void main(String[] args) {

             BankAccounter a = new BankAccounter ();
            a.deposit( 2000);

            System.out.println(a.getBalance());
            a.withraw(570);
            a.withraw(480);
            System.out.print(a.getBalance() );
            System.out.print("$");

        }




}
