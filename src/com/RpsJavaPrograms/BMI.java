package com.RpsJavaPrograms;

import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {

        System.out.println("Body Mass Index");

        System.out.println(" Enter Your Weight Below in Kgs :");

        Scanner sc = new Scanner(System.in);
        float weight = sc.nextInt();

        System.out.println(" Enter Your Height Below  in Meters:");
        Float height = sc.nextFloat();


        float bmi = weight/ (height*height);

        if (bmi<18.5){
            System.out.println("You are UnderWeight ");
        } else if (bmi>=25 && bmi <30 ) {
            System.out.println("You are OverWeight");

        }
        else{
            System.out.println("Obisity");
        }

    }
}
