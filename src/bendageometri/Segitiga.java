package BendaGeometri;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Segitiga extends Benda2D {

	/**
	 * Default constructor
	 */
	public Segitiga() {
	}

	/**
	 * 
	 */
	private double alas;

	/**
	 * 
	 */
	private double tinggi;



	/**
	 * @param alas 
	 * @param tinggi
	 */
	public Segitiga(double alas, double tinggi) {
		// TODO implement here
	}

	/**
	 * @param alas 
	 * @param tinggi
	 */
	public Segitiga(int alas, double tinggi) {
		// TODO implement here
	}

	/**
	 * @param alas 
	 * @param tinggi
	 */
	public Segitiga(double alas, double tinggi) {
		// TODO implement here
	}

	/**
	 * @param alas 
	 * @param tinggi
	 */
	public Segitiga(int alas, int tinggi) {
		// TODO implement here
	}

	/**
	 * @param alas
	 */
	public void aturAlas(double alas) {
		// TODO implement here
	}

	/**
	 * @param alas
	 */
	public void aturAlas(int alas) {
		// TODO implement here
	}

	/**
	 * @param alas
	 */
	public void aturTinggi(double alas) {
		// TODO implement here
	}

	/**
	 * @param alas
	 */
	public void aturTinggi(int alas) {
		// TODO implement here
	}

	/**
	 * @return
	 */
	public void cetakAlas() {
		// TODO implement here
		return null;
	}

	/**
	 * @return
	 */
	public void cetakTinggi() {
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