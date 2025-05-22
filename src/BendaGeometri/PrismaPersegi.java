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
        double luasAlas = menghitungLuas();
        double kelilingAlas = menghitungKeliling();
        return 2 * luasAlas * kelilingAlas * tinggiPrisma;
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