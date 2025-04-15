/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

public class PatternD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: ");
        int n = scanner.nextInt();

        for (int i = n; i >= 1; i--) {
            // Cetak spasi di depan biar rata kanan
            for (int s = 0; s < n - i; s++) {
                System.out.print("  "); // dua spasi
            }
            // Cetak angka dari 1 sampai i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

