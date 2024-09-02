package chapter1;

import java.net.StandardSocketOptions;
import java.sql.SQLOutput;
import java.util.Scanner;

public class CWH_06_boolean {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Taking input from user");


         boolean b= sc.hasNextLine();
         System.out.println(b);

         String str=sc.next();
         System.out.println(str);

        String str1=sc.nextLine();
        System.out.println(str1);

    }
}
