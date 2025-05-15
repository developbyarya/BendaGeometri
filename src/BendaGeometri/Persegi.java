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
		return (float) (this.sisi * this.sisi);
	}

	public double menghitungLuas(double sisi) {
		return sisi * sisi;
	}

	public double menghitungLuas(int sisi) {
		return sisi * sisi;
	}

	@Override
	public float menghitungKeliling() {
		return (float) (4 * this.sisi);
	}

	public double menghitungKeliling(double sisi) {
		return sisi * sisi;
	}

	public double menghitungKeliling(int sisi) {
		return sisi * sisi;
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
