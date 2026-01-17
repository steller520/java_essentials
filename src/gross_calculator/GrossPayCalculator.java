package gross_calculator;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args) {
        //1.Get the number of hours worked
       int hours;
       System.out.println("How many hours did he work?");

       Scanner input = new Scanner(System.in);
       hours = input.nextInt();

       // 2. Get hourly pay rate
        double payRate;
        System.out.print("What is the pay rate?");
        payRate = input.nextDouble();

        input.close();
        //3. Multiply hours and pay rate
        double grossPay = hours * payRate;
        //4. Display Result
        System.out.println("Gross Pay "+ grossPay);
    }
}
