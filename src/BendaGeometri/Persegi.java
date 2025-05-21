package BendaGeometri;
public class Persegi extends Benda2D {

	private double sisi;

	public Persegi() {
		this.sisi = 0;
	}

	public Persegi(double sisi) {
		this.sisi = sisi;
	}

	public Persegi(int sisi) {
		this.sisi = sisi;
	}

	public void cetakSisi() {
		System.out.println("Sisi: " + this.sisi);
	}

	public void aturSisi(double sisi) {
		this.sisi = sisi;
	}

	public void aturSisi(int sisi) {
		this.sisi = sisi;
	}
	public double getSisi() {
        return sisi;
    }

	@Override
	public float menghitungLuas() {
		float luas = (float) (this.sisi * this.sisi);
		return luas;
	}

	public double menghitungLuas(double sisi) {
		double luas = sisi * sisi;
		return luas;
	}

	public double menghitungLuas(int sisi) {
		double luas = sisi * sisi;
		return luas;
	}

	@Override
	public float menghitungKeliling() {
		float keliling = (float) (4 * this.sisi);
		return keliling;
	}

	public double menghitungKeliling(double sisi) {
		double keliling = 4 * sisi;
		return keliling;
	}

	public double menghitungKeliling(int sisi) {
		double keliling = 4 * sisi;
		return keliling;
	}

	@Override
	public void mencetakLuas() {
		System.out.println("Luas Persegi: " + menghitungLuas());
	}

	@Override
	public void mencetakKeliling() {
		System.out.println("Keliling Persegi: " + menghitungKeliling());
	}
}
