package BendaGeometri;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Bola extends Lingkaran implements IBenda3D {

	/**
	 * Default constructor
	 */
	public Bola() {
	}

	/**
	 * 
	 */
	private double radius;

	/**
	 * @param radius
	 */
	public Bola(double radius) {
		// TODO implement here
	}

	/**
	 * @param radius
	 */
	public Bola(int radius) {
		// TODO implement here
	}

	/**
	 * @return
	 */
	public float menghitungVolume() {
		// TODO implement here
		return 0.0f;
	}

	/**
	 * @param params 
	 * @return
	 */
	public double menghitungVolume(double[] params) {
		// TODO implement here
		return 0.0d;
	}

	/**
	 * @param params 
	 * @return
	 */
	public double menghitungVolume(int[] params) {
		// TODO implement here
		return 0.0d;
	}

	/**
	 * @return
	 */
	public float menghitungLuasPermukaan() {
		// TODO implement here
		return 0.0f;
	}

	/**
	 * @param params 
	 * @return
	 */
	public double menghitungLuasPermukaan(double[] params) {
		// TODO implement here
		return 0.0d;
	}

	/**
	 * @param params 
	 * @return
	 */
	public double menghitungLuasPermukaan(int[] params) {
		// TODO implement here
		return 0.0d;
	}

	/**
	 * @return
	 */
	public void mencetakVolume() {
		// TODO implement here
		return null;
	}

	/**
	 * @return
	 */
	public void mencetakLuasPermukaan() {
		// TODO implement here
		return null;
	}

	/**
	 * 
	 */
	public abstract void menghitungVolume(in params:double[ ]): double();

	/**
	 * 
	 */
	public abstract void menghitungVolume(in params:int[ ]): double();

	/**
	 * 
	 */
	public abstract void menghitungLuasPermukaan(): float();

	/**
	 * 
	 */
	public abstract void menghitungLuasPermukaan(in params:double[ ]): double();

	/**
	 * 
	 */
	public abstract void menghitungLuasPermukaan(in params:int[ ]): double();

	/**
	 * 
	 */
	public abstract void mencetakVolume(): void();

	/**
	 * 
	 */
	public abstract void mencetakLuasPermukaan(): void();

}