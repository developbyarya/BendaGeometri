package BendaGeometri;

public class PrismaPersegi extends Persegi implements IBenda3D {
    private double tinggiPrisma;

    public PrismaPersegi() {
        super();
        this.tinggiPrisma = 0;
    }

    public PrismaPersegi(double sisi, double tinggiPrisma) {
        super(sisi);
        this.tinggiPrisma = tinggiPrisma;
    }

    public PrismaPersegi(int sisi, int tinggiPrisma) {
        super(sisi);
        this.tinggiPrisma = tinggiPrisma;
    }

    @Override
    public double menghitungVolume() {
        double luasAlas = menghitungLuas();
        return luasAlas * tinggiPrisma;
    }

    public double menghitungVolume(double sisi, double tinggiPrisma) {
        double luasAlas = super.menghitungLuas(sisi);
        return luasAlas * tinggiPrisma;
    }

    public double menghitungVolume(int sisi, int tinggiPrisma) {
        double luasAlas = super.menghitungLuas(sisi);
        return luasAlas * tinggiPrisma;
    }

    @Override
    public double menghitungLuasPermukaan() {
        double luasAlas = menghitungLuas();
        double kelilingAlas = menghitungKeliling();
        return 2 * luasAlas * kelilingAlas * tinggiPrisma;
    }

    public double menghitungLuasPermukaan(double sisi, double tinggiPrisma) {
        double luasAlas = menghitungLuas(sisi);
        double kelilingAlas = menghitungKeliling(tinggiPrisma);
        return 2 * luasAlas * kelilingAlas * tinggiPrisma;    
    }

    public double menghitungLuasPermukaan(int sisi, int tinggiPrisma) {
        double luasAlas = menghitungLuas(sisi);
        double kelilingAlas = menghitungKeliling(tinggiPrisma);
        return 2 * luasAlas * kelilingAlas * tinggiPrisma;    
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