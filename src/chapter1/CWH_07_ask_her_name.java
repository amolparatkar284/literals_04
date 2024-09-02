package chapter1;

import java.util.Scanner;

public class CWH_07_ask_her_name {
    public static void main(String[] args) {
        System.out.println("What is your name");

        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        System.out.println("hello "+ name +" have a good day");
    }
}
