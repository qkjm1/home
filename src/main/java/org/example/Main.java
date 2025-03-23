package org.example;


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] inputBits = sc.nextLine().split(" ");

        long sum = 0;

        for (String inputBit : inputBits) {
            sum += Long.parseLong(inputBit);
        }

        System.out.println(sum);

        sc.close();
    }
}