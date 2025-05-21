package BendaGeometri;

public class JuringLingkaran extends Lingkaran {
    private double sudut; 

    public JuringLingkaran() {
        super();
        this.sudut = 0;
    }

    public JuringLingkaran(double radius, double sudut) {
        super(radius);
        this.sudut = sudut;
    }

    public JuringLingkaran(int radius, int sudut) {
        super(radius);
        this.sudut = sudut;
    }

    public void aturSudut(double sudut) {
        this.sudut = sudut;
    }

    public void aturSudut(int sudut) {
        this.sudut = sudut;
    }

    public double getSudut() {
        return sudut;
    }

    @Override
    public float menghitungLuas() {
        float luas = (float) ((this.sudut / 360.0) * super.menghitungLuas());
        return luas;
    }

    public double menghitungLuas(double radius, double sudut) {
        double luas = (sudut / 360.0) * super.menghitungLuas(radius);
        return luas;
    }

    public double menghitungLuas(int radius, int sudut) {
        double luas = (sudut / 360.0) * super.menghitungLuas(radius);
        return luas;
    }

    @Override
    public float menghitungKeliling() {
		double r = super.getRadius();
        double busur = super.menghitungKeliling() * (sudut / 360.0);
        float keliling = (float) (busur + 2 * r);
        return keliling;
    }

    public double menghitungKeliling(double radius, double sudut) {
        double busur = super.menghitungKeliling(radius) * (sudut / 360.0);
        double keliling = busur + 2 * radius;
        return keliling;
    }

    public double menghitungKeliling(int radius, int sudut) {
        double busur = super.menghitungKeliling(radius) * (sudut / 360.0);
        double keliling = busur + 2 * radius;
        return keliling;
    }

    @Override
    public void mencetakLuas() {
        System.out.printf("Luas Juring Lingkaran: %.2f%n", menghitungLuas());
    }

    @Override
    public void mencetakKeliling() {
        System.out.printf("Keliling Juring Lingkaran: %.2f%n", menghitungKeliling());
    }
}
