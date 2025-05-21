package BendaGeometri;

public class Segitiga extends Benda2D {

	private double alas;
	private double tinggi;
	private double sisiMiring1;
	private double sisiMiring2;

	public Segitiga() {
		this.alas = 0;
		this.tinggi = 0;
		this.sisiMiring1 = 0;
		this.sisiMiring2 = 0;
	}

	public Segitiga(double alas, double tinggi, double sisiMiring1, double sisiMiring2) {
		this.alas = alas;
		this.tinggi = tinggi;
		this.sisiMiring1 = sisiMiring1;
		this.sisiMiring2 = sisiMiring2;
	}

	public Segitiga(int alas, int tinggi, int sisiMiring1, int sisiMiring2) {
		this.alas = alas;
		this.tinggi = tinggi;
		this.sisiMiring1 = sisiMiring1;
		this.sisiMiring2 = sisiMiring2;
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

	public void aturSisiMiring1(double sisi) {
		this.sisiMiring1 = sisi;
	}

	public void aturSisiMiring2(double sisi) {
		this.sisiMiring2 = sisi;
	}
	public double getAlas() {
        return alas;
    }

    public double getTinggiSegitiga() { 
        return tinggi;
    }

    public double getSisiMiring1() {
        return sisiMiring1;
    }

    public double getSisiMiring2() {
        return sisiMiring2;
    }

	public void cetakAlas() {
		System.out.println("Alas: " + alas);
	}

	public void cetakTinggi() {
		System.out.println("Tinggi: " + tinggi);
	}

	public void cetakSisiMiring1() {
		System.out.println("Sisi Miring 1: " + sisiMiring1);
	}

	public void cetakSisiMiring2() {
		System.out.println("Sisi Miring 2: " + sisiMiring2);
	}

	public static double menghitungLuasDuaSisiSudut(double a, double b, double sudutDerajat) {
		double sudutRadian = Math.toRadians(sudutDerajat);
		return 0.5 * a * b * Math.sin(sudutRadian);
	}	

	@Override
	public float menghitungLuas() {
		float luas = (float) (0.5 * this.alas * this.tinggi);
		return luas;
	}


	public double menghitungLuas(double alas, double tinggi) {
		double luas = 0.5 * alas * tinggi;
		return luas;
		
	}

	public double menghitungLuas(int alas, int tinggi) {
		double luas = 0.5 * alas * tinggi;
		return luas;
	}

	@Override
	public float menghitungKeliling() {
		float keliling = (float) (this.alas + this.sisiMiring1 + this.sisiMiring2);
		return keliling;
	}
	public double menghitungKeliling(double alas,double sisiMiring1, double sisiMiring2) {
		double keliling = alas + sisiMiring1 + sisiMiring2;
		return keliling;
	}

	public double menghitungKeliling(int alas,int sisiMiring1, int sisiMiring2) {
		double keliling = alas + sisiMiring1 + sisiMiring2;
		return keliling;
	}

	@Override
	public void mencetakLuas() {
		System.out.printf("Luas Segitiga: %.2f\n", menghitungLuas());
	}

	@Override
	public void mencetakKeliling() {
		System.out.printf("Keliling Segitiga: %.2f\n", menghitungKeliling());
	}
}
