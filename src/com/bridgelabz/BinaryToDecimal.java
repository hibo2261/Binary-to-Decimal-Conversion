package com.bridgelabz;
import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {
        System.out.println("********************************************");
        System.out.println(" Welcome to Binary To Decimal Conversion Program....");   //Printing Welcome Meassage
        System.out.println("********************************************");


        System.out.println("Enter A Number 1 --->"); // taking input from user
        Scanner sc = new Scanner(System.in); // creating a scanner object
        int num = sc.nextInt();
        int d = 0, t = num, i = 0;
        while (t > 0)
        {
            int r = t % 10; // taking the last digit of a no.
            t = t/10;
            d = d + r * (int) Math.pow(2 , i++);

        }
        System.out.println("Conversion Of A Binary No. "+num+" To Decimal No. Is ---> "+d);
    }
}