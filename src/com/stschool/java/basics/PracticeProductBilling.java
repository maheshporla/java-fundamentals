package com.stschool.java.basics;

import java.util.Scanner;

public class PracticeProductBilling {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter product price : ");
        int ProductPrice = sc.nextInt();
        System.out.print("Enter discount percentage : ");
        float discountPercentage = sc.nextFloat();
        final float STATE_TAX_PERCENTAGE = 2.5F;
        final float CENTRAL_TAX_PERCENTAGE = 2.5F;

        float discountAmount = ProductPrice*(discountPercentage/100);
        float productAmount = ProductPrice-discountAmount;
        float stateTax = productAmount*(STATE_TAX_PERCENTAGE/100);
        float centralTax = productAmount *(CENTRAL_TAX_PERCENTAGE/100);
        double finalProductAmount = productAmount+ stateTax+centralTax;
        System.out.println("Discount Amount : " + discountAmount);
        System.out.println("Discounted Price : " + productAmount + "%");
        System.out.println("State Tax : " + stateTax);
        System.out.println(" Central Tax : " + centralTax);
        System.out.println(" Final Product Price : " + finalProductAmount);
        System.out.print("Enter Quantity : ");
        int quantity = sc.nextInt();
        double totalSavedAmount = discountAmount*quantity;
        double totalAmount = finalProductAmount*quantity;
        System.out.println("Final Bill : " + totalSavedAmount);
        System.out.println("Total Saved : " + totalAmount);
        sc.close();
    }
}
