/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palindromecheck;

import java.util.Scanner;

public class PalindromeCheck {
    
    // Method untuk membalikkan angka
    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    // Method untuk mengecek apakah bilangan palindrome
    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }

    // Main program untuk pengujian
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan bilangan bulat: ");
            int input = scanner.nextInt();
            
            if (isPalindrome(input)) {
                System.out.println(input + " adalah palindrome.");
            } else {
                System.out.println(input + " bukan palindrome.");
            }
        }
    }
}
