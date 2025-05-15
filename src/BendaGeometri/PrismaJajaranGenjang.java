package BendaGeometri;
import java.io.*;
import java.util.*;
public class PrismaJajaranGenjang extends JajaranGenjang implements IBenda3D {
    private double tinggiPrisma;

    public PrismaJajaranGenjang() {
        super();
        this.tinggiPrisma = 0;
    }

    public PrismaJajaranGenjang(JajaranGenjang bendaAlas, double tinggiPrisma) {
        super(bendaAlas.getAlas(), bendaAlas.getTinggi(), bendaAlas.getSisiMiring());
        this.tinggiPrisma = tinggiPrisma;
    }

    public PrismaJajaranGenjang(JajaranGenjang bendaAlas, int tinggiPrisma) {
        this(bendaAlas, (double) tinggiPrisma);
    }

    @Override
    public double menghitungVolume() {
        return super.menghitungLuas() * tinggiPrisma;
    }

    @Override
    public double menghitungVolume(double[] params) {
        if(params.length >= 3) {
            double[] paramsAlas = {params[0], params[1], params[2]};
            return super.menghitungLuas(paramsAlas) * params[2];
        }
        return 0.0;
    }

    @Override
    public double menghitungVolume(int[] params) {
        if(params.length >= 3) {
            int[] paramsAlas = {params[0], params[1], params[2]};
            return super.menghitungLuas(paramsAlas) * params[2];
        }
        return 0.0;
    }

    @Override
    public double menghitungLuasPermukaan() {
        return 2 * super.menghitungLuas() + super.menghitungKeliling() * tinggiPrisma;
    }

    @Override
    public double menghitungLuasPermukaan(double[] params) {
        if(params.length >= 3) {
            double[] paramsAlas = {params[0], params[1], params[2]};
            return 2 * super.menghitungLuas(paramsAlas) + super.menghitungKeliling(paramsAlas) * params[2];
        }
        return 0.0;
    }

    @Override
    public double menghitungLuasPermukaan(int[] params) {
        if(params.length >= 3) {
            int[] paramsAlas = {params[0], params[1], params[2]};
            return 2 * super.menghitungLuas(paramsAlas) + super.menghitungKeliling(paramsAlas) * params[2];
        }
        return 0.0;
    }

    @Override
    public void mencetakVolume() {
        System.out.printf("Volume Prisma Jajaran Genjang: %.2f\n", menghitungVolume());
    }

    @Override
    public void mencetakLuasPermukaan() {
        System.out.printf("Luas Permukaan Prisma Jajaran Genjang: %.2f\n", menghitungLuasPermukaan());
    }
}