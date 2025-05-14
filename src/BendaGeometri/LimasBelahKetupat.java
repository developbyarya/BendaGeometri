package BendaGeometri;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class LimasBelahKetupat extends BelahKetupat implements IBenda3D {

	/**
	 * Default constructor
	 */
	public LimasBelahKetupat() {
	}

	/**
	 * 
	 */
	private double tinggi;

	/**
	 * 
	 */

	/**
	 * @param bendaAlas 
	 * @param tinggi
	 */
	public LimasBelahKetupat(double tinggi) {
		// TODO implement here
		this.tinggi = tinggi;
	}

	/**
	 * @param bendaAlas 
	 * @param tinggi
	 */
	public LimasBelahKetupat(BelahKetupat bendaAlas, int tinggi) {
		// TODO implement here
	}

	// Implementing menghitungVolume methods
	@Override
	public double menghitungVolume(double[] params) {
		// Contoh : params[0] is base area and params[1] is height
		if (params.length >= 2) {
			return (1.0 / 3.0) * params[0] * params[1];
		}
		return 0;
	}

	@Override
	public double menghitungVolume() {
		// Example implementation: Assuming tinggi and base area are already set
		super.menghitungLuas(); // Assuming BelahKetupat has a getLuas() method
		return (1.0 / 3.0) * super.getLuas() * tinggi;
	}

	@Override
	public double menghitungVolume(int[] params) {
		// Example implementation: Assuming params[0] is base area and params[1] is height
		if (params.length >= 2) {
			return (1.0 / 3.0) * params[0] * params[1];
		}
		return 0;
	}

	// Implementing menghitungLuasPermukaan methods
	@Override
	public double menghitungLuasPermukaan() {
		// Example implementation: Assuming base area and lateral area are calculated
		double baseArea = super.getLuas(); // Assuming BelahKetupat has a getLuas() method
		double lateralArea = calculateLateralArea(); // Custom method to calculate lateral area
		return baseArea + lateralArea;
	}

	@Override
	public double menghitungLuasPermukaan(double[] params) {
		// Example implementation: Assuming params[0] is base area and params[1] is lateral area
		if (params.length >= 2) {
			return params[0] + params[1];
		}
		return 0;
	}

	@Override
	public double menghitungLuasPermukaan(int[] params) {
		// Example implementation: Assuming params[0] is base area and params[1] is lateral area
		if (params.length >= 2) {
			return params[0] + params[1];
		}
		return 0;
	}

	// Implementing mencetakVolume method
	@Override
	public void mencetakVolume() {
		System.out.println("Volume: " + menghitungVolume());
	}

	// Implementing mencetakLuasPermukaan method
	@Override
	public void mencetakLuasPermukaan() {
		System.out.println("Luas Permukaan: " + menghitungLuasPermukaan());
	}

	// Example helper method to calculate lateral area
	private double calculateLateralArea() {
		// Get the side length of the rhombus (assuming BelahKetupat has a method to calculate it)
		double sideLength = super.getSisi(); // Assuming getSisi() returns the side length of the rhombus
	
		// Calculate the slant height (assuming tinggi is the perpendicular height of the pyramid)
		double diagonal1 = super.getDiagonal1(); // Assuming getDiagonal1() returns the first diagonal of the rhombus
		double diagonal2 = super.getDiagonal2(); // Assuming getDiagonal2() returns the second diagonal of the rhombus
		double slantHeight = Math.sqrt(Math.pow(tinggi, 2) + Math.pow((diagonal1 / 2), 2));
	
		// Calculate the area of one triangular face
		double triangleArea = 0.5 * sideLength * slantHeight;
	
		// Total lateral area (4 triangular faces)
		return 4 * triangleArea;
	}
}