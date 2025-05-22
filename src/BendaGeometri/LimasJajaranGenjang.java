	package BendaGeometri;


	public class LimasJajaranGenjang extends JajaranGenjang implements IBenda3D {

		/**
		 * Default constructor
		 */
		public LimasJajaranGenjang() {
			super();
			this.tinggi = 0;
			
		}

		/**
		 * 
		 */
		private double tinggi;

		/**
		 * 
		 */
		private JajaranGenjang bendaAlas;

		/**
		 * @param bendaAlas 
		 * @param tinggi
		 */
		public LimasJajaranGenjang(double panjang_alas, double tinggi_alas, double sisi_miring_alas, double tinggi) {
			super(panjang_alas, tinggi_alas, sisi_miring_alas);
			this.tinggi = tinggi;
		}

		/**
		 * @param bendaAlas 
		 * @param tinggi
		 */
		public LimasJajaranGenjang(int panjang_alas, int tinggi_alas, int sisi_miring_alas, int tinggi) {
			super(panjang_alas, tinggi_alas, sisi_miring_alas);
			this.tinggi = tinggi;
		}

		/**
		 * @return
		 */
		@Override
		public double menghitungVolume() {
			double luasAlas = bendaAlas.menghitungLuas();
			return (1/3.0) * luasAlas * tinggi;
		}

		/**
		 * @param params 
		 * @return
		 */
		public double menghitungVolume(int panjang_alas, int tinggi_alas, int tinggi) {
			double luasAlas = bendaAlas.menghitungLuas(panjang_alas, tinggi_alas);
			return (1/3.0) * luasAlas * tinggi;
		}

		/**
		 * @param params 
		 * @return
		 */
		public double menghitungVolume(double panjang_alas, double tinggi_alas, double tinggi) {
			double luasAlas = bendaAlas.menghitungLuas(panjang_alas, tinggi_alas);
			return (1/3.0) * luasAlas * tinggi;
		}

		/**
		 * @return
		 */
		@Override
		public double menghitungLuasPermukaan() {
			double luasAlas =  super.menghitungLuas();
			double alas =  super.getAlas();
			double tinggiAlas =  super.getTinggi();
			double miring =  super.getSisiMiring();
			
			// Menghitung luas segitiga pada sisi tegak
			double luasSegitiga1 = (1/2.0) * alas * tinggi;
			double luasSegitiga2 = (1/2.0) * miring * tinggi;
			double luasSegitiga3 = (1/2.0) * alas * tinggi;
			double luasSegitiga4 = (1/2.0) * miring * tinggi;
			
			return luasAlas + luasSegitiga1 + luasSegitiga2 + luasSegitiga3 + luasSegitiga4;
		}

		/**
		 * @param params 
		 * @return
		 */

		public double menghitungLuasPermukaan(double panjang_alas, double tinggi_alas, double sisi_miring_alas, double tinggi) {
			double luasAlas =  super.menghitungLuas(panjang_alas, tinggi_alas);
			// Menghitung luas segitiga pada sisi tegak
			double luasSegitiga1 = (1/2.0) * panjang_alas * tinggi;
			double luasSegitiga2 = (1/2.0) * sisi_miring_alas * tinggi;
			double luasSegitiga3 = (1/2.0) * panjang_alas * tinggi;
			double luasSegitiga4 = (1/2.0) * sisi_miring_alas * tinggi;
			
			return luasAlas + luasSegitiga1 + luasSegitiga2 + luasSegitiga3 + luasSegitiga4;
		}

		/**
		 * @param params 
		 * @return
		 */

	
		public double menghitungLuasPermukaan(int panjang_alas, int tinggi_alas, int sisi_miring_alas, int tinggi) {
			double luasAlas =  super.menghitungLuas(panjang_alas, tinggi_alas);
		
		
		// Menghitung luas segitiga pada sisi tegak
		double luasSegitiga1 = (1/2.0) * luasAlas * tinggi;
		double luasSegitiga2 = (1/2.0) * sisi_miring_alas * tinggi;
		double luasSegitiga3 = (1/2.0) * luasAlas * tinggi;
		double luasSegitiga4 = (1/2.0) *  sisi_miring_alas * tinggi;
		
		
		
		return luasAlas + luasSegitiga1 + luasSegitiga2 + luasSegitiga3 + luasSegitiga4;
	}

	/**
	 * @return
	 */
	@Override
	public void mencetakVolume() {
		// TODO implement here
		
	}

	/**
	 * @return
	 */
	@Override
	public void mencetakLuasPermukaan() {
		// TODO implement here
		
	}
}
