package com.RpsJavaPrograms;
import java.util.Scanner;
public class Temperature {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press  1. To enter the temprature in celcius \n" +
                "       2. To enter the temprature in farhenite");
        int num = sc.nextInt();
        System.out.println("Enter the temparature ");
        float temp = sc.nextInt();
        float cel, far;
        if(num == 1){
            far = (temp * 9 / 5) + 32;
            System.out.println("Temperature in farhenite is "+ far +" F");
        }
        else if(num == 2) {
            cel = (temp - 32) * 5/9;
            System.out.println("Temperature in farhenite is "+ cel +" C");
        }
        else{
            System.out.println("Wrong choice !!!");
        }
    }
}