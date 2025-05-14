package BendaGeometri;

import java.io.*;
import java.util.*;

/**
 * 
 */
public abstract class Benda2D {

	/**
	 * Default constructor
	 */
	public Benda2D() {
	}

	/**
	 * 
	 */
	private float luas;

	/**
	 * 
	 */
	private float Keliling;

	/**
	 * 
	 */
	private String namaBenda;

	/**
	 * 
	 */
	private String warnaBenda;

	/**
	 * @param namaBenda
	 */
	public Benda2D(String namaBenda) {
		// TODO implement here
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