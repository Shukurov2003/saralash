package com.company.issueTwo;

import java.util.Scanner;

public class issueTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter N : ");
        int n = scanner.nextInt();

        if(1<=n && n<5){
            System.out.println(0);
        }else System.out.println(1);
    }
}
