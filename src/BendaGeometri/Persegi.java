package BendaGeometri;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Persegi extends Benda2D {

	/**
	 * Default constructor
	 */
	public Persegi() {
	}

	/**
	 * 
	 */
	private double sisi;

	/**
	 * @param sisi
	 */
	public Persegi(double sisi) {
		// TODO implement here
	}

	/**
	 * @param sisi
	 */
	public Persegi(int sisi) {
		// TODO implement here
	}

	/**
	 * @return
	 */
	public void cetakSisi() {
		// TODO implement here
		return null;
	}

	/**
	 * @param sisi 
	 * @return
	 */
	public void aturSisi(double sisi) {
		// TODO implement here
		return null;
	}

	/**
	 * @param sisi 
	 * @return
	 */
	public void aturSisi(int sisi) {
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
	public void mencetakLuas() {
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