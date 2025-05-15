package BendaGeometri;

/**
 * 
 */
public class PrismaLayangLayang extends LayangLayang implements IBenda3D {

	/**
	 * Default constructor
	 */
	public PrismaLayangLayang() {
	}

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

 	@Override
    public double menghitungVolume(int[] params) {
        // Example implementation: Assuming params[0] is base area and params[1] is height
        if (params.length >= 2) {
            return params[0] * params[1];
        }
        return 0.0d;
    }

    @Override
    public double menghitungLuasPermukaan() {
        // Example implementation: Placeholder logic
        return 2*super.getLuas() + super.getKeliling() * tinggi;
    }

    @Override
    public double menghitungLuasPermukaan(double[] params) {
        // Example implementation: Assuming params[0] is base area and params[1] is lateral area
        if (params.length >= 2) {
            return params[0] + params[1];
        }
        return 0.0d;
    }

    // Other methods from IBenda3D must also be implemented here
    @Override
    public double menghitungVolume(double[] params) {
        // TODO: Implement logic
        return 0.0d;
    }

    @Override
    public double menghitungVolume() {
        // TODO: Implement logic
        return super.getLuas() * tinggi;
    }

    @Override
    public double menghitungLuasPermukaan(int[] params) {
        // TODO: Implement logic

        return 0.0d;

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