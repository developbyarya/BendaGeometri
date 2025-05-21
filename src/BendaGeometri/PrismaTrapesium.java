package BendaGeometri;

public class PrismaTrapesium extends Trapesium implements IBenda3D {
    private double tinggiPrisma;
    
    public PrismaTrapesium() {
        super();
        this.tinggiPrisma = 0;
    }

    public PrismaTrapesium(double alasAtas, double alasBawah, double tinggi, double sisiKiri, double sisiKanan, double tinggiPrisma) {
        super(alasAtas, alasBawah, tinggiPrisma, sisiKiri, sisiKanan);
        this.tinggiPrisma = tinggiPrisma;
    }
    
    public PrismaTrapesium(int alasAtas, int alasBawah, int tinggi, int sisiKiri, int sisiKanan, int tinggiPrisma) {
        super(alasAtas, alasBawah, tinggiPrisma, sisiKiri, sisiKanan);
        this.tinggiPrisma = tinggiPrisma;
    }

    @Override
    public double menghitungVolume() {
        double luasAlas = super.menghitungLuas();
        return luasAlas * tinggiPrisma;
    }

    public double menghitungVolume(double alasAtas,double alasBawah,double tinggi, double tinggiPrisma) {
        double luasAlas = super.menghitungLuas(alasAtas,alasBawah,tinggi);
        return luasAlas * tinggiPrisma;
    }

    public double menghitungVolume(int alasAtas, int alasBawah, int tinggi, int tinggiPrisma) {
        double luasAlas = super.menghitungLuas(alasAtas,alasBawah,tinggi);
        return luasAlas * tinggiPrisma;
    }


    @Override
    public double menghitungLuasPermukaan() {
        double luasAlas = super.menghitungLuas();
        double kelilingAlas = super.menghitungKeliling();
        return 2 * luasAlas + kelilingAlas * tinggiPrisma;
    }

    public double menghitungLuasPermukaan(double alasAtas, double alasBawah,double tinggi, double sisiKiri, double sisiKanan, double tinggiPrisma) {
        double luasAlas = super.menghitungLuas(alasAtas,alasBawah,tinggi);
        double kelilingAlas = super.menghitungKeliling(alasAtas, alasBawah, sisiKanan, sisiKiri);
        return 2 * luasAlas + kelilingAlas * tinggiPrisma;
    }

    public double menghitungLuasPermukaan(int alasAtas, int alasBawah, int sisiKiri, int sisiKanan, int tinggi, int tinggiPrisma) {
        double luasAlas = super.menghitungLuas(alasAtas, alasBawah, tinggi);
        double kelilingAlas = super.menghitungKeliling(alasAtas, alasBawah, sisiKiri, sisiKanan);
        return 2 * luasAlas + kelilingAlas * tinggiPrisma;
    }

    @Override
    public void mencetakVolume() {
        System.out.printf("Volume Prisma Trapesium: %.2f\n", menghitungVolume());
    }

    // Cetak luas permukaan
    @Override
    public void mencetakLuasPermukaan() {
        System.out.printf("Luas Permukaan Prisma Trapesium: %.2f\n", menghitungLuasPermukaan());
    }
}