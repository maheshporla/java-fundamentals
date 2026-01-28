package com.stschool.java.basics;

import java.util.Scanner;

public class ShoppingMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int avilableStock = 100;
        char continueShopping ='Y';

        do {
            System.out.println(" welcome to the E-commerce app");
            System.out.println("1.Products");
            System.out.println("2.Exit");
            System.out.print("Enter your Input : ");
            int value = sc.nextInt();
            if (avilableStock == 0) {
                System.out.println("outOfStock");
                break;
            }
            switch (value) {
                case 1:
                    System.out.println("welcome to Products Section");
                    System.out.print("Enter Product Price : ");
                    int ProductPrice = sc.nextInt();
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
                    double finalProductAmount = productAmount+ stateTax+centralTax+shippingCharges;
                    System.out.println("Discount Amount : " + discountAmount);
                    System.out.println("Discounted Price : " + productAmount);
                    System.out.println("State Tax : " + stateTax);
                    System.out.println(" Central Tax : " + centralTax);
                    System.out.println(" Final Product Price : " + finalProductAmount);
                    System.out.print("Enter Quantity : ");
                    int quantity = sc.nextInt();
                    double totalSavedAmount = discountAmount*quantity;
                    double totalAmount = finalProductAmount*quantity+shippingCharges;
                    System.out.println("Final Bill : " + totalSavedAmount);
                    System.out.println("Total Saved : " + totalAmount);
                    System.out.println("Thanks For Shopping");
                    System.out.println("continueShopping (Y/N)");
                    continueShopping = sc.next().charAt(0);
                    break;



                case 2 :
                    System.out.println("Thanks For Shopping");
                    continueShopping = 'N';
                    break;
                default:
                    System.out.println("Enter Proper Input");


            }


        } while (continueShopping == 'Y');

     sc.close();
    }
}
