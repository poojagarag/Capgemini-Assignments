package StudentResult;
import java.util.Scanner;

public class StudentResult{
        public static void main(String[] args) {
            int marks,subject1,subject2,subject3;
            System.out.println("Enter your marks of subjects ");
            Scanner sc=new Scanner(System.in);

            System.out.println("Enter marks of subject1");
            subject1=sc.nextInt();

            System.out.println("Enter marks of subject2");
            subject2=sc.nextInt();

            System.out.println("Enter marks of subject3");
            subject3=sc.nextInt();

            if(subject1>60&&subject2>60&&subject3>60)       // All Subjects greater than 60
            {
                System.out.println("Passed");
            }
            else if(subject1>60&&subject2>60||subject2>60&&subject3>60||subject1>60&&subject3>60) //Two Subjects greater than 60
            {
                System.out.println("Promoted");
            }
            else if(subject1>60||subject2>60||subject3>60||(subject1<60&&subject2<60&&subject3<60)) // One subject greater than 60 or all subjects less than 60
            {
                System.out.println("Failed");
            }

        }
    }


