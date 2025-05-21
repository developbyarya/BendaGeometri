package BendaGeometri;
public class PersegiPanjang extends Benda2D {

	private double panjang;
	private double lebar;

	public PersegiPanjang() {
		this.panjang = 0;
		this.lebar = 0;
	}

	public PersegiPanjang(double panjang, double lebar) {
		this.panjang = panjang;
		this.lebar = lebar;
	}

	public PersegiPanjang(int panjang, double lebar) {
		this.panjang = panjang;
		this.lebar = lebar;
	}

	public PersegiPanjang(double panjang, int lebar) {
		this.panjang = panjang;
		this.lebar = lebar;
	}

	public PersegiPanjang(int panjang, int lebar) {
		this.panjang = panjang;
		this.lebar = lebar;
	}

	public void cetakPanjang() {
		System.out.println("Panjang: " + this.panjang);
	}

	public void cetakLebar() {
		System.out.println("Lebar: " + this.lebar);
	}

	public void aturPanjang(double panjang) {
		this.panjang = panjang;
	}

	public void aturPanjang(int panjang) {
		this.panjang = panjang;
	}

	public void aturLebar(double lebar) {
		this.lebar = lebar;
	}

	public void aturLebar(int lebar) {
		this.lebar = lebar;
	}
	public double getPanjang() {
		return panjang;
	}
	public double getLebar() {
		return lebar;
	}
	@Override
	public float menghitungLuas() {
		float luas = (float)(this.panjang * this.lebar);
		return luas;
	}

	public double menghitungLuas(double panjang, double lebar) {
		double luas = panjang * lebar;
		return luas;
	}

	public double menghitungLuas(int panjang, int lebar) {
		double luas = panjang * lebar;
		return luas;
	}

	@Override
	public float menghitungKeliling() {
		float keliling = (float)(2 * (this.panjang + this.lebar));
		return keliling;
	}

	public double menghitungKeliling(double panjang, double lebar) {
		double keliling = 2 * (panjang + lebar);
		return keliling;
	}

	public double menghitungKeliling(int panjang, int lebar) {
		double keliling = 2 * (panjang + lebar);
		return keliling;
	}

	@Override
	public void mencetakLuas() {
        System.out.printf("Luas Persegi Panjang: %.2f\n", menghitungLuas());
	}

	@Override
	public void mencetakKeliling() {
        System.out.printf("Keliling Persegi Panjang: %.2f\n", menghitungKeliling());
	}
}
