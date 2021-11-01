package Polymorphism;

public class Account {

        int Amount(){
            return 0;
        }
    }

    class Savings extends Account{
        int Amount(){
            return 1000000;
        }
    }

    class Current extends Account{
        int Amount(){
            return 250000;
        }
    }



    class Main {

        public static void main(String[] args) {
            Account a;
            a = new Savings();
            int b=a.Amount();
            a=new Current();
            int c=a.Amount();
            int total=b+c;

            System.out.println("Total amount:" +total);

        }
    }



