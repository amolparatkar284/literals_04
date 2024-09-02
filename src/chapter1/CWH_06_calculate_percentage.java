package chapter1;

import java.util.Scanner;

public class CWH_06_calculate_percentage {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println(" Marks of 1st Subjet");
        int a=sc.nextInt();

        System.out.println(" Marks of 2nd Subjet");
        int b=sc.nextInt();

        System.out.println("Enter marks of 3rd subject");
        int c= sc.nextInt();

        System.out.println(" Marks of 4th Subjet");
        int d=sc.nextInt();

        System.out.println(" Marks of 5th Subjet");
        int e=sc.nextInt();

        double percentage=((a+b+c+d+e)/500.0)*100;
        //int mul=sum/500;
       // int percentage=sum*100;
        System.out.println("percentage is " + percentage);



    }
}
