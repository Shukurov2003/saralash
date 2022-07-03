package com.company.issueOne;

import java.util.Scanner;

public class issueOne {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        byte[][] robotArr = new byte[7][7];
        System.out.print("Enter column number: ");
        byte a = scanner.nextByte();
        System.out.print("Enter raw number: ");
        byte b = scanner.nextByte();

        if(a>=7 || b>=7){
            System.out.println("please enter 0<=x<7");
            return;
        }
        for (int i = 0; i < robotArr.length; i++) {

            for (int j = 0; j < robotArr[i].length; j++) {
                if (i == a && j == b){
                    robotArr[i][j]=1;
                }else {
                    robotArr[i][j] = 0;
                }

                System.out.print(robotArr[i][j]+"\t");
            }
            System.out.println();
        }
        // center 3x3
        System.out.println("out put :"+(Math.abs(3-a)+Math.abs(3-b)));
    }
}
