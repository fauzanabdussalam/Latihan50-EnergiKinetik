/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119901.latihan50.energikinetik;

/**
 *
 * @author User
 */
public class EnergiKinetik 
{
    private double massa, kecepatan;

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }
    
    public double hitungEnergiKinetik()
    {
        return 0.5 * massa * (kecepatan * kecepatan);
    }
    
    public double hitungUsaha()
    {
        return 0.5 * massa * ((kecepatan * kecepatan) - (0 * 0));
    }
}
