package CompoundIntreast;
import java.util.Scanner;

public class CompoundIntreast {

        public static void main(String[] args) {
            double pr, rate, t, simple,compound;
            Scanner sc=new Scanner (System. in);
            System.out.println("Enter the amount:");
            pr=sc.nextDouble();
            System. out. println("Enter the Number of years:");
            t=sc.nextDouble();
            System. out. println("Enter the Rate of  interest");
            rate=sc.nextDouble();
            simple=(pr * t * rate)/100;
            compound=pr * Math.pow(1.0+rate/100.0,t) - pr;
            System.out.println("Simple Interest="+simple);
            System.out. println("Compound Interest="+compound);
        }
    }


