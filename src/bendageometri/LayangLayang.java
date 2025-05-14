package BendaGeometri;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class LayangLayang extends Benda2D {

	/**
	 * Default constructor
	 */
	public LayangLayang() {
	}

	/**
	 * 
	 */
	private double diagonal1;

	/**
	 * 
	 */
	private double diagonal2;

	/**
	 * 
	 */
	private double sisiPendek;

	/**
	 * 
	 */
	private double sisiPanjang;

	/**
	 * @param diagonal1 
	 * @param diagonal2 
	 * @param sisiPendek 
	 * @param sisiPanjang
	 */
	public LayangLayang(double diagonal1, double diagonal2, double sisiPendek, double sisiPanjang) {
		// TODO implement here
	}

	/**
	 * @param diagonal1 
	 * @param diagonal2 
	 * @param sisiPendek 
	 * @param sisiPanjang
	 */
	public LayangLayang(int diagonal1, int diagonal2, int sisiPendek, int sisiPanjang) {
		// TODO implement here
	}

	/**
	 * @return
	 */
	public void cetakDiagonal1() {
		// TODO implement here
		return null;
	}

	/**
	 * @return
	 */
	public void cetakDiagonal2() {
		// TODO implement here
		return null;
	}

	/**
	 * @return
	 */
	public void cetakSisiPendek() {
		// TODO implement here
		return null;
	}

	/**
	 * @return
	 */
	public void cetakSisiPanjang() {
		// TODO implement here
		return null;
	}

	/**
	 * @param diagonal1 
	 * @return
	 */
	public void aturDiagonal1(double diagonal1) {
		// TODO implement here
		return null;
	}

	/**
	 * @param diagonal1 
	 * @return
	 */
	public void aturDiagonal1(int diagonal1) {
		// TODO implement here
		return null;
	}

	/**
	 * @param diagonal2 
	 * @return
	 */
	public void aturDiagonal2(double diagonal2) {
		// TODO implement here
		return null;
	}

	/**
	 * @param diagonal2 
	 * @return
	 */
	public void aturDiagonal2(int diagonal2) {
		// TODO implement here
		return null;
	}

	/**
	 * @param sisiPendek 
	 * @return
	 */
	public void aturSisiPendek(double sisiPendek) {
		// TODO implement here
		return null;
	}

	/**
	 * @param sisiPendek 
	 * @return
	 */
	public void aturSisiPendek(int sisiPendek) {
		// TODO implement here
		return null;
	}

	/**
	 * @param sisiPanjang 
	 * @return
	 */
	public void aturSisiPanjang(double sisiPanjang) {
		// TODO implement here
		return null;
	}

	/**
	 * @param sisiPanjang 
	 * @return
	 */
	public void aturSisiPanjang(int sisiPanjang) {
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