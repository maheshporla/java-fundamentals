package com.stschool.java.basics;

import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter Maths marks: ");
        short mathsMarks=sc.nextShort();
        System.out.print("enter English marks: ");
        short englishMarks=sc.nextShort();
        System.out.print("enter Telugu marks: ");
        short teluguMarks = sc.nextShort();
        System.out.print("enter Hindi marks: ");
        short hindiMarks = sc.nextShort();
        System.out.print("enter Social marks: ");
        short socialMarks=sc.nextShort();
        System.out.print("enter Science marks: ");
        short scienceMarks=sc.nextShort();
        float sum = (float)(mathsMarks+englishMarks+teluguMarks+hindiMarks+socialMarks+scienceMarks);
        System.out.println("Sum: "+sum);
        float avg= sum/6;
        System.out.print("Average: "+avg);
        sc.close();
    }
}
