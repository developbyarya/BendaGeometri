package BendaGeometri;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Kerucut extends Lingkaran implements IBenda3D {

	/**
	 * Default constructor
	 */
	public Kerucut() {
	}

	/**
	 * 
	 */
	private double tinggi;

	/**
	 * 
	 */
	private Lingkaran bendaAlas;

	/**
	 * @param bendaAlas 
	 * @param tinggi
	 */
	public Kerucut(Lingkaran bendaAlas, double tinggi) {
		// TODO implement here
	}

	/**
	 * @param bendaAlas 
	 * @param tinggi
	 */
	public Kerucut(Lingkaran bendaAlas, int tinggi) {
		// TODO implement here
	}

	/**
	 * @return
	 */
	@Override
	public float menghitungVolume() {
		// TODO implement here
		return 0.0f;
	}

	/**
	 * @param params 
	 * @return
	 */
	@Override
	public double menghitungVolume(double params) {
		// TODO implement here
		return 0.0d;
	}

	/**
	 * @param params 
	 * @return
	 */
	@Override
	public double menghitungVolume(int params) {
		// TODO implement here
		return 0.0d;
	}

	/**
	 * @return
	 */
	@Override
	public float menghitungLuasPermukaan() {
		// TODO implement here
		return 0.0f;
	}

	/**
	 * @param params 
	 * @return
	 */
	@Override
	public double menghitungLuasPermukaan(double params) {
		// TODO implement here
		return 0.0d;
	}

	/**
	 * @param params 
	 * @return
	 */
	@Override
	public double menghitungLuasPermukaan(int params) {
		// TODO implement here
		return 0.0d;
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