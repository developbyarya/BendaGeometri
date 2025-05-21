package BendaGeometri;

public class Lingkaran extends Benda2D {

	private double radius;
        private float luas, keliling;

	public Lingkaran() {
		this.radius = 0;
	}

	public Lingkaran(double radius) {
		this.radius = radius;
	}

	public Lingkaran(int radius) {
		this.radius = radius;
	}

	public void cetakRadius() {
		System.out.println("Radius: " + this.radius);
	}

	public void aturRadius(double radius) {
		this.radius = radius;
	}

	public void aturRadius(int radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return this.radius;
	}
	@Override
	public float menghitungLuas() {
		this.luas = (float) (Math.PI * this.radius * this.radius);
                return (this.luas);
	}

	public double menghitungLuas(double radius) {
			double luas = Math.PI * radius * radius;
			return luas;
	}

	public double menghitungLuas(int radius) {
			double luas = Math.PI * radius * radius;
			return luas;
		}


	@Override
	public float menghitungKeliling() {
		this.keliling = (float) (2 * Math.PI * this.radius);
        return this.keliling;
	}

	public double menghitungKeliling(double radius) {
		double keliling = 2 * Math.PI * radius;
		return keliling;
	}

	public double menghitungKeliling(int radius) {
		return 2 * Math.PI * radius;
	}
	@Override
	public void mencetakLuas() {
		System.out.println("Luas Lingkaran: " + menghitungLuas());
	}

	@Override
	public void mencetakKeliling() {
		System.out.println("Keliling Lingkaran: " + menghitungKeliling());
	}
}
