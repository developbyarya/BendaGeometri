package BendaGeometri;
import java.io.*;
import java.util.*;
public class Lingkaran extends Benda2D {

	private double radius;

	public Lingkaran() {
		this.radius = 0;
	}

	public Lingkaran(double radius) {
		this.radius = radius;
	}

	public Lingkaran(int radius) {
		this.radius = radius;
	}

	public void cetakRadius() {
		System.out.println("Radius: " + this.radius);
	}

	public void aturRadius(double radius) {
		this.radius = radius;
	}

	public void aturRadius(int radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return this.radius;
	}
	@Override
	public float menghitungLuas() {
		return (float) (Math.PI * this.radius * this.radius);
	}
	@Override
	public double menghitungLuas(double[] params) {
		if (params.length >= 1) {
			return Math.PI * params[0] * params[0];
		}
		return 0.0;
	}

	@Override
	public double menghitungLuas(int[] params) {
		if (params.length >= 1) {
			return Math.PI * params[0] * params[0];
		}
		return 0.0;
	}

	@Override
	public float menghitungKeliling() {
		return (float) (2 * Math.PI * this.radius);
	}

	@Override
	public double menghitungKeliling(double[] params) {
		if (params.length >= 1) {
			return 2 * Math.PI * params[0];
		}
		return 0.0;
	}

	@Override
	public double menghitungKeliling(int[] params) {
		if (params.length >= 1) {
			return 2 * Math.PI * params[0];
		}
		return 0.0;
	}

	@Override
	public void mencetakLuas() {
		System.out.println("Luas Lingkaran: " + menghitungLuas());
	}

	@Override
	public void mencetakKeliling() {
		System.out.println("Keliling Lingkaran: " + menghitungKeliling());
	}
}
