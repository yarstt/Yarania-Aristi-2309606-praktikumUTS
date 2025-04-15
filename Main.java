/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Main {
    public static void main(String[] args) {
        Balok balok1 = new Balok(1, 1, 1);
        Balok balok2 = new Balok(30, 25, 50);
        Balok balok3 = new Balok(25, 35, 45);

        cetakHasil(balok1);
        cetakHasil(balok2);
        cetakHasil(balok3);
    }

    public static void cetakHasil(Balok b) {
        System.out.println("Balok dengan panjang : " + b.getPanjang() +
                ", lebar : " + b.getLebar() +
                " dan tinggi : " + b.getTinggi() +
                ". Luasnya : " + b.getLuas() +
                ", sedangkan kelilingnya : " + b.getKeliling() +
                " dan volumenya : " + b.getVolume());
    }
}
