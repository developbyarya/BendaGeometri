package BendaGeometri;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class PersegiPanjang extends Benda2D {

	/**
	 * Default constructor
	 */
	public PersegiPanjang() {
	}

	/**
	 * 
	 */
	private double panjang;

	/**
	 * 
	 */
	private double lebar;

	/**
	 * @param panjang 
	 * @param lebar
	 */
	public PersegiPanjang(double panjang, double lebar) {
		// TODO implement here
	}

	/**
	 * @param panjang 
	 * @param lebar
	 */
	public PersegiPanjang(int panjang, double lebar) {
		// TODO implement here
	}

	/**
	 * @param panjang 
	 * @param lebar
	 */
	public PersegiPanjang(double panjang, int lebar) {
		// TODO implement here
	}

	/**
	 * @param panjang 
	 * @param lebar
	 */
	public PersegiPanjang(int panjang, int lebar) {
		// TODO implement here
	}

	/**
	 * @return
	 */
	public void cetakPanjang() {
		// TODO implement here
		return null;
	}

	/**
	 * @return
	 */
	public void cetakLebar() {
		// TODO implement here
		return null;
	}

	/**
	 * @param panjang 
	 * @return
	 */
	public void aturPanjang(double panjang) {
		// TODO implement here
		return null;
	}

	/**
	 * @param panjang 
	 * @return
	 */
	public void aturPanjang(int panjang) {
		// TODO implement here
		return null;
	}

	/**
	 * @param lebar 
	 * @return
	 */
	public void aturLebar(double lebar) {
		// TODO implement here
		return null;
	}

	/**
	 * @param lebar 
	 * @return
	 */
	public void aturLebar(int lebar) {
		// TODO implement here
		return null;
	}

	/**
	 * @param params 
	 * @return
	 */
	public double menghitungLuas(double[] params) {
		// TODO implement here
		return 0.0d;
	}

	/**
	 * @param params 
	 * @return
	 */
	public double menghitungLuas(int[] params) {
		// TODO implement here
		return 0.0d;
	}

	/**
	 * @return
	 */
	public float menghitungKeliling() {
		// TODO implement here
		return 0.0f;
	}

	/**
	 * @param params 
	 * @return
	 */
	public double menghitungKeliling(double[] params) {
		// TODO implement here
		return 0.0d;
	}

	/**
	 * @param params 
	 * @return
	 */
	public double menghitungKeliling(int[] params) {
		// TODO implement here
		return 0.0d;
	}

	/**
	 * @return
	 */
	public void mencetakLuas() {
		// TODO implement here
		return null;
	}

	/**
	 * @return
	 */
	public void mencetakKeliling() {
		// TODO implement here
		return null;
	}

	/**
	 * @param params 
	 * @return
	 */
	public abstract double menghitungLuas(double[] params);

	/**
	 * @param params 
	 * @return
	 */
	public abstract double menghitungLuas(int[] params);

	/**
	 * @return
	 */
	public abstract float menghitungKeliling();

	/**
	 * @param params 
	 * @return
	 */
	public abstract double menghitungKeliling(double[] params);

	/**
	 * @param params 
	 * @return
	 */
	public abstract double menghitungKeliling(int[] params);

	/**
	 * @return
	 */
	public abstract void mencetakLuas();

	/**
	 * @return
	 */
	public abstract void mencetakKeliling();

}