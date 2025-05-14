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