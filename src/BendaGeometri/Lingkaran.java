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

	public double menghitungLuas(double radius) {
			return Math.PI * radius * radius;
	}

	public double menghitungLuas(int radius) {
			return Math.PI * radius * radius;
		}


	@Override
	public float menghitungKeliling() {
		return (float) (2 * Math.PI * this.radius);
	}

	public double menghitungKeliling(double radius) {
		return 2 * Math.PI * radius;
	}

	public double menghitungKeliling(int radius) {
		return 2 * Math.PI * radius;
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
