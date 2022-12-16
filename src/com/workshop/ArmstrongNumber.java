package com.workshop;

import java.util.Scanner;
import java.lang.Math;
public class ArmstrongNumber {

    public static int Power(int a,int b){
        int temp=a;
        for(int i=0;i<b;i++){
            a=a*temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num= sc.nextInt();
        int count=0,rev=0,sum,rem,number=0;
        int temp;
        temp=num;
        while(num!=0){
            rem=num%10;
            rev=rev+rem;
            num=num/10;
            count++;
        }
        num=temp;
        for(int i=0;i<count;i++){
            rem=num%10;
            sum=ArmstrongNumber.Power(rem,count);
            num=num/10;
            number=number+sum;
        }
        if(number==temp){
            System.out.println("It is an armstrong number");
        }
        else {
            System.out.println("It is not an armstrong number");
        }
    }
}
