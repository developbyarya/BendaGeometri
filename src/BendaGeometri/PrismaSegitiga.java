package BendaGeometri;

public class PrismaSegitiga extends Segitiga implements IBenda3D {
    private double tinggiPrisma;

    public PrismaSegitiga() {
        super();
        this.tinggiPrisma = 0;
    }

    public PrismaSegitiga(double alas,double tinggi,double sisiMiring1, double sisiMiring2, double tinggiPrisma) {
        super(alas, tinggiPrisma, sisiMiring1, sisiMiring2);
        this.tinggiPrisma = tinggiPrisma;
    }

    public PrismaSegitiga(int alas, int tinggi, int sisiMiring1, int sisiMiring2, int tinggiPrisma) {
        super(alas, tinggiPrisma, sisiMiring1, sisiMiring2);
        this.tinggiPrisma = tinggiPrisma;
    }

    @Override
    public double menghitungVolume() {
        double luasAlas = super.menghitungLuas();
        return luasAlas * tinggiPrisma; 
    }

    
    public double menghitungVolume(double[] params) {
        if (params.length >= 1) {
            return super.menghitungLuas() * params[0];
        }
        return 0.0;
    }

   
    public double menghitungVolume(int[] params) {
        if (params.length >= 1) {
            return menghitungVolume(new double[] { params[0] });
        }
        return 0.0;

    }

    @Override
    public double menghitungLuasPermukaan() {
        double luasAlas = super.menghitungLuas();
        double kelilingAlas = super.menghitungKeliling();
        return 2 * luasAlas + kelilingAlas * tinggiPrisma;
    }


    public double menghitungLuasPermukaan(double[] params) {
        if (params.length >= 1) {
            return 2 * super.menghitungLuas() + super.menghitungKeliling() * params[0];
        }
        return 0.0;
    }

    
    public double menghitungLuasPermukaan(int[] params) {
        if (params.length >= 1) {
            return menghitungLuasPermukaan(new double[] { params[0] });
        }
        return 0.0;
    }

    @Override
    public void mencetakVolume() {
        System.out.printf("Volume Prisma Segitiga: %.2f\n", menghitungVolume());
    }

    @Override
    public void mencetakLuasPermukaan() {
        System.out.printf("Luas Permukaan Prisma Segitiga: %.2f\n", menghitungLuasPermukaan());
    }
}