package IncomeTax;

import java.util.Scanner;

public class IncomeTax {



        public static void main(String[] args) {


            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Income Range");
            double Income=sc.nextDouble();

            if(Income>=0&&Income<=180000){           //Tax Range between 0 to 180000
                System.out.println("Tax Payable is Nill");
            }
            else if(Income>=181001&&Income<=300000){    //Tax Range between 181001 to 300000
                System.out.println("Tax Payable is 10%");
            }
            else if(Income>=300001&&Income<=500000){      //Tax Range between 300001 to 500000
                System.out.println("Tax Payable is 20%");
            }
            else if(Income>500001&&Income<=1000000){        //Tax Range between 500001 to 1000000
                System.out.println("Tax Payable is 30%");
            }
        }
    }


