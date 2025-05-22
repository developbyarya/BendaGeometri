package BendaGeometri;

public class PrismaPersegiPanjang extends PersegiPanjang implements IBenda3D {
    private double tinggiPrisma;

    public PrismaPersegiPanjang() {
        super();
        this.tinggiPrisma = 0;
    }

    public PrismaPersegiPanjang(double panjang, double lebar, double tinggiPrisma) {
        super(panjang, lebar);
        this.tinggiPrisma = tinggiPrisma;
    }

    public PrismaPersegiPanjang(int panjang, int lebar, int tinggiPrisma) {
        super(panjang, lebar);
        this.tinggiPrisma = tinggiPrisma;
    }

    @Override
    public double menghitungVolume() {
        double luasAlas = super.menghitungLuas();
        return luasAlas * tinggiPrisma;
    }

    public double menghitungVolume(double panjang, double lebar, double tinggiPrisma) {
        double luasAlas = super.menghitungLuas();
        return luasAlas * tinggiPrisma;
    }

    public double menghitungVolume(int panjang, int lebar, int tinggiPrisma) {
        double luasAlas = super.menghitungLuas();
        return luasAlas * tinggiPrisma;
    }

    @Override
    public double menghitungLuasPermukaan() {
        double luasAlas = super.menghitungLuas();
        double kelilingAlas = super.menghitungKeliling();
        return 2 * luasAlas + kelilingAlas * tinggiPrisma;
    }

    public double menghitungLuasPermukaan(double panjang, double lebar, double tinggiPrisma) {
        double luasAlas = super.menghitungLuas(panjang, lebar);
        double kelilingAlas = super.menghitungKeliling(panjang, lebar);
        return 2 * luasAlas + kelilingAlas * tinggiPrisma;
    }
    public double menghitungLuasPermukaan(int panjang, int lebar, int tinggiPrisma) {
        double luasAlas = super.menghitungLuas(panjang, lebar);
        double kelilingAlas = super.menghitungKeliling(panjang, lebar);
        return 2 * luasAlas + kelilingAlas * tinggiPrisma;
    }

    @Override
    public void mencetakVolume() {
        System.out.printf("Volume Prisma Persegi Panjang: %.2f\n", menghitungVolume());
    }

    @Override
    public void mencetakLuasPermukaan() {
        System.out.printf("Luas Permukaan Prisma Persegi Panjang: %.2f\n", menghitungLuasPermukaan());
    }
}