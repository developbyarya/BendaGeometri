package BendaGeometri;

import java.io.*;
import java.util.*;

/**
 * 
 */
public interface IBenda3D {

	/**
	 * 
	 */
	public abstract double menghitungVolume(double params[]);
	public abstract double menghitungVolume();

	/**
	 * 
	 */
	public abstract double menghitungVolume(int params[]);

	/**
	 * 
	 */
	public abstract double menghitungLuasPermukaan();

	/**
	 * 
	 */
	public abstract double menghitungLuasPermukaan(double params[]);

	/**
	 * 
	 */
	public abstract double menghitungLuasPermukaan(int params[]);

	/**
	 * 
	 */
	public abstract void mencetakVolume();

	/**
	 * 
	 */
	public abstract void mencetakLuasPermukaan();

}