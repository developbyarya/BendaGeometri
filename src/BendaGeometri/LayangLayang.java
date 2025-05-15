package BendaGeometri;
public class LayangLayang extends Benda2D {

	private double diagonal1;
	private double diagonal2;
	private double sisiPendek;
	private double sisiPanjang;

	public LayangLayang() {
		this.diagonal1 = 0;
		this.diagonal2 = 0;
		this.sisiPendek = 0;
		this.sisiPanjang = 0;
	}

	public LayangLayang(double diagonal1, double diagonal2, double sisiPendek, double sisiPanjang) {
		this.diagonal1 = diagonal1;
		this.diagonal2 = diagonal2;
		this.sisiPendek = sisiPendek;
		this.sisiPanjang = sisiPanjang;
	}

	public LayangLayang(int diagonal1, int diagonal2, int sisiPendek, int sisiPanjang) {
		this.diagonal1 = diagonal1;
		this.diagonal2 = diagonal2;
		this.sisiPendek = sisiPendek;
		this.sisiPanjang = sisiPanjang;
	}

	public void cetakDiagonal1() {
		System.out.println("Diagonal 1: " + this.diagonal1);
	}

	public void cetakDiagonal2() {
		System.out.println("Diagonal 2: " + this.diagonal2);
	}

	public void cetakSisiPendek() {
		System.out.println("Sisi Pendek: " + this.sisiPendek);
	}

	public void cetakSisiPanjang() {
		System.out.println("Sisi Panjang: " + this.sisiPanjang);
	}

	public void aturDiagonal1(double diagonal1) {
		this.diagonal1 = diagonal1;
	}

	public void aturDiagonal1(int diagonal1) {
		this.diagonal1 = diagonal1;
	}

	public void aturDiagonal2(double diagonal2) {
		this.diagonal2 = diagonal2;
	}

	public void aturDiagonal2(int diagonal2) {
		this.diagonal2 = diagonal2;
	}

	public void aturSisiPendek(double sisiPendek) {
		this.sisiPendek = sisiPendek;
	}

	public void aturSisiPendek(int sisiPendek) {
		this.sisiPendek = sisiPendek;
	}

	public void aturSisiPanjang(double sisiPanjang) {
		this.sisiPanjang = sisiPanjang;
	}

	public void aturSisiPanjang(int sisiPanjang) {
		this.sisiPanjang = sisiPanjang;
	}

	@Override
	public float menghitungLuas() {
		return (float)(2 *(this.diagonal1 * this.diagonal2) / 2.0);
	}
	public double menghitungLuas(double d1, double d2) {
		return (d1 * d2) / 2;
	}

	public double menghitungLuas(int d1, int d2) {
		return (d1 * d2) / 2;
	}

	@Override
	public float menghitungKeliling() {
		return (float)(2 * (this.sisiPendek + this.sisiPanjang));
	}

	public double menghitungKeliling(int sisiPendek, int sisiPanjang) {
		return 2*sisiPendek + 2*sisiPanjang;
	}

	public double menghitungKeliling(double sisiPendek, double sisiPanjang) {
		return 2*sisiPendek + 2*sisiPanjang;
	}

	@Override
	public void mencetakLuas() {
		System.out.println("Luas Layang-Layang: " + menghitungLuas());
	}

	@Override
	public void mencetakKeliling() {
		System.out.println("Keliling Layang-Layang: " + menghitungKeliling());
	}
}
