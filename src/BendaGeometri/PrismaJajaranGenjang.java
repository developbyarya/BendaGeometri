package BendaGeometri;

public class PrismaJajaranGenjang extends JajaranGenjang implements IBenda3D {

    /**
     * Default constructor
     */
    public PrismaJajaranGenjang() {
        super();
        this.tinggiPrisma = 0;
    }

    private double tinggiPrisma;

    public PrismaJajaranGenjang(double panjang_alas, double tinggi_alas, double sisi_miring_alas, double tinggiPrisma) {
        super(panjang_alas, tinggi_alas, sisi_miring_alas);
        this.tinggiPrisma = tinggiPrisma;
    }

    public PrismaJajaranGenjang(int panjang_alas, int tinggi_alas, int sisi_miring_alas, int tinggiPrisma) {
        super(panjang_alas, tinggi_alas, sisi_miring_alas);
        this.tinggiPrisma = tinggiPrisma;
    }

    @Override
    public double menghitungVolume() {
        double luasAlas = super.menghitungLuas();
        return luasAlas * tinggiPrisma;
    }

    public double menghitungVolume(double panjang_alas, double tinggi_alas, double tinggiPrisma) {
        double luasAlas = super.menghitungLuas(panjang_alas, tinggi_alas);
        return luasAlas * tinggiPrisma;
    }

    public double menghitungVolume(int panjang_alas, int tinggi_alas, int tinggiPrisma) {
        double luasAlas = super.menghitungLuas(panjang_alas, tinggi_alas);
        return luasAlas * tinggiPrisma;
    }

    @Override
    public double menghitungLuasPermukaan() {
        float luasAlas = super.menghitungLuas();
        float keliling = super.menghitungKeliling();
        return 2 * luasAlas + keliling * tinggiPrisma;
    }

    public double menghitungLuasPermukaan(double panjang_alas, double tinggi_alas, double sisi_miring_alas, double tinggiPrisma) {
        double luasAlas = super.menghitungLuas(panjang_alas, tinggi_alas);
        double keliling = super.menghitungKeliling(panjang_alas, sisi_miring_alas);
        return 2 * luasAlas + keliling * tinggiPrisma;
    }

    public double menghitungLuasPermukaan(int panjang_alas, int tinggi_alas, int sisi_miring_alas, int tinggiPrisma) {
        double luasAlas = super.menghitungLuas(panjang_alas, tinggi_alas);
        double keliling = super.menghitungKeliling(panjang_alas, sisi_miring_alas);
        return 2 * luasAlas + keliling * tinggiPrisma;
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