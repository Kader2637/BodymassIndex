/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BmiApp;

/**
 *
 * @author LEGION
 */
public class Bmi {

    double berat;
    double tinggi;

    public Bmi(double berat, double tinggi) {
        this.berat = berat;
        this.tinggi = tinggi;
    }

    public double hitung() {
        double meter = tinggi / 100;
        return berat / (meter * meter);
    }

    public void tampilkanHasil(int pilihanKelamin) {
        double bmi = hitung();
        String jenisKelamin = switch (pilihanKelamin) {
            case 1 -> "Laki-Laki";
            case 2 -> "Perempuan";
            default -> "Tidak valid";
        };

        String statusKesehatan;
        if (bmi < 18.5) {
            statusKesehatan = "Kurus";
        } else if (bmi < 25) {
            statusKesehatan = "Normal";
        } else if (bmi < 30) {
            statusKesehatan = "Berat berlebih";
        } else {
            statusKesehatan = "Obesitas";
        }

        System.out.println("\n======== Hasil BMI =========");
        System.out.println("Jenis Kelamin                : " + jenisKelamin);
        System.out.printf("Indeks Massa Tubuh (BMI)     : %.1f%n", bmi);
        System.out.println("Status Kesehatan             : " + statusKesehatan);
        System.out.println("============================");
    }
}
