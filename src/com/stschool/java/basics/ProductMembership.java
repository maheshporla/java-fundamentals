package com.stschool.java.basics;

import java.util.Scanner;

public class ProductMembership {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter product price : ");
        int ProductPrice = sc.nextInt();
        int productPrice;
        float discountPercentage;
        int shippingCharges;
        System.out.print("enter membership : ");
        char membership = sc.next().charAt(0);
        if( membership == 's') {
            discountPercentage = 10;
            shippingCharges = 50;
        } else if( membership == 'g'){
            discountPercentage = 20 ;
            shippingCharges = 30;
        } else if (membership == 'd') {
            discountPercentage = 30 ;
            shippingCharges = 0;
        }
        else {
            discountPercentage = 0;
            shippingCharges = 100;
        }
        final float STATE_TAX_PERCENTAGE = 2.5F;
        final float CENTRAL_TAX_PERCENTAGE = 2.5F;

        float discountAmount = ProductPrice*(discountPercentage/100);
        float productAmount = ProductPrice-discountAmount;
        float stateTax = productAmount*(STATE_TAX_PERCENTAGE/100);
        float centralTax = productAmount *(CENTRAL_TAX_PERCENTAGE/100);
        double finalProductAmount = productAmount+ stateTax+centralTax;
        System.out.println("Discount Amount : " + discountAmount);
        System.out.println("Discounted Price : " + productAmount);
        System.out.println("State Tax : " + stateTax);
        System.out.println(" Central Tax : " + centralTax);
        System.out.println(" Final Product Price : " + finalProductAmount);

        sc.close();
    }
}
