/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

public class PatternC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            // Mencetak spasi agar baris menjadi rata kanan
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  "); // Dua spasi (sesuaikan jika perlu)
            }
            // Mencetak angka dari i sampai 1
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}

