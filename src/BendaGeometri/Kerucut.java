package BendaGeometri;

public class Kerucut extends Lingkaran implements IBenda3D {


	public Kerucut() {
		super();
		this.tinggi = 0;
	}

	private double tinggi;

	public Kerucut(double radius, double tinggi) {
		super(radius);
		this.tinggi = tinggi;
	}

	/**
	 * @param bendaAlas 
	 * @param tinggi
	 */
	public Kerucut(int radius, int tinggi) {
		super(radius);
		this.tinggi = tinggi;
	}

	@Override
	public double menghitungVolume() {
		double luasAlas = menghitungLuas();
		return (1/3.0) * luasAlas * tinggi;
	}

	public double menghitungVolume(double radius, double tinggi) {
		double luasAlas = menghitungLuas(radius);
		return (1/3.0) * luasAlas * tinggi;
	}

	public double menghitungVolume(int radius, int tinggi) {
		double luasAlas = menghitungLuas(radius);
		return (1/3.0) * luasAlas * tinggi;
	}

	@Override
	public double menghitungLuasPermukaan() {
		double luasAlas = super.menghitungLuas();
		double sisiMiring = Math.sqrt(Math.pow(tinggi, 2) + Math.pow(super.getRadius(), 2)); 
		double selimut = Math.PI * super.getRadius() * sisiMiring;
		return luasAlas + selimut;
	}


	public double menghitungLuasPermukaan(double tinggi, double radius) {
		double luasAlas = super.menghitungLuas();
		double sisiMiring = Math.sqrt(Math.pow(tinggi, 2) + Math.pow(radius, 2)); 
		double selimut = Math.PI * radius * sisiMiring;
		return luasAlas + selimut;
	}

	public double menghitungLuasPermukaan(int tinggi, int radius) {
		double luasAlas = super.menghitungLuas();
		double sisiMiring = Math.sqrt(Math.pow(tinggi, 2) + Math.pow(radius, 2)); 
		double selimut = Math.PI * radius * sisiMiring;
		return luasAlas + selimut;
	}

	
	@Override
	public void mencetakVolume() {
		System.out.println("Volume kerucut: " + this.menghitungVolume());
		
	}

	/**
	 * @return
	 */
	@Override
	public void mencetakLuasPermukaan() {
		System.out.println("LP kerucut: " + this.menghitungLuasPermukaan());
		
	}
}