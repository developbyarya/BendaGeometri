package BendaGeometri;

public class Trapesium extends Benda2D {

    private double alasAtas;
    private double alasBawah;
    private double tinggi;
    private double sisiKiri;
    private double sisiKanan;

    public Trapesium() {
        this.alasAtas = 0;
        this.alasBawah = 0;
        this.tinggi = 0;
        this.sisiKiri = 0;
        this.sisiKanan = 0;
    }

    public Trapesium(double alasAtas, double alasBawah, double tinggi, double sisiKiri, double sisiKanan) {
        this.alasAtas = alasAtas;
        this.alasBawah = alasBawah;
        this.tinggi = tinggi;
        this.sisiKiri = sisiKiri;
        this.sisiKanan = sisiKanan;
    }

    public Trapesium(int alasAtas, int alasBawah, int tinggi, int sisiKiri, int sisiKanan) {
        this.alasAtas = alasAtas;
        this.alasBawah = alasBawah;
        this.tinggi = tinggi;
        this.sisiKiri = sisiKiri;
        this.sisiKanan = sisiKanan;
    }

    public void cetakAlasAtas() {
        System.out.println("Alas Atas: " + alasAtas);
    }

    public void cetakAlasBawah() {
        System.out.println("Alas Bawah: " + alasBawah);
    }

    public void cetakTinggi() {
        System.out.println("Tinggi: " + tinggi);
    }

    public void cetakSisiKiri() {
        System.out.println("Sisi Kiri: " + sisiKiri);
    }

    public void cetakSisiKanan() {
        System.out.println("Sisi Kanan: " + sisiKanan);
    }

    public void aturAlasAtas(double alasAtas) {
        this.alasAtas = alasAtas;
    }

    public void aturAlasAtas(int alasAtas) {
        this.alasAtas = alasAtas;
    }

    public void aturAlasBawah(double alasBawah) {
        this.alasBawah = alasBawah;
    }

    public void aturAlasBawah(int alasBawah) {
        this.alasBawah = alasBawah;
    }

    public void aturTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void aturTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public void aturSisiKiri(double sisiKiri) {
        this.sisiKiri = sisiKiri;
    }

    public void aturSisiKiri(int sisiKiri) {
        this.sisiKiri = sisiKiri;
    }

    public void aturSisiKanan(double sisiKanan) {
        this.sisiKanan = sisiKanan;
    }

    public void aturSisiKanan(int sisiKanan) {
        this.sisiKanan = sisiKanan;
    }
    public double getAlasAtas() {
        return alasAtas;
    }

    public double getAlasBawah() {
        return alasBawah;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double getSisiKiri() {
        return sisiKiri;
    }

    public double getSisiKanan() {
        return sisiKanan;
    }

    public double menghitungLuas(double alasAtas, double alasBawah, double tinggi) {
        return 0.5 * (alasAtas + alasBawah) * tinggi;
    }

    public double menghitungLuas(int alasAtas, int alasBawah, int tinggi) {
        return 0.5 * (alasAtas + alasBawah) * tinggi;
    }

    @Override
    public float menghitungLuas() {
        return (float) (0.5 * (alasAtas + alasBawah) * tinggi);
    }

    @Override
    public float menghitungKeliling() {
        return (float) (alasAtas + alasBawah + sisiKiri + sisiKanan);
    }

    public double menghitungKeliling(double alasAtas, double alasBawah, double sisiKanan, double sisiKiri) {
        return alasAtas + alasBawah + sisiKanan + sisiKiri;
    }

    public double menghitungKeliling(int alasAtas, int alasBawah, int sisiKanan, int sisiKiri) {
        return alasAtas + alasBawah + sisiKanan + sisiKiri;
    }

    @Override
    public void mencetakLuas() {
        System.out.printf("Luas Trapesium: %.2f\n", menghitungLuas());
    }

    @Override
    public void mencetakKeliling() {
        System.out.printf("Keliling Trapesium: %.2f\n", menghitungKeliling());
    }
}
