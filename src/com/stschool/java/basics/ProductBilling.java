package com.stschool.java.basics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ProductBilling {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product price : ");
        int productPrice = sc.nextInt();
        System.out.print("Enter discount percentage : ");
        float discountPercentage = sc.nextFloat();
        float stateTax = 2.5F;
        float centralTax = 2.5F;

        System.out.println("Product price : "+ productPrice);
        System.out.println("Discount Percentage : "+ discountPercentage+"%");
        float discountAmount=productPrice*discountPercentage/100;
        System.out.println("Discount Amount : " + discountAmount);
        float finalPrice = (float) productPrice-(productPrice*discountPercentage/100);
        System.out.println("Discount Price: " + finalPrice);
        System.out.println("State Tax: "+finalPrice*stateTax/100);
        System.out.println("Central Tax: "+finalPrice*centralTax/100);
        float totalPrice = finalPrice+(finalPrice*stateTax/100)+(finalPrice*centralTax/100);
        System.out.println("Final Product Price: " + totalPrice);
        System.out.print("enter quantity : ");
        int quantity = sc.nextInt();
        //System.out.println(productPrice);
        //float productSaved=totalPrice-productPrice;

        float totalAmount=finalPrice*quantity;
        System.out.println("Final Bill: "+ totalAmount);
        //float totalSavedAmount=totalAmount-(totalPrice*quantity);
        System.out.println("Total saved: "+ discountAmount*quantity);
        sc.close();
    }
}
