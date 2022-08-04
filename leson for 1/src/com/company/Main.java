package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(in);
int res = 1;
int a = scanner.nextInt();
for (int i =1; i <=10;i ++ ){

    res = a*i;
    System.out.println(a+" * "+i+" = "+ res);



}

    }
}