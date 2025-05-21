package BendaGeometri;

public class Bola extends Lingkaran implements IBenda3D {

	private double radius, volume, luas_permukaan;
	public Bola() {
		super();
	}


	
	public Bola(double radius) {
		super(radius);
	}

	public Bola(int radius) {
		super(radius);
	}

	@Override
	public double menghitungVolume() {
		this.volume = (4.0 / 3.0) * super.menghitungLuas() * radius;
		return volume;
	}

	public double menghitungVolume(double radius) {
		return 4.0 / 3.0 * super.menghitungLuas(radius) * radius;
	}

	public double menghitungVolume(int radius) {
		return 4.0 / 3.0 * super.menghitungLuas(radius) * radius;
	}

	@Override
	public double menghitungLuasPermukaan() {
		this.luas_permukaan = 2 * super.menghitungKeliling() * radius;
		return this.luas_permukaan;
	}

	public double menghitungLuasPermukaan(int radius) {
		return 2 * super.menghitungKeliling(radius) * radius;
	}

	public double menghitungLuasPermukaan(double radius) {
		return 2 * super.menghitungKeliling(radius) * radius;
	}

	@Override
	public void mencetakVolume() {
		System.out.println("Volume Bola: " + this.volume);

	}

	@Override
	public void mencetakLuasPermukaan() {
		System.out.println("LP Bola: " + this.luas_permukaan);
	}
}