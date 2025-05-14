package BendaGeometri;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class LimasLayangLayang extends LayangLayang implements IBenda3D {

	// Height of the pyramid
	public double tinggi;

	/**
	 * Default constructor
	 */
	public LimasLayangLayang() {
	}

	/**
	 * Constructor with parameters
	 * @param diagonal1 
	 * @param diagonal2 
	 * @param tinggi
	 */
	public LimasLayangLayang(double diagonal1, double diagonal2, double sisiPendek, double sisiPanjang, double tinggi) {
		super(diagonal1, diagonal2, sisiPendek, sisiPanjang); // Initialize the base (LayangLayang)
		this.tinggi = tinggi; // Initialize the height
	}

	/**
	 * Calculate the volume of the pyramid
	 * @return
	 */
	@Override
	public double menghitungVolume() {
		double baseArea = super.getLuas(); // Get the base area from LayangLayang
		return (1.0 / 3.0) * baseArea * tinggi;
	}

	/**
	 * Calculate the volume of the pyramid with given parameters
	 * @param params 
	 * @return
	 */
	@Override
	public double menghitungVolume(double[] params) {
		if (params.length >= 3) {
			double d1 = params[0];
			double d2 = params[1];
			double height = params[2];
			double baseArea = (d1 * d2) / 2; // Area of the LayangLayang base
			return (1.0 / 3.0) * baseArea * height;
		}
		return 0.0;
	}

	/**
	 * Calculate the volume of the pyramid with given parameters
	 * @param params 
	 * @return
	 */
	@Override
	public double menghitungVolume(int[] params) {
		if (params.length >= 3) {
			double d1 = params[0];
			double d2 = params[1];
			double height = params[2];
			double baseArea = (d1 * d2) / 2; // Area of the LayangLayang base
			return (1.0 / 3.0) * baseArea * height;
		}
		return 0.0;
	}

	/**
	 * Calculate the surface area of the pyramid
	 * @return
	 */
	@Override
	public double menghitungLuasPermukaan() {
		double baseArea = super.getLuas(); // Get the base area from LayangLayang
		double sideLength1 = super.getSisi1(); // Get one side length of the LayangLayang
		double sideLength2 = super.getSisi2(); // Get the other side length of the LayangLayang
		double slantHeight1 = Math.sqrt(Math.pow(tinggi, 2) + Math.pow(sideLength1 / 2, 2));
		double slantHeight2 = Math.sqrt(Math.pow(tinggi, 2) + Math.pow(sideLength2 / 2, 2));
		double lateralArea = (sideLength1 * slantHeight1) + (sideLength2 * slantHeight2);
		return baseArea + lateralArea;
	}

	/**
	 * Calculate the surface area of the pyramid with given parameters
	 * @param params 
	 * @return
	 */
	@Override
	public double menghitungLuasPermukaan(double[] params) {
		if (params.length >= 4) {
			double d1 = params[0];
			double d2 = params[1];
			double height = params[2];
			double sideLength = params[3];
			double baseArea = (d1 * d2) / 2;
			double slantHeight = Math.sqrt(Math.pow(height, 2) + Math.pow(sideLength / 2, 2));
			double lateralArea = 4 * (0.5 * sideLength * slantHeight);
			return baseArea + lateralArea;
		}
		return 0.0;
	}

	/**
	 * Calculate the surface area of the pyramid with given parameters
	 * @param params 
	 * @return
	 */
	@Override
	public double menghitungLuasPermukaan(int[] params) {
		if (params.length >= 4) {
			double d1 = params[0];
			double d2 = params[1];
			double height = params[2];
			double sideLength = params[3];
			double baseArea = (d1 * d2) / 2;
			double slantHeight = Math.sqrt(Math.pow(height, 2) + Math.pow(sideLength / 2, 2));
			double lateralArea = 4 * (0.5 * sideLength * slantHeight);
			return baseArea + lateralArea;
		}
		return 0.0;
	}

	/**
	 * Print the volume of the pyramid
	 * @return
	 */
	@Override
	public void mencetakVolume() {
		System.out.println("Volume: " + menghitungVolume());
	}

	/**
	 * Print the surface area of the pyramid
	 * @return
	 */
	@Override
	public void mencetakLuasPermukaan() {
		System.out.println("Luas Permukaan: " + menghitungLuasPermukaan());
	}
}