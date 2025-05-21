package BendaGeometri;

public class TemberengLingkaran extends JuringLingkaran {
    public TemberengLingkaran() {
        super();
    }

    public TemberengLingkaran(double radius, double sudut) {
        super(radius, sudut);
    }

    public TemberengLingkaran(int radius, int sudut) {
        super(radius, sudut);
    }
    private double hitungLuasSegitiga(double radius, double sudutDerajat) {
        return Segitiga.menghitungLuasDuaSisiSudut(radius, radius, sudutDerajat);
    }
    @Override
    public float menghitungLuas() {
        double r = getRadius();
        double s = getSudut();
        double luasJuring    = super.menghitungLuas();
        double luasSegitiga = hitungLuasSegitiga(r, s);
        float luasTembereng = (float) (luasJuring - luasSegitiga);
        return luasTembereng;
    }


    public double menghitungLuas(double radius, double sudut) {
        double luasJuring = (sudut / 360.0) *super.menghitungLuas(radius);
        double luasSegitiga = hitungLuasSegitiga(radius, sudut);
        double luasTembereng = luasJuring - luasSegitiga;
        return luasTembereng;
    }

    public double menghitungLuas(int radius, int sudut) {
         double luasJuring = (sudut / 360.0) *super.menghitungLuas(radius);
        double luasSegitiga = hitungLuasSegitiga(radius, sudut);
        double luasTembereng = luasJuring - luasSegitiga;
        return luasTembereng;
    }

    /**
     * Override keliling tembereng:
     * busur + chord
     */
    @Override
    public float menghitungKeliling() {
        double r = getRadius();
        double s = getSudut();
        double busur = 2 * Math.PI * r * (s / 360.0);
        double chord = 2 * r * Math.sin(Math.toRadians(s / 2.0));
        return (float) (busur + chord);
    }

    /** Overload eksplisit dengan double */
    public double menghitungKeliling(double radius, double sudut) {
        double busur = 2 * Math.PI * radius * (sudut / 360.0);
        double chord = 2 * radius * Math.sin(Math.toRadians(sudut / 2.0));
        return busur + chord;
    }

    /** Overload eksplisit dengan int */
    public double menghitungKeliling(int radius, int sudut) {
        return menghitungKeliling((double) radius, (double) sudut);
    }

    @Override
    public void mencetakLuas() {
        System.out.printf("Luas Tembereng Lingkaran: %.2f%n", menghitungLuas());
    }

    @Override
    public void mencetakKeliling() {
        System.out.printf("Keliling Tembereng Lingkaran: %.2f%n", menghitungKeliling());
    }
}
