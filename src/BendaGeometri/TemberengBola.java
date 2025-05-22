package BendaGeometri;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class TemberengBola extends Bola implements IBenda3D {

	/**
	 * Default constructor
	 */
	public TemberengBola() {
		super();
	}

	/**
	 * 
	 */
	private double tinggi, volume, luas_permukaan;

	/**
	 * @param radius 
	 * @param tinggi
	 */
	public TemberengBola(double radius, double tinggi) {
		super(radius);
		this.tinggi = tinggi;
	}

	/**
	 * @param radius 
	 * @param tinggi
	 */
	public TemberengBola(int radius, int tinggi) {
		super(radius);
		this.tinggi = tinggi;
	}

	/**
	 * @return
	 */
	@Override
	public double menghitungVolume() {
		// Formula for volume of spherical segment:
		// V = (1/3) * π * h² * (3r - h)
		// where h is height of segment, r is radius of sphere
		double r = super.getRadius();
		this.volume = (Math.PI * tinggi * tinggi * (3 * r - tinggi)) / 3.0;
		return this.volume;
	}

	/**
	 * @param tinggi 
	 * @return
	 */
	public double menghitungVolume(double tinggi) {
		double r = super.getRadius();
		return (Math.PI * tinggi * tinggi * (3 * r - tinggi)) / 3.0;
	}

	/**
	 * @param radius 
	 * @param tinggi
	 * @return
	 */
	public double menghitungVolume(double radius, double tinggi) {
		return (Math.PI * tinggi * tinggi * (3 * radius - tinggi)) / 3.0;
	}

	/**
	 * @param radius 
	 * @param tinggi
	 * @return
	 */
	public double menghitungVolume(int radius, int tinggi) {
		return (Math.PI * tinggi * tinggi * (3 * radius - tinggi)) / 3.0;
	}

	/**
	 * @return
	 */
	@Override
	public double menghitungLuasPermukaan() {
		// Formula for surface area of spherical segment:
		// A = 2πrh (curved part) + π(r²-a²) (circular base)
		// where a² = r² - h²
		double r = super.getRadius();
		double a = Math.sqrt(r * r - (r - tinggi) * (r - tinggi));
		this.luas_permukaan = 2 * Math.PI * r * tinggi + Math.PI * a * a;
		return this.luas_permukaan;
	}

	/**
	 * @param tinggi 
	 * @return
	 */
	public double menghitungLuasPermukaan(double tinggi) {
		double r = super.getRadius();
		double a = Math.sqrt(r * r - (r - tinggi) * (r - tinggi));
		return 2 * Math.PI * r * tinggi + Math.PI * a * a;
	}

	/**
	 * @param radius 
	 * @param tinggi
	 * @return
	 */
	public double menghitungLuasPermukaan(double radius, double tinggi) {
		double a = Math.sqrt(radius * radius - (radius - tinggi) * (radius - tinggi));
		return 2 * Math.PI * radius * tinggi + Math.PI * a * a;
	}

	/**
	 * @param radius 
	 * @param tinggi
	 * @return
	 */
	public double menghitungLuasPermukaan(int radius, int tinggi) {
		double a = Math.sqrt(radius * radius - (radius - tinggi) * (radius - tinggi));
		return 2 * Math.PI * radius * tinggi + Math.PI * a * a;
	}

	/**
	 * @return
	 */
	@Override
	public void mencetakVolume() {
		System.out.println("Volume Tembereng Bola: " + this.volume);
	}

	/**
	 * @return
	 */
	@Override
	public void mencetakLuasPermukaan() {
		System.out.println("LP Tembereng Bola: " + this.luas_permukaan);
	}
}