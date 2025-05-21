package BendaGeometri;

public class JajaranGenjang extends Benda2D {

	private double alas;
	private double tinggi;
	private double sisiMiring;

	public JajaranGenjang() {
		this.alas = 0;
		this.tinggi = 0;
		this.sisiMiring = 0;
	}

	public JajaranGenjang(double alas, double tinggi, double sisiMiring) {
		this.alas = alas;
		this.tinggi = tinggi;
		this.sisiMiring = sisiMiring;
	}

	public JajaranGenjang(int alas, int tinggi, int sisiMiring) {
		this.alas = alas;
		this.tinggi = tinggi;
		this.sisiMiring = sisiMiring;
	}

	public void cetakAlas() {
		System.out.println("Alas: " + this.alas);
	}

	public void cetakTinggi() {
		System.out.println("Tinggi: " + this.tinggi);
	}

	public void cetakSisiMiring() {
		System.out.println("Sisi Miring: " + this.sisiMiring);
	}

	public void aturAlas(double alas) {
		this.alas = alas;
	}

	public void aturAlas(int alas) {
		this.alas = alas;
	}

	public void aturTinggi(double tinggi) {
		this.tinggi = tinggi;
	}

	public void aturTinggi(int tinggi) {
		this.tinggi = tinggi;
	}

	public void aturSisiMiring(double sisiMiring) {
		this.sisiMiring = sisiMiring;
	}

	public void aturSisiMiring(int sisiMiring) {
		this.sisiMiring = sisiMiring;
	}


	public double getAlas() {
		return alas;
	}

	public double getTinggi() {
		return tinggi;
	}

	public double getSisiMiring() {
		return sisiMiring;
	}

	@Override
	public float menghitungLuas() {
		float luas = (float) (this.alas * this.tinggi);
		return luas;
	}

	public double menghitungLuas(double alas, double tinggi) {
		double luas = alas * tinggi;
		return luas;
	}

	public double menghitungLuas(int alas, int tinggi) {
		double luas = alas * tinggi;
		return luas;
	}

	@Override
	public float menghitungKeliling() {
		float keliling = (float) (2 * (this.alas + this.sisiMiring));
		return keliling;
	}
	
	public double menghitungKeliling(double alas, double sisiMiring) {
		double keliling = 2 * (alas + sisiMiring);
		return keliling;
	}

	public double menghitungKeliling(int alas, int sisiMiring) {
		double keliling = 2 * (alas + sisiMiring);
		return keliling;
	}

	@Override
	public void mencetakLuas() {
		System.out.println("Luas Jajaran Genjang: " + menghitungLuas());
	}

	@Override
	public void mencetakKeliling() {
		System.out.println("Keliling Jajaran Genjang: " + menghitungKeliling());
	}
}
