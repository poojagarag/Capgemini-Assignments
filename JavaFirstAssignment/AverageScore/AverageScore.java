package AverageScore;
import java.util.Scanner;
public class AverageScore {

        public static void main(String[] args) {


            Student s[] = new Student[5];
            System.out.println("Enter Marks for 3 students");
            for (int i = 0; i < 3; i++)
                s[i] = new Student();


        }

    }
    class Student {
        Student() {
            int SubjectA, SubjectB, SubjectC, total, average;
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the marks of Subject A");
            SubjectA = sc.nextInt();

            System.out.println("Enter marks of subject B");
            SubjectB = sc.nextInt();

            System.out.println("Enter marks of SUbject c");
            SubjectC = sc.nextInt();

            total = SubjectA + SubjectB + SubjectC;
            average = total / 3;
            System.out.println("Total" + total);
            System.out.println("Average" + average);
        }
    }


