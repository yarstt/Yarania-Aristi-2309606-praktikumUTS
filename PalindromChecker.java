/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palindromchecker;

// Jawaban UTS no 1 ( NIM genap )

import java.util.Scanner;

public class PalindromChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan tiga digit integer : ");
        int number = input.nextInt();

        // Mengecek apakah bilangan terdiri dari 3 digit
        if (number < 100 || number > 999) {
            System.out.println("Harap masukkan bilangan bulat tiga digit.");
        } else {
            int ratusan = number / 100;          // digit pertama
            int satuan = number % 10;            // digit terakhir

            if (ratusan == satuan) {
                System.out.println(number + " adalah palindrom");
            } else {
                System.out.println(number + " bukan palindrom");
            }
        }

        input.close();
    }
}
