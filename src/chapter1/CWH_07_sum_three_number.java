package chapter1;

import java.util.Scanner;

public class CWH_07_sum_three_number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("enter 1st number");
        int a= sc.nextInt();

        System.out.println("enter 2nd number");
        int b=sc.nextInt();

        System.out.println("enter 3rd number ");
        int c=sc.nextInt();

        int sum = a+b+c;
        System.out.println("the sum this 3 numbers is " + sum);

    }
}
