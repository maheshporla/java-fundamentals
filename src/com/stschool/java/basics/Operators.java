package com.stschool.java.basics;

public class Operators {
    public static void main(String[] args) {

        int no1 =10;
        int no2 = 20;
        int res = (no1++)- (--no2) + (no2--) * (++no1) +(--no1);

        System.out.println(res);

        int res1 = no1+ (no2-30)*40/50%60;
        System.out.println(res1);
        int no3 =10;
        System.out.println(((no3++)>10)&&((++no3) > 5));
       // System.out.println(((no3++)>10)&((++no3) > 5));
        System.out.println(no3);




    }
}
