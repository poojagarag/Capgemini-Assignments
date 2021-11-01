package Heirarchy;

public class Heirarchy {
        float salary = 40000;
        void totalSalary()
        {
            System.out.println("The Employee incremented salary is :" +(salary ) );

        }
    }
    class Manager extends Heirarchy{
        float incentive =15000;
        void totalsalary()
        {
            System.out.println("The Manager salary is :" +((salary+incentive)));
        }
    }
    class Labour extends Manager{
        double overtime=6500;
        void totalsalary()
        {
            System.out.println("The salary of the Labours is"+(overtime+salary));


        }
    }
    class main
    {
        public static void main(String args[]){


            Labour l = new Labour();
            Manager m=new Manager();
            System.out.println("Total Salary Of Employees In Organisation is "+(m.salary+ (((m.incentive)+ l.overtime))+ l.salary));
        }
    }

