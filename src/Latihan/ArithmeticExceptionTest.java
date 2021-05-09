package Latihan;

import java.util.Scanner;

public class ArithmeticExceptionTest {

    public static void main(String[] args) {
        // int a = 100;
        // System.out.println("Enter the value for b");
        Scanner console = new Scanner(System.in);
        // int b = console.nextInt();
        System.out.println("Enter the value for c");
        int c = console.nextInt();
        try {
            int res = c / 0;
            // 10 / (b - c);
            System.out.println("The result is " + res);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi Exception");
            System.out.println("Detail : " + c + e.getMessage());
            System.out.println("Program selesai");
        }
    }
}
