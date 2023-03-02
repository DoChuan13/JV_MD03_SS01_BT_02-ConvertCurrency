package Excercise;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter currency rate: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter USD value: ");
        double usd = scanner.nextDouble();
        double vnd = usd * rate;
        System.out.printf("%-30s%s", "USD", "VND\n");
        System.out.printf("%-30f%s", usd, vnd);
    }
}
