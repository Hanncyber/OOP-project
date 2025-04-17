import java.util.Scanner;
import java.util.Date;

    public abstract class User {
        private String password;
        private String username;
        Date dateOfBirth;
        User(){
        }

        public User(String password, String username, Date dateOfBirth) {
            this.password = password;
            this.username = username;
            this.dateOfBirth = dateOfBirth;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public Date getDateOfBirth() {
            return dateOfBirth;
        }

        public void setDateOfBirth(Date dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }
        abstract void signup();
        abstract boolean login();
        abstract void viewProfile();
        void menu(){
            System.out.println("welcome to our Event Managment System");
            System.out.println("1.Sign up\n" +
                    "2.Login\n" +
                    "3.View profile\n");
            System.out.println("Enter your choice");
            Scanner input=new Scanner(System.in);
            int x= input.nextInt();
            switch(x){
                case 1:
                    signup();
                case 2:
                    login();
                case 3:
                    viewProfile();
            }
        }
    }
