package Bank;

    class Bank{

        void totalMoneyInBank()
        {
            System.out.println("The Employee incremented salary is :" );

        }
    }
    class SavingAcoount extends Bank{
        float fixedDeposits =150000;
        void totalMoneyInBank()
        {
            System.out.println("total money in savings account :" +((fixedDeposits)));
        }
    }
    class CurrentAcccount extends SavingAcoount{
        double cashCredit=59000;
        void totalMoneyInBank()
        {
            System.out.println("The total money in current account "+(cashCredit));


        }
    }
    class MainClass90
    {
        public static void main(String args[]){

            CurrentAcccount c=new CurrentAcccount();
            SavingAcoount s=new SavingAcoount();



            c.totalMoneyInBank();
            s.totalMoneyInBank();

            System.out.println("Total money in the bank  is "+( c.fixedDeposits+c.cashCredit));
        }
    }

