package BendaGeometri;
import java.io.*;
import java.util.*;

public class PrismaPersegi extends Persegi implements IBenda3D {
    private double tinggiPrisma;

    public PrismaPersegi() {
        super();
        this.tinggiPrisma = 0;
    }

    public PrismaPersegi(Persegi bendaAlas, double tinggiPrisma) {
        super(bendaAlas.getSisi());
        this.tinggiPrisma = tinggiPrisma;
    }

    public PrismaPersegi(Persegi bendaAlas, int tinggiPrisma) {
        this(bendaAlas, (double) tinggiPrisma);
    }

    @Override
    public double menghitungVolume() {
        return super.menghitungLuas() * tinggiPrisma;
    }

    
    public double menghitungVolume(double sisi, double tinggi) {
       
        double luasAlas = super.menghitungLuas(sisi);
        return luasAlas * tinggi;
        
    }

   
    public double menghitungVolume(int sisi, int tinggi) {
       double luasAlas = super.menghitungLuas(sisi);
        return luasAlas * tinggi;
    }

    @Override
    public double menghitungLuasPermukaan() {
        return 2 * super.menghitungLuas() + super.menghitungKeliling() * tinggiPrisma;
    }

    
    public double menghitungLuasPermukaan(double sisi, double tinggi) {
        
        double luasAlas = super.menghitungLuas(sisi);
        double kelilingAlas = super.menghitungKeliling(sisi);
        return 2 * luasAlas + kelilingAlas * tinggi;
       
    }

   
    public double menghitungLuasPermukaan(int sisi, int tinggi) {
         double luasAlas = super.menghitungLuas(sisi);
        double kelilingAlas = super.menghitungKeliling(sisi);
        return 2 * luasAlas + kelilingAlas * tinggi;
    }

    @Override
    public void mencetakVolume() {
        System.out.printf("Volume Prisma Persegi: %.2f\n", menghitungVolume());
    }

    @Override
    public void mencetakLuasPermukaan() {
        System.out.printf("Luas Permukaan Prisma Persegi: %.2f\n", menghitungLuasPermukaan());
    }
}