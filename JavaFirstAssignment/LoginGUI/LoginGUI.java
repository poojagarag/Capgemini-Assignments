package LoginGUI;
import java.util.Scanner;

public class LoginGUI {

        public static void main(String[] args) {
            int check=0;
            Scanner sc=new Scanner(System.in);

            System.out.println("Enter Username");
            String username=sc.nextLine();

            System.out.println("Enter Password");
            String password=sc.nextLine();

            System.out.println("Welcome"+username);

            System.out.println("Enter Login Details");
            System.out.println("Enter username");
            String LoginUsername=sc.nextLine();

            System.out.println("Enter Password");
            String LoginPassword=sc.nextLine();

            while(check<=2){

                if((!username.equals(LoginUsername))||(!password.equals(LoginPassword))){   // To check wether Registered username & password  and Login username & Password are equal or not
                    System.out.println("Invalid Username or Password");

                    System.out.println("Enter username");
                    LoginUsername=sc.nextLine();

                    System.out.println("Enter Password");
                    LoginPassword=sc.nextLine();

                }else{
                    System.out.println("Wellcome"+username+" You are Logged in");
                    break;
                }
                check++;
            }
            if(check>2){
                System.out.println("Contact Admin");
            }
        }
    }


