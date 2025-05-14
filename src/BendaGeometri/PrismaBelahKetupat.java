package BendaGeometri;

/**
 * 
 */
public class PrismaBelahKetupat extends BelahKetupat implements IBenda3D {

	/**
	 * Default constructor
	 */
	public PrismaBelahKetupat() {
	}

	/**
	 * 
	 */
	private double tinggi;


// Constructor
    public PrismaBelahKetupat(double diagonal1, double diagonal2, double tinggi) {
        this.tinggi = tinggi;
    }

    // Calculate the volume of the prism
    @Override
    public double menghitungVolume() {
        double luasAlas = super.getLuas(); // Area of the rhombus base
        return luasAlas * tinggi;
    }

    @Override
    public double menghitungVolume(double[] params) {
        if (params.length >= 3) {
            double d1 = params[0];
            double d2 = params[1];
            double height = params[2];
            double luasAlas = (d1 * d2) / 2;
            return luasAlas * height;
        }
        return 0.0;
    }

    @Override
    public double menghitungVolume(int[] params) {
        if (params.length >= 3) {
            double d1 = params[0];
            double d2 = params[1];
            double height = params[2];
            double luasAlas = (d1 * d2) / 2;
            return luasAlas * height;
        }
        return 0.0;
    }

    // Calculate the surface area of the prism
    @Override
    public double menghitungLuasPermukaan() {
        double luasAlas = this.getLuas(); // Area of the rhombus base
        double kelilingAlas =this.getKeliling(); 
        return (2 * luasAlas) + (kelilingAlas * tinggi);
    }

    @Override
    public double menghitungLuasPermukaan(double[] params) {
        if (params.length >= 3) {
            double d1 = params[0];
            double d2 = params[1];
            double height = params[2];
            double luasAlas = (d1 * d2) / 2;
            double kelilingAlas = 4 * Math.sqrt(Math.pow(d1 / 2, 2) + Math.pow(d2 / 2, 2));
            return (2 * luasAlas) + (kelilingAlas * height);
        }
        return 0.0;
    }

    @Override
    public double menghitungLuasPermukaan(int[] params) {
        if (params.length >= 3) {
            double d1 = params[0];
            double d2 = params[1];
            double height = params[2];
            double luasAlas = (d1 * d2) / 2;
            double kelilingAlas = 4 * Math.sqrt(Math.pow(d1 / 2, 2) + Math.pow(d2 / 2, 2));
            return (2 * luasAlas) + (kelilingAlas * height);
        }
        return 0.0;
    }

    // Print the volume of the prism
    @Override
    public void mencetakVolume() {
        System.out.println("Volume: " + menghitungVolume());
    }

    // Print the surface area of the prism
    @Override
    public void mencetakLuasPermukaan() {
        System.out.println("Luas Permukaan: " + menghitungLuasPermukaan());
    }

}