package BendaGeometri;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class KerucutTerpancung extends Kerucut implements IBenda3D {

	/**
	 * Default constructor
	 */
	public KerucutTerpancung() {
            super();
	}

	/**
	 * 
	 */
	private double tinggi;

	/**
	 * 
	 */
	private Lingkaran alas;

	/**
	 * 
	 */
	private Kerucut pancungan;
        
        /**
         * Volume and surface area storage
         */
        private double volume, luas_permukaan;

	/**
	 * @param radius 
	 * @param tinggi 
	 * @param pancungan
	 */
	public KerucutTerpancung(double radius, double tinggi, Kerucut pancungan) {
		super(radius, tinggi);
                this.pancungan = pancungan;
	}

	/**
	 * @param radius 
	 * @param tinggi 
	 * @param pancungan
	 */
	public KerucutTerpancung(int radius, int tinggi, Kerucut pancungan) {
		super(radius, tinggi);
                this.pancungan = pancungan;
	}

	/**
	 * @return
	 */
	@Override
	public double menghitungVolume() {
		double volumeBesar = super.menghitungVolume();
                double volumeKecil = pancungan.menghitungVolume();
		this.volume = volumeBesar - volumeKecil;
                return this.volume;
	}

	/**
	 * @param radiusBesar
	 * @param radiusKecil
	 * @param tinggiTotal
	 * @return
	 */
	public double menghitungVolume(double radiusBesar, double radiusKecil, double tinggiTotal) {
		// Use parent class method for the big cone
		double volumeBesar = super.menghitungVolume(radiusBesar, tinggiTotal);
		
		// Calculate height of small cone
		double tinggiKecil = tinggiTotal * radiusKecil / (radiusBesar - radiusKecil);
		
		// Use parent class method for the small cone
		double volumeKecil = super.menghitungVolume(radiusKecil, tinggiKecil);
		
		return volumeBesar - volumeKecil;
	}

	/**
	 * @param radiusBesar
	 * @param radiusKecil
	 * @param tinggiTotal 
	 * @return
	 */
	public double menghitungVolume(int radiusBesar, int radiusKecil, int tinggiTotal) {
		// Use parent class method for the big cone
		double volumeBesar = super.menghitungVolume(radiusBesar, tinggiTotal);
		
		// Calculate height of small cone
		double tinggiKecil = tinggiTotal * radiusKecil / (radiusBesar - radiusKecil);
		
		// Use parent class method for the small cone
		double volumeKecil = super.menghitungVolume(radiusKecil, (int)tinggiKecil);
		
		return volumeBesar - volumeKecil;
	}

	/**
	 * @return
	 */
	@Override
	public double menghitungLuasPermukaan() {
		double radiusBesar = super.getRadius();
		double radiusKecil = pancungan.getRadius();
		
		// Calculate slant height
		double sisiMiringBesar = Math.sqrt(Math.pow(super.getRadius(), 2) + Math.pow(this.tinggi, 2));
		double sisiMiringKecil = Math.sqrt(Math.pow(radiusKecil, 2) + Math.pow(pancungan.menghitungVolume() * 3 / (Math.PI * radiusKecil * radiusKecil), 2));
		
		// Calculate lateral surface area (selimut)
		double luasSelimut = Math.PI * (radiusBesar + radiusKecil) * (sisiMiringBesar - sisiMiringKecil);
		
		// Calculate areas of bases using Lingkaran's area calculation
		double luasAlasBesar = super.menghitungLuas(radiusBesar);
		double luasAlasKecil = super.menghitungLuas(radiusKecil);
		
		this.luas_permukaan = luasSelimut + luasAlasBesar - luasAlasKecil;
		return this.luas_permukaan;
	}

	/**
	 * @param radiusBesar
	 * @param radiusKecil
	 * @param tinggiTotal
	 * @return
	 */
	public double menghitungLuasPermukaan(double radiusBesar, double radiusKecil, double tinggiTotal) {
		// Calculate slant height using Pythagorean theorem
		double sisiMiring = Math.sqrt(Math.pow(tinggiTotal, 2) + Math.pow(radiusBesar - radiusKecil, 2));
		
		// Calculate lateral surface area (selimut)
		double luasSelimut = Math.PI * (radiusBesar + radiusKecil) * sisiMiring;
		
		// Calculate areas of bases using Lingkaran's area calculation
		double luasAlasBesar = super.menghitungLuas(radiusBesar);
		double luasAlasKecil = super.menghitungLuas(radiusKecil);
		
		return luasSelimut + luasAlasBesar + luasAlasKecil;
	}

	/**
	 * @param radiusBesar
	 * @param radiusKecil
	 * @param tinggiTotal
	 * @return
	 */
	public double menghitungLuasPermukaan(int radiusBesar, int radiusKecil, int tinggiTotal) {
		// Call the double version to avoid code duplication
		return menghitungLuasPermukaan((double)radiusBesar, (double)radiusKecil, (double)tinggiTotal);
	}

	/**
	 * @return
	 */
	@Override
	public void mencetakVolume() {
		System.out.println("Volume Kerucut Terpancung: " + this.volume);
	}

	/**
	 * @return
	 */
	@Override
	public void mencetakLuasPermukaan() {
		System.out.println("LP Kerucut Terpancung: " + this.luas_permukaan);
	}
}