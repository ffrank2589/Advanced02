package com.example.lib;

import java.util.Scanner;

public class o2 {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input something:");
        String string = scanner.next();
        for(int i=string.length();i>0;i--){
            System.out.print(string.charAt(i-1));
        }
    }
}