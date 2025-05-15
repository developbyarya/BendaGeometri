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

    @Override
    public double menghitungVolume(double[] params) {
        if (params.length >= 2) {
            double luasAlas = super.menghitungLuas(new double[]{params[0]});
            return luasAlas * params[1];
        }
        return 0.0;
    }

    @Override
    public double menghitungVolume(int[] params) {
        if (params.length >= 2) {
            return menghitungVolume(new double[]{params[0], params[1]});
        }
        return 0.0;
    }

    @Override
    public double menghitungLuasPermukaan() {
        return 2 * super.menghitungLuas() + super.menghitungKeliling() * tinggiPrisma;
    }

    @Override
    public double menghitungLuasPermukaan(double[] params) {
        if (params.length >= 2) {
            double luasAlas = super.menghitungLuas(new double[]{params[0]});
            double kelilingAlas = super.menghitungKeliling(new double[]{params[0]});
            return 2 * luasAlas + kelilingAlas * params[1];
        }
        return 0.0;
    }

    @Override
    public double menghitungLuasPermukaan(int[] params) {
        if (params.length >= 2) {
            return menghitungLuasPermukaan(new double[]{params[0], params[1]});
        }
        return 0.0;
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