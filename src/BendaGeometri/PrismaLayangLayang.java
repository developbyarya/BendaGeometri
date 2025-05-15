package BendaGeometri;

/**
 * 
 */
public class PrismaLayangLayang extends LayangLayang implements IBenda3D {

	/**
	 * 
	 */
	private double tinggi;

	/**
	 * 
	 */

	/**
	 * @param bendaAlas 
	 * @param tinggi
	 */
	public PrismaLayangLayang(double tinggi) {
		// TODO implement here
		this.tinggi = tinggi;
	}

	/**
	 * @param bendaAlas 
	 * @param tinggi
	 */
	public PrismaLayangLayang(int tinggi) {
		// TODO implement here
		this.tinggi = tinggi;
	}

 	// @Override
    public double menghitungVolume(double diagonal1, double diagonal2) {
        double luas_alas = (diagonal1 * diagonal2) / 2;
        return luas_alas * this.tinggi;
    }

    @Override
    public double menghitungLuasPermukaan() {
        // Example implementation: Placeholder logic
        return 2*super.getLuas() + super.getKeliling() * tinggi;
    }

    public double menghitungLuasPermukaan(double diagonal1, double diagonal2, double sisi_pendek, double sisi_panjang) {
        // Alas dan Tutup
        double luasBendaDasar = (diagonal1*diagonal2)/2;
        double luasSisiPendek = (sisi_pendek*tinggi);
        double luasSisiPanjang = (sisi_panjang*tinggi);


        return 2*luasBendaDasar + 2*luasSisiPendek + 2*luasSisiPanjang;
    }

    // Other methods from IBenda3D must also be implemented here
    public double menghitungVolume(int diagonal1, int diagonal2) {
        double luasAlas = (diagonal1 * diagonal2) / 2;
        return luasAlas * tinggi;
    }

    @Override
    public double menghitungVolume() {
        // TODO: Implement logic
        return super.getLuas() * tinggi;
    }

    public double menghitungLuasPermukaan(int diagonal1, int diagonal2, int sisi_pendek, int sisi_panjang) {
        // TODO: Implement logic

        double luasBendaDasar = (diagonal1*diagonal2)/2;
        double luasSisiPendek = (sisi_pendek*tinggi);
        double luasSisiPanjang = (sisi_panjang*tinggi);


        return 2*luasBendaDasar + 2*luasSisiPendek + 2*luasSisiPanjang;

    }

    @Override
    public void mencetakVolume() {
        System.out.println("Volume: " + menghitungVolume());
    }

    @Override
    public void mencetakLuasPermukaan() {
        System.out.println("Luas Permukaan: " + menghitungLuasPermukaan());
    }
}