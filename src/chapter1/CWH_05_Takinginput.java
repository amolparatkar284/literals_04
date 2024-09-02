package chapter1;
import java.util.Scanner;
public class CWH_05_Takinginput {
    public static void main(String[] args) {
        System.out.println("Takin Input from the User");

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter number 1");
        int a=sc.nextInt();
       // float a=sc.nextFloat();


        System.out.println("Enter number 2");
        int b=sc.nextInt();
       // float b=sc.nextFloat();


        int sum =a+b;
       // float sum=a+b;

        System.out.println("Sum of these number is :");
        System.out.println(sum);

        Scanner sc1= new Scanner(System.in);
        System.out.println("Enter 1st value ");
        int p= sc1.nextInt();

        System.out.println("Enter 2nd value");
        int o=sc1.nextInt();

        int s=p+o;
        System.out.println(s);

        Scanner pt = new Scanner(System.in);
        int t=pt.nextInt();





    }
}
