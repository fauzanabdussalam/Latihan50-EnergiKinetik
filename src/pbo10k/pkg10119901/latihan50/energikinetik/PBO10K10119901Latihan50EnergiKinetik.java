/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119901.latihan50.energikinetik;

/**
 *
 * @author
 * NAMA                 : Fauzan Muhammad Abdussalam
 * KELAS                : IF-10K
 * NIM                  : 10119901
 * Deskripsi Program    : Menghitung Energi Kinetik
 *
 */
public class PBO10K10119901Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EnergiKinetik ek = new EnergiKinetik();
        
        ek.setMassa(0.145);
        ek.setKecepatan(25);
        
        System.out.println("Sebuah bola baseball dengan massa 145 gram dilempar dengan kecepatan 25 m/s");
        System.out.println("a. Berapakah energi kinetiknya?");
        System.out.println("b. Berapakah usaha yang dilakukan pada bola untuk mencapai kecepatan ini, jika dimulai dari keadaan diam");
        
        System.out.println("\n=====Jawaban=====");
        System.out.println("Massa \t\t = 145 gram = " + ek.getMassa() + " kg");
        System.out.println("Kecepatan \t = " + ek.getKecepatan() + " m/s");
        
        System.out.println("\na. Jumlah Energi Kinetik \t = " + ek.hitungEnergiKinetik() + " joule");
        System.out.println("b. Jumlah Usaha \t\t = " + ek.hitungUsaha() + " joule");
        
        System.out.println("\nJadi Jumlah Energi Kinetik dan Jumlah Usaha memiliki hasil yang sama yaitu " + ek.hitungEnergiKinetik() + " joule");
    }
    
}
