public class Wallet {
        private double balance;

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }
        public boolean withDraw(double amount){
            if(amount<=balance   ){
                System.out.println("Amount was withdrawn sucessfully");
                return true;
            }
            else{
                System.out.println("Unsucessfull withdraw...Try again");
                return false;
            }
        }
        double depoist(double amount){
            return balance+amount ;
        }
    }
