package org.example;


import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] inputBits = sc.nextLine().split(" ");

        long sum = Arrays.stream(inputBits)
                .mapToLong(e -> Long.parseLong(e))
                .sum();

        System.out.println(sum);

        sc.close();
    }
}